package rpm_java;

import java.util.Objects;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int buildingIndex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return buildingIndex == address.buildingIndex && Objects.equals(country, address.country) && Objects.equals(region, address.region) && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, region, city, street, buildingIndex);
    }

    public Address(String country, String region, String city, String street, int buildingIndex) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.buildingIndex = buildingIndex;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingIndex=" + buildingIndex +
                '}';
    }

    public Address copy(){
        return new Address(country, region, city, street, buildingIndex);
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildingIndex() {
        return buildingIndex;
    }

    public void setBuildingIndex(int buildingIndex) {
        this.buildingIndex = buildingIndex;
    }
}
