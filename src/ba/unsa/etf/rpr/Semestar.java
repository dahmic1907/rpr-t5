package ba.unsa.etf.rpr;

import java.util.List;

public class Semestar {
    private List<Predmet>predmeti;
    private int brojSemestra;
    private int ukupanBrojEctsBodova;


    public List<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setPredmeti(List<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }

    public int getUkupanBrojEctsBodova() {
        return ukupanBrojEctsBodova;
    }

    public void setUkupanBrojEctsBodova(int ukupanBrojEctsBodova) {
        this.ukupanBrojEctsBodova = ukupanBrojEctsBodova;
    }
    public void upisiStudentaNaSemestar(Student s){

    }
    public void ispisiStudentaSaSemesta(Student s){

    }
}
