package rpm_java;

import java.util.Arrays;

import java.lang.Throwable;

public class City {
    private String title;
    private CityTypeEnum type;
    private int population;
    private BuildingNew[] buildings;


    public City(String title, CityTypeEnum type, int population, BuildingNew[] buildings) {
        this.title = title;
        this.type = type;
        this.population = population;
        this.buildings = buildings;
    }
    public boolean hasBuildingByAddress(AddressNew address){
        for(int i=0; i<buildings.length; i++){
            if (buildings[i]!=null && buildings[i].getAddress() == address) return true;
        }
        return false;
    }
    public BuildingNew getBuildingByAddress(AddressNew address){
        for(int i=0; i<buildings.length; i++){
            if (buildings[i]!=null && buildings[i].getAddress() == address) return buildings[i];
        }
        return null;
    }
    @Override
    public String toString() {
        return "City{" +
                "title='" + title + '\'' +
                ", type=" + type.getRus() +
                ", population=" + population +
                ", buildings=" + Arrays.toString(buildings) +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CityTypeEnum getType() {
        return type;
    }

    public void setType(CityTypeEnum type) {
        this.type = type;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public BuildingNew[] getBuildings() {
        return buildings;
    }

    public void setBuildings(BuildingNew[] buildings) {
        this.buildings = buildings;
    }
}
