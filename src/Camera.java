import java.io.File;
import java.io.IOException;

public class Camera {

    public String captureImage() {
        long timestamp = System.currentTimeMillis();
        String filename = "plant_image_" + timestamp + ".jpg";

        try {
            File file = new File(filename);
            file.createNewFile(); // Creates an empty placeholder file
        } catch (IOException e) {
            System.out.println("Error creating image file");
        }

        return filename;
    }
}

