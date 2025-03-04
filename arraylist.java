import java.util.*;

public class arraylist {
      public static void main(String[] args) {
        ArrayList Al = new ArrayList();
        Al.add(1);
        Al.add(2);
        Al.add(3);
        Al.add("shu");
        Al.add(3.4);
        Al.add(50);
        Al.add(454);
        Al.add(45.2);
        Al.add("shyam");
        Al.add(78);

       Iterator itr = Al.iterator();
       while (itr.hasNext()) {
       System.out.println(itr.next()); 
       }
      }
}