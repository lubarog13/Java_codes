package rpm_java;

public class BuildingNew {
    private AddressNew address;
    private BuildingTypeEnum type;
    private int floorCount;

    @Override
    public String toString() {
        return "BuildingNew{" +
                "address=" + address +
                ", type=" + type.getRus() +
                ", floorCount=" + floorCount +
                '}';
    }

    public BuildingNew(AddressNew address, BuildingTypeEnum type, int floorCount) {
        this.address = address;
        this.type = type;
        this.floorCount = floorCount;
    }

    public AddressNew getAddress() {
        return address;
    }

    public void setAddress(AddressNew address) {
        this.address = address;
    }

    public BuildingTypeEnum getType() {
        return type;
    }

    public void setType(BuildingTypeEnum type) {
        this.type = type;
    }

    public int getFloorCount() {
        return floorCount;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }
}
