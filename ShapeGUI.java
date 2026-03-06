//  Chapter Eleven  Shape GUI Program
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeGUI extends JFrame {
    private JButton randomMessageButton;
    private JButton createShapeButton;
    private JButton switchShapeButton;
    private JComboBox<String> shapeComboBox;
    private JTextField dimensionField1;
    private JTextField dimensionField2;
    private JLabel resultLabel;
    private JLabel currentShapeLabel;
    
    private Shape currentShape;
    private String[] randomMessages = {
        "Great! You created a shape!",
        "Shape created successfully!",
        "Excellent calculation!",
        "Area computed!",
        "Perfect geometry!"
    };
    
    public ShapeGUI() {
        setTitle("Shape Calculator GUI");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Top Panel - Random Message Button
        JPanel topPanel = new JPanel();
        randomMessageButton = new JButton("Show Random Message");
        randomMessageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String randomMsg = randomMessages[(int)(Math.random() * randomMessages.length)];
                resultLabel.setText(randomMsg);
            }
        });
        topPanel.add(randomMessageButton);
        mainPanel.add(topPanel, BorderLayout.NORTH);
        
        // Center Panel - Shape Selection and Input
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Shape Selection
        gbc.gridx = 0;
        gbc.gridy = 0;
        centerPanel.add(new JLabel("Select Shape:"), gbc);
        
        gbc.gridx = 1;
        shapeComboBox = new JComboBox<>(new String[]{"Circle", "Rectangle"});
        centerPanel.add(shapeComboBox, gbc);
        
        // Dimension 1 (Radius or Width)
        gbc.gridx = 0;
        gbc.gridy = 1;
        centerPanel.add(new JLabel("Radius/Width:"), gbc);
        
        gbc.gridx = 1;
        dimensionField1 = new JTextField(10);
        centerPanel.add(dimensionField1, gbc);
        
        // Dimension 2 (Height for Rectangle)
        gbc.gridx = 0;
        gbc.gridy = 2;
        centerPanel.add(new JLabel("Height (Rectangle):"), gbc);
        
        gbc.gridx = 1;
        dimensionField2 = new JTextField(10);
        centerPanel.add(dimensionField2, gbc);
        
        // Create Shape Button
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        createShapeButton = new JButton("Create Shape & Calculate Area");
        createShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createAndDisplayShape();
            }
        });
        centerPanel.add(createShapeButton, gbc);
        
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        // Bottom Panel - Results and Switch Button
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout(10, 10));
        
        resultLabel = new JLabel("Results will appear here");
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        bottomPanel.add(resultLabel, BorderLayout.CENTER);
        
        currentShapeLabel = new JLabel("Current Shape: None");
        currentShapeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        bottomPanel.add(currentShapeLabel, BorderLayout.NORTH);
        
        switchShapeButton = new JButton("Switch to Random Shape");
        switchShapeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switchToRandomShape();
            }
        });
        bottomPanel.add(switchShapeButton, BorderLayout.SOUTH);
        
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void createAndDisplayShape() {
        try {
            String selectedShape = (String) shapeComboBox.getSelectedItem();
            double dimension1 = Double.parseDouble(dimensionField1.getText());
            
            if (selectedShape.equals("Circle")) {
                if (dimension1 <= 0) {
                    resultLabel.setText("Error: Radius must be positive!");
                    return;
                }
                currentShape = new Circle(dimension1);
            } else {
                double dimension2 = Double.parseDouble(dimensionField2.getText());
                if (dimension1 <= 0 || dimension2 <= 0) {
                    resultLabel.setText("Error: Dimensions must be positive!");
                    return;
                }
                currentShape = new Rectangle(dimension1, dimension2);
            }
            
            currentShapeLabel.setText("Current Shape: " + currentShape.getName());
            resultLabel.setText(currentShape.getDetails());
            
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Please enter valid numbers!");
        }
    }
    
    private void switchToRandomShape() {
        if (Math.random() < 0.5) {
            // Create random circle
            double radius = 1 + Math.random() * 10;
            currentShape = new Circle(radius);
        } else {
            // Create random rectangle
            double width = 1 + Math.random() * 10;
            double height = 1 + Math.random() * 10;
            currentShape = new Rectangle(width, height);
        }
        
        currentShapeLabel.setText("Current Shape: " + currentShape.getName());
        resultLabel.setText(currentShape.getDetails());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShapeGUI();
            }
        });
    }
}
