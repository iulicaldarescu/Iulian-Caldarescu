package lab4.Visitor;

public abstract class CostVisitor implements Visitor {
    private int totalCost;

    public int getTotalCost() {
        return totalCost;
    }

    public void visit(Element[] elements){
        for(Element e:elements){
            e.accept(this);
        }

    }



    public void visit(Book book){
        totalCost += book.getCost();
    }

    public void visit(Video video){
        totalCost += video.getCost();
    }

    public void audio(Audio audio){
        totalCost += audio.getCost();
    }


}
