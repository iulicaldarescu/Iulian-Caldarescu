package lab1;

public class Main {
    public static void main(String[] args) {
        //FizzBuzz
        for (int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.print("Fizz, ");
            }else if(i % 5 == 0){
                System.out.print("Buzz, ");
            }else
                System.out.print(i + ", ");
        }
   }
}
