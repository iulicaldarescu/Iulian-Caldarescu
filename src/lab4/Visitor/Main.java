package lab4.Visitor;

public class Main {
    public static void main(String[] args) {
        Element[] elements = new Element[3];
        Book book = new Book(10,3);
        Book book2 = new Book(10,4);
        Video video = new Video(23,4);
        Audio audio = new Audio(23,3);

        elements[0] = book;
        elements[1] = book2;
        elements[2] = video;
        elements[3] = audio;
        //Visitor visitor = new CostVisitor();

        //visitor.visit(elements);

        //System.out.println(((CostVisitor) visitor).getTotalCost());

        
    }
}
