package lab3;

public class Main {
    public static void main(String[] args) {
        Person p = new Builder().setName("Iulian").getPerson();
        System.out.println(p);
    }
}
