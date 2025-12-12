package com.example.Thi_SOF3041;

public class Diem {
    public String Diem(int diem){
        if(diem > 10){
            throw new IllegalArgumentException("diem khong duoc lon hon 10");
        }
        if(diem < 0){
            throw new IllegalArgumentException("diem khong duoc be hon 0");
        }
        if(diem >=9){
            return "Xuất sắc";
        }else if(diem>=7&&diem < 9){
            return "Giỏi";
        }else if(diem>=5&&diem<=7){
            return "trung bình";
        }else{
            return "Yếu";
        }
    }
}
