package collectionPractice;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList al =  new ArrayList();
        al.add(new Emp(111, "shadreck"));
        al.add(new Student(1, "Chabaya"));
        al.add("SC");
        al.add(10);
        al.add(null);
        System.out.println(al.toString());
        for (Object o:al) {
            if (o instanceof  Emp){
            Emp e = (Emp) o;
                System.out.println(e.eid + " "+ e.ename);
            }
            if (o instanceof Student) {
                Student s = (Student) o;
                System.out.println(s.sid + " "+ s.sname);
            }
//            if (o instanceof Interger){
//                System.out.println(0);
//            }
            if (o instanceof  String){
                System.out.println(0);
            }
            if (o==null){
                System.out.println(0);
            }
        }


    }
}
