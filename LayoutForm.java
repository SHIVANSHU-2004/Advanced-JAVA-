import java.awt.*;

public class LayoutForm {

    public static void main(String[] args){
        Frame f = new Frame("Layout Manager");
        f.setLayout(null);
        
        Button B1 = new Button("1");
        Button B2 = new Button("2");
        Button B3 = new Button("3");
        Button B4 =new Button("4");
        Button B5 = new Button("5");
        
          f.add(B1);
          f.add(B2);
          f.add(B3);
          f.add(B4);
          f.add(B5);

          B1.setBounds(50,30,50,30);
          B2.setBounds(100,30,50,30);
          B3.setBounds(150,30,50,30);
          B4.setBounds(200,30,50,30);
          B5.setBounds(250,30,50,30);
          f.setSize(400,400);
          f.setVisible(true);
    }
}