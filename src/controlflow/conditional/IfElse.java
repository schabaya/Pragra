package controlflow.conditional;

public class IfElse {

    //Case 5: java: variable declaration not allowed here
    public static void main(String[] args) {
        int age = 10;
        if (age <11) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("NOT eligible for marriage");
        }
    }
}



    //Case 1:

    /*public static void main(String[] args) {*/
    /*    int age = 10;*/
    /*    if (age > 20) {*/
    /*        System.out.println("Eligible for marriage");*/
    /*    } else {*/
    /*        System.out.println("NOT eligible for marriage");*/
    /*    }*/
    /*}*/

/*
//Case 2:
public static void main(String[] args) {
    int age = 10;
    if (true) {
        System.out.println("Eligible for marriage");
    } else {
        System.out.println("NOT eligible for marriage");
    }
}
}*/

/*
//Case 3: java: incompatible types: int cannot be converted to boolean
public static void main(String[] args) {
    int age = 10;
    if (0) {
        System.out.println("Eligible for marriage");
    } else {
        System.out.println("NOT eligible for marriage");
    }
}
}*/

/*
//Case 4: Valid
public static void main(String[] args) {
    int age = 10;
    if (age==20) {
        System.out.println("Eligible for marriage");
    } else {
        System.out.println("NOT eligible for marriage");
    }
}
} */


/*
    //Case 4: InValid java: incompatible types: int cannot be converted to boolean
    public static void main(String[] args) {
        int age = 10;
        if (age=20) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("NOT eligible for marriage");
        }
    }
}
 */

/*  //Case 5: Valid:-Code can run without curly bracelets
    public static void main(String[] args) {
        int age = 10;
        if (true)
            System.out.println("Eligible for marriage");
        else
            System.out.println("NOT eligible for marriage");
    }
}*/

/*    //Case 6 java: variable declaration not allowed here
    public static void main(String[] args) {
        if (true)
            int age = 10;
        else
            System.out.println("NOT eligible for marriage");
    }
}*/