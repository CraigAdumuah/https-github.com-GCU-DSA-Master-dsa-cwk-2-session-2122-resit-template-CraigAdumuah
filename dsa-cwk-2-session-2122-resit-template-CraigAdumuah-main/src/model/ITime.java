package model;

public interface ITime
{
  void setHour(int hour);
  int getHour();
  void setMinute(int minute);
  int getMinute();
  void setSecs(int secs);
  int getSecs();
  void setAMPeriod( boolean am );
  boolean getAMPeriod( );
  void setElapsedTime();
  int getElapsedTime( );
  void setTime(int hr, int min, int secs);
  void setTime(int hr, int min, int secs, boolean meridiem);
}