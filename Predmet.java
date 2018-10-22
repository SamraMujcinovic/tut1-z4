package com.company;

public class Predmet {
    private String predmet;
    private int sifra;
    private static int max_br;
    int vel=0;
    private Student[] niz=new Student[100];
    public Predmet(String predmet, int sifra,int max_br){
        this.setPredmet(predmet);
        this.setSifra(sifra);
        this.setMax_br(max_br);
    }

    public static int getMax_br() {
        return max_br;
    }

    public static void setMax_br(int max_br) {
        Predmet.max_br = max_br;
    }

    public void upisi(Student s){
        if(vel< getMax_br()) getNiz()[vel]=s;
        vel++;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public Student[] getNiz() {
        return niz;
    }

    public void setNiz(Student[] niz) {
        this.niz = niz;
    }
    public void ispisi(Student s){
        for(int i=0;i<vel;i++){
            if(getNiz()[i].getIme().equals(s.getIme()) && getNiz()[i].getPrezime().equals(s.getPrezime())) {
                getNiz()[i] = getNiz()[vel - 1];
                vel--;
            }
        }
    }
    public void IspisiNiz(){
        for(int i=0;i<vel;i++){
            System.out.print(i+1+".");
            getNiz()[i].Ispisi();
        }
    }
}
