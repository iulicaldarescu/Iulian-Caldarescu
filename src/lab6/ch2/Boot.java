package lab6.ch2;

public class Boot implements Shoe{

    private double size;
    private String color;

    public Boot(double size, String color){
        this.size = size;
        this.color = color;
    }

    @Override
    public double getSize() {
        return 0;
    }

    @Override
    public String toString() {
        return "Boot{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getColor() {
        return null;
    }
}
