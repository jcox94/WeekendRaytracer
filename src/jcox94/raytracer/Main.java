package jcox94.raytracer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        int image_width = 256;
        int image_height = 256;

        System.out.println("P3");
        System.out.print(image_height);
        System.out.print(' ');
        System.out.println(image_width);
        System.out.print("\n255\n");

        for(int j = image_height - 1; j >= 0; --j) {
            System.err.print("\rScanlines remaining: " + j);
            System.err.flush();
            for(int i = 0; i < image_width; ++i) {
                double r = (double)i / (image_width - 1);
                double g = (double)j / (image_height - 1);
                double b = 0.25;
                Color pixelColor = new Color(r, g, b);
                pixelColor.write();
            }
        }
        System.err.println();
        System.err.println("Done");
    }
}
