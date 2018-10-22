package com.company;

public class Program {

    public static void main(String[] args) {
	Predmet rpr=new Predmet("Razvoj programskih rjesenja",4,20);
	Student s1=new Student("Pero","Peric",18425);
	rpr.upisi(s1);
	Student s2=new Student("Neko","Nekic",18452);
	rpr.upisi(s2);
	Student s3=new Student("Ivo","Ivkovic",18256);
	rpr.upisi(s3);
	rpr.IspisiNiz();
	rpr.ispisi(s3);
	rpr.IspisiNiz();
	s1.Ispisi();
    }
}
