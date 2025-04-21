package labtuan3.BAI3;

public class DemoCoordinate {
    public static void main(String[] args) {
        Coordinate point1 = new Coordinate();
        System.out.print("Taa do diem 1: ");
        point1.print();
        
        Coordinate point2 = new Coordinate(3, 4);
        System.out.print("Toa do diem 2: ");
        point2.print();
        
        Coordinate point3 = new Coordinate();
        point3.input();
        System.out.print("Toa do diem 3: ");
        point3.print();
        
        Coordinate sumPoint = point2.sum(point3);
        System.out.print("Tong diem 2 va diem 3: ");
        sumPoint.print();
       
        Coordinate symmetricPoint = point3.symmetricX();
        System.out.print("Diem doi xung cua diem 3 qua truc hoanh: ");
        symmetricPoint.print();
    }
}
