package model;

public class EastAsiaCountries extends Country {

    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public int compareTo(EastAsiaCountries o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

    @Override
    public String toString() {
        return String.format("Country Code: %s| Country Name: %-15s | Total Area: %-15.2f | Country Terrain: %-10s",
                this.getCountryCode(), this.getCountryName(), this.getTotalArea(), this.countryTerrain);
    }

    public boolean containsKeyword(String keyword) {
        return this.getCountryName().toLowerCase().contains(keyword.toLowerCase());
    }

}
