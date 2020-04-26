package lab2.challenge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Actor {
    String nume;
    int varsta;
    Premiu[] premii;


    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public Actor(String nume, Premiu[] premii) {
        this.nume = nume;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }

    public String actorCu2Oscaruri() {
        if (nume == "actor cu 2 oscaruri") {
        }
        return nume;
    }
}
