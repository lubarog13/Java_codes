package rpm_java;

public enum BuildingTypeEnum {
    SOCIAL ("Общественное"),
    LIVING("Жилое"),
    INDUSTRIAL("Промышленное");
    private final String rus;
    BuildingTypeEnum(String rus){
        this.rus = rus;
    }
    public String getRus(){
        return rus;
    }
}
