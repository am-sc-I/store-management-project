public class vinyl extends musicStore {

  // instance vars
private boolean limitedEd;
private boolean used;
// unique price calc for vinyls
  private double priceV;

  //NA constructor
public vinyl() {
this.limitedEd=false;
this.used=false;
}

  // Uses super for all recycled parameters
  public vinyl(String artist, String title, int runTime, boolean albumEP, boolean limitedEd, boolean used) {
super(artist, title, runTime, albumEP);
  this.limitedEd=limitedEd;
  this.used=used;
}
  public vinyl(String artist, String title, int runTime, boolean albumEP, int trackNum, boolean limitedEd, boolean used) {
super(artist, title, runTime, albumEP, trackNum);
this.limitedEd=limitedEd;
  this.used=used;
  }

  // Accessor methods
  public boolean getLimitedEd(){
    return limitedEd;
  }
  public boolean getUsed(){
    return used;
  }

  //sets the current vinyl price
  public double getPriceV(){
    setPriceV();
    return priceV;
  }

 /* Calc price, 1 min on album = ~3 cents
    limited ed = $5
    One min = 50 cents
    1 track is 25 cents.
    Being used decreases price 25%, being new increases.
  */
  public void setPriceV(){
    if (getAlbumEP()==false){
      if (limitedEd == false){
      priceV = getRuntime()/40;
      } else{
      priceV = getRuntime()/40  + 5;
      }
        
    } else {
        if (limitedEd == false){
        priceV = getRuntime()/2  + getTrackNum()/4;
        } else {
        priceV = getRuntime()  + getTrackNum()/2 + 5;
        }
    }

      if (used==true){
      priceV = priceV-priceV*0.25;
      } else {
      priceV = priceV + priceV*0.25;
      }
  }

  public void setLimitedEd(boolean newLimEd){
    limitedEd = newLimEd;
  }
public void setUsed(boolean newUsed){
    used = newUsed;
  }

  // reuses recycled parts from the super
   public String toString(){
    if (limitedEd == true){
      if (used==true){
    return "Your (LIMITED EDITION) vinyl disc purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "Used" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceV() + " USD$" ;
      } else {
    return "Your (LIMITED EDITION) vinyl disc purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "New" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceV() + " USD$";
        
      }
    } else {
     if (used==true){
           return "Your vinyl disc purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "Used" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceV() + " USD$";      
     } else {
           return "Your vinyl disc purchase" + "\n" + "-----------------------"+"\n" + super.toString() + "\n" + "New" + "\n" + "-----------------------"+"\n" + "Total: " + getPriceV() + " USD$";      

     }
    }
}
}
