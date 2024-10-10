public class digital extends musicStore {

  // instance vars
private boolean lossLessAudio;
private int fileSize;
  // calculated based on val of other instance vars
  private double priceD;

 // no argument constructor
  public digital() {
    lossLessAudio = false;
      fileSize = 0;
  }
  
  public digital(String artist, String title, int runTime, boolean albumEP, boolean lossLessAudio, int fileSize) {
super(artist, title, runTime, albumEP);
    this.lossLessAudio = lossLessAudio;
    this.fileSize = fileSize;
  }

 //album constructor (the addition of trackNum)
  public digital(String artist, String title, int runTime, boolean albumEP, int trackNum, boolean lossLessAudio, int fileSize) {
super(artist, title, runTime, albumEP, trackNum);
this.lossLessAudio = lossLessAudio;
    this.fileSize = fileSize;
 }

  public boolean getLossLessAudio() {
    return lossLessAudio;
  }

  public int getFileSize(){
    return fileSize;
  }

  // Always returns accurate price
  public double getPriceD(){
    setPriceD();
    return priceD;
  }

  /*1 sec of runtime on a song = 1 dollar
  1 MB = 50 cents
  Lossless audio = 2 dollars extra
  runtime on albums = 20 cents per min
  10 cents per track
  */
  public void setPriceD(){
    if (getAlbumEP()==false){
      if (lossLessAudio == false){
      priceD = getRuntime()/60 + fileSize/200;
      } else{
      priceD = getRuntime()/60 + fileSize/200 + 2;
      }
        
    } else {
      if (lossLessAudio == false){
      priceD = getRuntime()/5 + fileSize/200 + getTrackNum()/10;
      } else {
      priceD = getRuntime()/5 + fileSize/200 + getTrackNum()/10 + 2;
      }
    }
  }

  public void setLossLessAudio(boolean newLossLA){
    lossLessAudio = newLossLA;
  }

  public void setFileSize(int newFileSize){
    fileSize = newFileSize;
  }

 // Complies toString from musicStore with more info from these vars and a PRICE
  public String toString(){
    if (lossLessAudio == true){
    return "Your digital music purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "Audio Type: Lossless" + "\n" + "File Size: " + fileSize + " Megabytes" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceD() + " USD$";
    } else {
    return "Your digital music purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "Audio Type: Lossy" + "\n" + "File Size: " + fileSize + " Megabytes" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceD() + " USD$";
      
    }
  }
}