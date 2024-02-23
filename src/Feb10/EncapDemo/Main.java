package Feb10.EncapDemo;

public class Main {
    public static void main(String[] args) {

        ReadOnly readOnly = new ReadOnly("Alice");
        System.out.println("ReadOnly name: " + readOnly.getName());

        WriteOnly writeOnly = new WriteOnly();
        writeOnly.setName("Bob");

        ReadnWrite readnwrite = new ReadnWrite("Charlie");
        System.out.println("Read and write: " + readnwrite.getName());
        readnwrite.setName("David");
        System.out.println("Read and write after setname: " + readnwrite.getName());
    }
    }

