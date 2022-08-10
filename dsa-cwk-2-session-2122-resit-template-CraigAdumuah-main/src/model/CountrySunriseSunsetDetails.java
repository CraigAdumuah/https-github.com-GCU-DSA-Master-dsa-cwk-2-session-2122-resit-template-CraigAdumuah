package model;

public class CountrySunriseSunsetDetails implements Comparable<CountrySunriseSunsetDetails>{

    private String country;
    private String capital;
    private ADTTime sunrise;
    private ADTTime sunset;
    private ADTTime dayLength;

    public CountrySunriseSunsetDetails(){
       this.country= "";
       this.capital= "";
       this.sunrise= new ADTTime();
       this.sunset= new ADTTime();
       this.dayLength= new ADTTime();

    }

    public CountrySunriseSunsetDetails(String country, String capital, ADTTime sunrise, ADTTime sunset, ADTTime dayLength) {
        this.country= "";
        this.capital= "";
        this.sunrise= new ADTTime();
        this.sunset= new ADTTime();
        this.dayLength= new ADTTime();
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public ADTTime getSunrise() {
        return this.sunrise;
    }

    public void setSunrise(String theTime) {
        this.sunrise = sunrise;
    }

    public ADTTime getSunset() {
        return this.sunset;
    }

    public void setSunset(String theTime) {
        this.sunset = sunset;
    }

    public ADTTime getDayLength() {
        return this.dayLength;
    }

    public void setDayLength(int theDayLength) {
        this.dayLength = dayLength;
    }

    public String CSVFormat(){
        // Add your code here
          String outputStr = this.country + "," +  this.capital + "," + this.sunrise + "," + this.sunset + ","  + this.dayLength + "," + ",\" + this.aWordReversed;\n";
                       return outputStr;
    }

    @Override
    public String toString() {
        return "CountrySunriseSunsetDetails{" +
                "capital=" + country +
                ", country='" + capital+ '\'' +
                ", sunset='" + sunrise+ '\'' +
                ", sunrise='" + sunset + '\'' +
                ", dayLength='" + dayLength + '\'' +
                '}';
    }

    @Override
    public int compareTo(CountrySunriseSunsetDetails anEntry) {
        return this.dayLength.compareToIgnoreCase(anEntry.getDayLength());

    }
}
