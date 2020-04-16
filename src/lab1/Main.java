package lab1;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class Main {

public static void main(String[] args) {
        //FizzBuzz
//        for (int i = 1; i <= 100; i++){
//            if(i % 3 == 0){
//                System.out.print("Fizz, ");
//            }else if(i % 5 == 0){
//                System.out.print("Buzz, ");
//            }else if(i % 7 == 0){
//                System.out.print("Rizz, ");
//            }else if(i % 11 == 0){
//                System.out.print("Jazz, ");
//            }else
//                System.out.print(i + ", ");
//        }

    //System.out.println(String.valueOf(x).length());
    compute(15);

    }

    static String compute(int numar){
        System.out.print(numar + " => ");
        String str = "";
        int rest;
            if(numar % 3 == 0){
                str = "Foo";
            }else if(numar % 5 == 0){
                str = "Bar";
            }else if(numar % 7 == 0){
                str = "Qix";
            }else{
                str = ("" + numar);
            }

        while(numar > 0){
            rest = numar % 10;
            if (rest == 3){
                str = str.concat("Foo");
            }else if(rest == 5){
                str = str.concat("Bar");
            }else if(rest == 7){
                str = str.concat("Qix");
            }
            numar = numar / 10;
        }
        System.out.println(str);

    return str;
            }


    }


//    while(numar > 0){
//            rest = numar % 10;
//            if (rest == 3){
//            str = str.concat("FOO");
//            }
//            numar = numar / 10;
//
//            }







