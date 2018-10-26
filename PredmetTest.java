package com.company;

import org.junit.jupiter.api.Test;

import static com.company.Predmet.getMax_br;
import static org.junit.jupiter.api.Assertions.*;

class PredmetTest {

    @Test
    void upisi() {
        Predmet predmet=new Predmet("mlti",5,3);
        Student s=new Student("Samra","Mujcinovic",18187);
        predmet.upisi(s);
        assertEquals(1,predmet.vel);
    }

    @org.junit.jupiter.api.Test
    void ispisi() {
        Predmet predmet=new Predmet("Mlti",1,3);
        Student student=new Student("Pero","Peric",18456);
        predmet.upisi(student);
        predmet.upisi(new Student("neko","nekic",18457));
        assertEquals(2,predmet.vel);
        predmet.ispisi(student);
        assertEquals(1,predmet.vel);
    }

}