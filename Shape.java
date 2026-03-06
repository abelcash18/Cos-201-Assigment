//  chapter Eleven Shape Class
// Course code: COS Assignment 
// Name: JOSEPH ABEL OLAYINKA
// Student Id: UB2502252
// Level: 200 Direct-Entry
// Faculty: Faculty Of Computing
// Deparment: Computer-Science
// Date: 24-02-2026

public abstract class Shape {
    protected String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public abstract double calculateArea();
    
    public String getName() {
        return name;
    }
    
    public String getDetails() {
        return name + " - Area: " + String.format("%.2f", calculateArea());
    }
}
