package Jan27;

public class Lesson {

        /* static block */

        static {
            System.out.println("Inside a static block");
        }
//non-static method

        public void run() {
            System.out.println("Inside a non static method");
        }

        //instance block
        {
            System.out.println("Instance");
        }
        public static void main(String[] args) {
            Lesson lesson = new Lesson();
           lesson.run();

        }
    }


