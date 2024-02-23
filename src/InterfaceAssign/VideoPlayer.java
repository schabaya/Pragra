package InterfaceAssign;

class VideoPlayer extends MediaDevice implements Playable {
    String videoTitle;
    int duration;

    public VideoPlayer(String name, String videoTitle, int duration) {
        super(name);
        this.videoTitle = videoTitle;
        this.duration = duration;
    }

    public void play() {
        System.out.println("Playing video: " + videoTitle + " Duration: " + duration + " mins");
    }

    void displayDetails() {
        System.out.println("\nVideo Player Name: " + name + ", Title: " + videoTitle + ", Duration: " + duration + "mins");
    }
}