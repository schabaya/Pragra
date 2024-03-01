package collectionPractice;

import java.util.ArrayList;

public class TestArrayList {

//Example 1: java 1.5 version : auto boxing
public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(10);
    al.add(10.5);
    al.add("shadreck");
    al.add('a');
    al.add(null);
    al.add(10);
    System.out.println(al);
    System.out.println(al.toString());

}
}
/*
//Example 1: java 1.5 version : auto boxing
public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(10);
    al.add(10.5);
    al.add("shadreck");
    al.add('a');
    al.add(null);
    al.add(10);
    System.out.println(al);
    System.out.println(al.toString());

}
}*/

/*
//Example 1: before java 1.5 version : auto boxing
public static void main(String[] args) {
    ArrayList al = new ArrayList();
    al.add(Interger.valueOf(10));
    al.add(Double.valueOf(10.5));
    al.add("shadreck");
    al.add(Character.valueOf('a'));
    al.add(null);
    al.add(Interger.valueOf(10));
    System.out.println(al);
    System.out.println(al.toString());

}
}*/
