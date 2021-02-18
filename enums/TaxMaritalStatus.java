package enums;

public enum TaxMaritalStatus {
    SINGLE("single"),
    MARRIED("Married"),
    MARRIED_FILE_AS_SINGLE("MarriedFileAsSingle");


    private final String value;

    private TaxMaritalStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
