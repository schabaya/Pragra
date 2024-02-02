package Jan27;

public class CountingStars {

    int counter;

    public CountingStars(int counter) {
        this.counter = counter;
    }

    public void incrementCounter(){
        counter ++;
        System.out.println(counter);
    }
    public static void main(String[] args) {
        CountingStars countingStars1 = new CountingStars(5);
        CountingStars countingStars2 = new CountingStars(10);
        CountingStars countingStars3 = new CountingStars(15);
        CountingStars countingStars4 = new CountingStars(20);
        CountingStars countingStars5 = new CountingStars(30);

        countingStars1.incrementCounter();
        countingStars2.incrementCounter();
        countingStars3.incrementCounter();
        countingStars4.incrementCounter();
        countingStars5.incrementCounter();
    }
}
