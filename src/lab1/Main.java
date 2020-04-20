package lab1;
import java.lang.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       int m = 0;

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(1);
        lista.add(0);
        lista.add(-1);
        lista.add(-1);
        System.out.print(lista);
        for(int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                    if(lista.get(i) + lista.get(j) == 0){
                        lista.remove(i);
                        lista.remove(j);
                        m++;
                    }
                }
            }
        System.out.println(" => " + m + " perechi");
        }

    }















