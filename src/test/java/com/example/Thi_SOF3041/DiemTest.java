package com.example.Thi_SOF3041;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DiemTest {
    Diem diem;
    @BeforeEach
    public void setup(){
        diem = new Diem();
    }
    @Test
    public void BVATest_HL(){
        String result = diem.Diem(9);
        String expected = "Xuất sắc";
        Assert.assertEquals(expected,result);
    }

    @Test
    public void BVATest_KHL(){
        assertThrows(IllegalArgumentException.class,()-> diem.Diem(-1));
    }
    @Test
    public void BVATest_KHL2(){
        assertThrows(IllegalArgumentException.class,()-> diem.Diem(11));

    }
    @Test
    public void BVATest_HL3(){
        String result = diem.Diem(4);
        String expected = "Yếu";
        Assert.assertEquals(expected,result);
    }
    @Test
    public void EPTest_KHL(){
        assertThrows(IllegalArgumentException.class,()-> diem.Diem(-2));
    }

}
