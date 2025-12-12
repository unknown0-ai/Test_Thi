package com.example.Thi_SOF3041;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddSongTest {
    AddSong addSong;

    @BeforeEach
    public void setup(){
        addSong = new AddSong();
    }

    @Test
    public void BVAAdd_HL(){
        assertTrue(addSong.Add("BH1","GetOut","Phu",20,"Kpop"));
    }
    @Test
    public void EPAdd_KHL(){
        assertThrows(IllegalArgumentException.class,()->addSong.Add("BH2","Dagestan12","Unknown",12,"rap"));
    }
    @Test
    public void EPAdd_KHL2(){
        assertThrows(IllegalArgumentException.class,()->addSong.Add("BH2","Dagestan12","Unknown",-12,"rap"));
    }
    @Test
    public void EPAdd_KHL3(){
        assertThrows(IllegalArgumentException.class,()->addSong.Add("BH3","Dagestan","pepu",101,"rock"));
    }
    @Test
    public void BVA_KHL4(){
        assertThrows(IllegalArgumentException.class,()->addSong.Add("BH3","Dagestan","pepu12",101,"rock"));
    }

}