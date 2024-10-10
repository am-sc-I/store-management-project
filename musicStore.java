public class musicStore {
// Default Instance Variables for store
  private String artist;
   private String title;
   private int runTime;
 // Only applies if albumEP == true
  private int trackNum;
   private boolean albumEP;
  
 //No Argument constructor
  public musicStore() {
    artist = "No Artist Found";
    title = "Untitled";
    runTime = 0;
    albumEP = false;
    trackNum = 0;
  }

  // Constructor if albumEP == false
  public musicStore(String artist, String title, int runTime, boolean albumEP) {
    this.artist = artist;
    this.title = title;
    this.runTime = runTime;
    this.albumEP = albumEP;
      
  }

  // Constructor if albumEP == true
  public musicStore(String artist, String title, int runTime, boolean albumEP, int trackNum) {
    this.artist = artist;
    this.title = title;
    this.runTime = runTime;
    this.albumEP = albumEP;
    this.trackNum = trackNum;
      
  }

// Accessor methods
  public String getArtist (){
    return artist;
  }
 public String getTitle (){
    return title;
  }
public int getRuntime (){
    return runTime;
  }
public boolean getAlbumEP (){
    return albumEP;
  }
public int getTrackNum (){
    return trackNum;
  }

// Mutator methods
public void setArtist(String newArtist){
    artist = newArtist;
  }
public void setTitle(String newTitle){
    title = newTitle;
  }
  public void setRuntime(int newRuntime){
    runTime = newRuntime;
  }
   public void setTrackNum(int newTrackNum){
    trackNum = newTrackNum;
  }

  public void setAlbumEP(boolean newAlbumEP){
    albumEP = newAlbumEP;
  }

// toString method
  public String toString(){

    // Two different possible outputs for where it is album or not
    if (trackNum == 0 && albumEP == false){
      return "Artist: " + artist + "\n" + "Title: " + title +"\n" + "Runtime: " + runTime + " Seconds" + "\n" + "Album/EP? " + "NO";
    } else {
      return "Artist: " + artist + "\n" + "Title: " + title +"\n" + "Runtime: " + runTime + " Minutes" + "\n" + "Album/EP? " + "YES" + "\n" + "Number of Tracks: " + trackNum;  
    }
  }
}