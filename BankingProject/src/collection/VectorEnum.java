package collection;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEnum {
  public static void main(String[] args) {
    Vector<String> v = new Vector<String>();

    v.add("A");
    v.add("B");
    v.add("D");
    v.add("E");
    v.add("F");

    Enumeration enm = v.elements();
    
    while(enm.hasMoreElements()){
        System.out.println(enm.nextElement());
    }
  }
}
