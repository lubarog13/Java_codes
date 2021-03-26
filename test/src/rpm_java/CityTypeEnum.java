package rpm_java;

public enum CityTypeEnum {
    VILLAGE("Деревня"),
    URBAN_VILLAGE("Поселок городского типа"),
    TOWN("Город"),
    METROPOLIS("Метрополис");
    private final String rus;
    CityTypeEnum(String rus){
        this.rus = rus;
    }
    public String getRus(){
        return rus;
    }
}

