import java.awt.*;
public class GRIDLAYOUT {
    public static void main(String[] args) {
        Frame f = new Frame("Grid layout");
        Button B1 = new Button("1");
        Button B2 = new Button("2");
        Button B3 = new Button("3");
        Button B4 = new Button("4");
        Button B5 = new Button("5");
        Button B6 = new Button("6");
        Button B7 = new Button("7");
        Button B8 = new Button("8");
        Button B9 = new Button("9");

        GridLayout gl = new GridLayout(3,3);
        f.setLayout(gl);

        f.add(B1);
        f.add(B2);
        f.add(B3);
        f.add(B4);
        f.add(B5);
        f.add(B6);
        f.add(B7);
        f.add(B8);
        f.add(B9);

        f.setSize(300,300);
        f.setVisible(true);
        
    }
}
