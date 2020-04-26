package lab2.challenge2;

import java.util.ArrayList;
import java.util.Arrays;

public class Studio{
    String nume;
    private Film[] filme;

        public Studio(String nume,Film[] filme){
            this.nume = nume;
            this.setFilme(filme);
        }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }




}
