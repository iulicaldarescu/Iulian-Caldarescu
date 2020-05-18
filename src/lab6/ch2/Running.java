package lab6.ch2;

public class Running implements Shoe {

    private double size;
    private String color;

    public Running(double size, String color){
        this.size = size;
        this.color = color;
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public String toString() {
        return "Running{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getColor() {
        return null;
    }
}
