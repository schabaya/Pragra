package InterfaceAssign;

class AudioPlayer extends MediaDevice implements Playable {
    String songName = "Love in Paradise";
    String artist = "Unknown SC";

    public AudioPlayer(String name) {
        super(name);
    }

    public void play() {
        System.out.println("Playing audio: " + songName + " by " + artist);
    }

    void displayDetails() {
        System.out.println("\nAudio Player Name: " + name + ", Song: " + songName + ", Artist: " + artist);
    }
}