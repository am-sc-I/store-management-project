import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!

//  Digital Object + print
digital digitalAlbum = new digital("Kendrick Lamar", "To Pimp A Butterfly", 43, true, 16, true, 800);
    System.out.println(digitalAlbum);

// Vinyl Object + print
    vinyl vinylAlbum = new vinyl ("Kendrick Lamar", "To Pimp A Butterfly", 43, true, 16, true, false);
    System.out.println(vinylAlbum);


    // Closes the Scanner object
    
  }
}