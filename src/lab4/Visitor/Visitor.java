package lab4.Visitor;

import org.w3c.dom.ls.LSOutput;

public interface Visitor {
    void visit(Element[] e);
    void visit(Book e);
    void visit(Video e);
    void visit(Audio e);

}
