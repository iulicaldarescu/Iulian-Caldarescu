package lab6.ch2;

public class Heels implements Shoe {

    double size;
    String color;
    public Heels(double size, String color){
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Heels{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }
}
