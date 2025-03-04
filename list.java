import java.awt.Frame;
import java.awt.List;
import java.awt.*;

public class list {
    public static void main(String[] args) {
        Frame f = new Frame("List items");
        f.setLayout(null);
        List L = new List();
        L.setBounds(50,100,30,120);
        L.add("C");
        L.add("C++");
        L.add("Python");
        L.add("PHP");
        L.add("Csharp");
        f.add(L);
        L.setSize(400,400);
        L.setVisible(true);
    }
}
