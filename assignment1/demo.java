package assignment1;

public class demo {

    public static void main(String[] args) {

        // Instance an object for each class
        laptop laptop = new laptop("HP Victus", 16);

        camera camera = new camera("Nikon Coolpix", 12);

        acousticguitar acousticGuitar =
                new acousticguitar("Yamaha", 6, "Spruce", true);

        electricguitar electricGuitar =
                new electricguitar("Yamaha", 6, "HSS", "Ice Blue");


        // =========================
        // LAPTOP
        // =========================
        System.out.println("===== LAPTOP =====");

        laptop.turnOn();
        laptop.openApplication("Microsoft Word");
        laptop.showSpecifications();


        // =========================
        // CAMERA
        // =========================
        System.out.println("\n===== CAMERA =====");

        camera.takePhoto();
        camera.recordVideo();
        camera.showSpecifications();


        // =========================
        // ACOUSTIC GUITAR
        // =========================
        System.out.println("\n===== ACOUSTIC GUITAR =====");

        acousticGuitar.play();
        acousticGuitar.tune();
        acousticGuitar.playAcoustic();
        acousticGuitar.changeStrings();
        acousticGuitar.showInfo();


        // =========================
        // ELECTRIC GUITAR
        // =========================
        System.out.println("\n===== ELECTRIC GUITAR =====");

        electricGuitar.play();
        electricGuitar.tune();
        electricGuitar.connectAmplifier();
        electricGuitar.useEffect();
        electricGuitar.showInfo();
    }
}