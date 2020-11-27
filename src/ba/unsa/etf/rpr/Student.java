package ba.unsa.etf.rpr;

public abstract  class Student {
     protected String ime;
     protected  String prezime;
     protected int brojIndeksa;
     public Student (String ime,  String prezime,  int brojIndeksa){
         //this.ime = ime;
         //this.prezime = prezime;
         //this.brojIndeksa = brojIndeksa;
     }
    @Override
    public abstract String toString();

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }
}
