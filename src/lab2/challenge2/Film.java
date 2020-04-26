package lab2.challenge2;

import java.util.Arrays;

public class Film {
    int anAparitie;
    String nume;
    Actor[] actori;


    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparitie=" + anAparitie +
                ", nume='" + nume + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }



}
