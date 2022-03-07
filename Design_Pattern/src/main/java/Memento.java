import java.awt.*;
import java.util.Stack;

public class Memento {

    static Originator a = new Originator();

    public static void main(String[] args) {
        Originator undo = a.undo();
        Point i;
        Point p = new Point(10, 20);

        a.setI(p);
        a.save();
        i = undo.getI();
        System.out.println(i.x + "," + i.y);
        p = new Point(15, 25);
        a.setI(p);
        a.save();
        i = undo.getI();
        System.out.println(i.x + "," + i.y);
    }

}
class Originator {

    private final A_Caretaker a_Caretaker = new A_Caretaker();

    Point point;

    public void Originator(Point capitalCities) {
        this.point = capitalCities;
    }

    public Point getI() {
        return point;
    }

    public void save() {
        a_Caretaker.addMemento(new A_Memento(point));
    }

    public Originator undo() {

        A_Memento memento = a_Caretaker.getMemento();
        if (memento != null) {

            this.point = memento.getI();
            return this;
        }
        return this;
    }

    void setI(Point p) {
        this.point = p;
    }
}

class A_Memento {

    private final Point capitalCities;

    public A_Memento(Point capitalCities) {
        this.capitalCities = capitalCities;
    }

    public Point getI() {
        return capitalCities;
    }
}

class A_Caretaker {

    private final Stack<A_Memento> arrayList = new Stack<>();

    public void addMemento(A_Memento a_Memento) {
        arrayList.add(a_Memento);
    }

    public A_Memento getMemento() {

        if (arrayList.empty()) {
            return null;
        } else {
            A_Memento get = arrayList.pop();
            return get;
        }
    }

}
