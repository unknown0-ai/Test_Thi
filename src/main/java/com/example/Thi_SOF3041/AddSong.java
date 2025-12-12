package com.example.Thi_SOF3041;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AddSong {

    public boolean Add(String ma,String ten,String tencasi,float thoiluong,String theloai){
        List<BaiHat> List= new ArrayList<>();
        if(ma == null){
            throw new IllegalArgumentException("Ma khong duoc de trong");
        }if(ten == null){
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }if(tencasi == null){
            throw new IllegalArgumentException("ten ca si khong duoc de trong");
        }if(thoiluong == 0){
            throw new IllegalArgumentException("Thoi luong khong duoc de trong");
        }if(theloai == null){
            throw new IllegalArgumentException("The loai khong duoc de trong");
        }
        if(thoiluong < 0||thoiluong>100){
            throw new IllegalArgumentException("Thoi luong khong hop le ");
        }if(!ten.matches("^[a-zA-Z]{1,9}$")){
            throw new IllegalArgumentException(("ten khong duoc chua ky tu dac biet"));
        }if(!tencasi.matches("^[a-zA-Z]{1,9}$")){
            throw  new IllegalArgumentException("Ten ca si khong duoc chua ky tu dac biet");
        }
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("mm:ss");
        double roundvalue = (double) Math.round(thoiluong*100)/100.0;
        BaiHat baihat = new BaiHat();
        baihat.setMa(ma);
        baihat.setTen(ten);
        baihat.setTenCasi(tencasi);
        baihat.setThoiluong(thoiluong);
        baihat.setTheloai(theloai);
         List.add(baihat);
        System.out.println(List.get(0).getThoiluong());
        return true;
    }
}
