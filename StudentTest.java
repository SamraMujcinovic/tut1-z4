package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void ispisi() {
        Student s=new Student("Samra","Mujcinovic",18187);
        assertEquals("Mujcinovic Samra (18187)\n",s.Ispisi());
    }
}