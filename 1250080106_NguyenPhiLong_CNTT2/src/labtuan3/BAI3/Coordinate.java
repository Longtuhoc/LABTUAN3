package labtuan3.BAI3;

import java.util.Scanner;
public class Coordinate {
    private double x;
    private double y;
    
    public double getX() {
        return x;
    }
    
    public void setX(double x) {
        this.x = x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setY(double y) {
        this.y = y;
    }
    
    public Coordinate() {
        this.x = 0;
        this.y = 0;
    }
    
    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Coordinate(Coordinate tmp) {
        this.x = tmp.x;
        this.y = tmp.y;
    }
    
    public Coordinate sum(Coordinate other) {
        Coordinate result = new Coordinate();
        result.x = this.x + other.x;
        result.y = this.y + other.y;
        return result;
    }
    
    public Coordinate symmetricX() {
        return new Coordinate(this.x, -this.y);
    }
    
    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap hoanh do x: ");
        this.x = sc.nextDouble();
        System.out.print("Nhap tung do y: ");
        this.y = sc.nextDouble();
    }
}