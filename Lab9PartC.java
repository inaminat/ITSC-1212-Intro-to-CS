/* Lab 9, Part C: Created by Celine Latulipe, modified by Bruce Long  */  
public class Lab9PartC {   
  public static void main(String [] args)  
  {   
    String filename;
    
    if (args.length > 0) {
       // got a filename passed into program as a parameter
       // don't change this part of the code: needed by the Autograder.
       filename = args[0];
       System.out.println("Filename passed in: " + filename);
    } else {
       // ask user for a picture
       filename = FileChooser.pickAFile();
       System.out.println("User picked file: " + filename);
    }
    
    Picture pic = new Picture(filename);
   
    // call the horizontal shutters method
    pic.horizontalShutters();
    // show the pic
    pic.show();

  } 
}  