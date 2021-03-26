package rpm_java;

public class AddressNew {
    private String street;
    private int index;
    private int subIndex;

    public AddressNew(String street, int index, int subIndex) {
        this.street = street;
        this.index = index;
        this.subIndex = subIndex;
    }

    @Override
    public String toString() {
        return "AddressNew{" +
                "street='" + street + '\'' +
                ", index=" + index +
                ", subIndex=" + subIndex +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSubIndex() {
        return subIndex;
    }

    public void setSubIndex(int subIndex) {
        this.subIndex = subIndex;
    }
}
