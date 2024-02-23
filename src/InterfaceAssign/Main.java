package InterfaceAssign;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer("Sony Audio Player");
        VideoPlayer videoPlayer = new VideoPlayer("LG Video Player", "Gone", 60);
        ImageDisplay imageDisplay = new ImageDisplay("Samsung Frame", "Sunset", "1920x1080");

        audioPlayer.displayDetails();
        audioPlayer.play();

        videoPlayer.displayDetails();
        videoPlayer.play();

        imageDisplay.displayDetails();
        imageDisplay.displayImage();
    }
}