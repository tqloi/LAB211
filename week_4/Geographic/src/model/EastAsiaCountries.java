package model;

public class EastAsiaCountries extends Country {

    private String countryTerrain;  

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString() {
        return "EastAsiaCountries{" + "countryTerrain=" + countryTerrain + '}';
    }
    
    public int compareTo(EastAsiaCountries o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }
    
}
