package model;

public class ADTTime implements ITime
{
  private int hour;
  private int minute;
  private int secs;
  private boolean am;
  private int elapsedTime;

  public ADTTime()
  {
    this.hour = 0;
    this.minute = 0;
    this.secs = 0;
    this.am = true;
    this.elapsedTime = 0;
  }

  public ADTTime(int hr, int min, int secs)
  {
    this.hour = hr;
    this.minute = min;
    this.secs = secs;
    this.setElapsedTime();
  }

  public ADTTime(int hr, int min, int secs, boolean meridiem)
  {
    this.hour = hr;
    this.minute = min;
    this.secs = secs;
    this.am = meridiem;
    this.setElapsedTime();
  }

  public void setHour( int hour )
  {
    this.hour = hour;
  }
  public int getHour( )
  {
    return this.hour;
  }
  public void setMinute( int mins )
  {
    this.minute = mins;
  }
  public int getMinute( )
  {
    return this.minute;
  }
  public void setSecs( int secs )
  {
    this.secs = secs;
  }
  public int getSecs( )
  {
    return this.secs;
  }
  public void setAMPeriod( boolean am )
  {
    this.am = am;
  }
  public boolean getAMPeriod( )
  {
    return am;
  }

  public void setElapsedTime()
  { this.elapsedTime = elapsedTime;}
  public int getElapsedTime( )
  {
    return this.elapsedTime;
  }
  public void setTime(int hr, int min, int secs)
  {
    this.hour = hr;
    this.minute = min;
    this.secs = secs;
    this.setElapsedTime();
  }
  public void setTime(int hr, int min, int secs, boolean meridiem)
  {
    this.hour = hr;
    this.minute = min;
    this.secs = secs;
    this.am = meridiem;
    this.setElapsedTime();
  }

  public void parseString(String theTime){
    theTime= Integer.parseInt;
  }

  public String formatHHMMSS(){
    // Add your code here
    return "";
  }

  public String toString()
  {
    String msg = "";
    msg = ( am )
        ? String.format("%02d:%02d:%02d AM",this.hour,this.minute, this.secs) 
        //"H:" + this.hour + " M:" + this.minute + " S:" + this.secs + " AM"
        : String.format("%02d:%02d:%02d PM",this.hour,this.minute, this.secs);
        
        //"H:" + this.hour + " M:" + this.minute + " S:" + this.secs + " PM";
    return msg;
  }
}
