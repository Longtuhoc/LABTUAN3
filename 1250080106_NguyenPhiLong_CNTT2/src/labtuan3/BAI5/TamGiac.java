package labtuan3.BAI5;

public class TamGiac {
    private int a, b, c;

    public TamGiac(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int tinhChuVi(){
        return a + b + c;
    }

    public double tinhDienTich(){
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String loaiTamGiac(){
        if(a == b && b == c){
            return "Tam giac deu";
        } else if(a == b || b == c || a == c){
            return "Tam giac can";
        } else if(laTamGiacVuong()){
            return "Tam giac vuong";
        } else {
            return "Tam giac thuong";
        }
    }

    private boolean laTamGiacVuong(){
        int a2 = a * a, b2 = b * b, c2 = c * c;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }
}

