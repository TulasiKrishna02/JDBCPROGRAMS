package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class ArrayEnum {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<String>();

    arrayList.add("A");
    arrayList.add("B");
    arrayList.add("D");
    arrayList.add("E");
    arrayList.add("F");

    Enumeration e = Collections.enumeration(arrayList);

    while (e.hasMoreElements())
      System.out.println(e.nextElement());
    
    
    Enumeration<String> enm = Collections.enumeration(arrayList);
    while(enm.hasMoreElements()){
        System.out.println(enm.nextElement());
    }
  }
}

/*
 Diff between Enumeration and Iterator
Only major difference between Enumeration and iterator is Iterator has a remove() method while Enumeration doesn't. 
Enumeration acts as Read-only interface, because it has the methods only to traverse and fetch the objects,
 where as by using Iterator we can manipulate the objects like adding and removing the objects from collection e.g. Arraylist.

Also Iterator is more secure and safe as compared to Enumeration because it  does not allow other thread to modify the collection 
object while some thread is iterating over it and throws ConcurrentModificationException. 
This is by far most important fact for me for deciding between Iterator vs Enumeration in Java.

In Summary both Enumeration and Iterator will give successive elements, 
but Iterator is new and improved version where method names are shorter, and has new method called remove. 
Here is a short comparison:

*/