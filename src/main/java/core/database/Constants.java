package core.database;

public enum Constants {
    DB_URL("jdbc:postgresql://localhost:5432/windowApp"),
    DB_USER("postgres"),
    DB_PASSWORD("postgres");

    private String value;

    Constants(String s) {
        this.value = s;
    }

    public String getValue() {
        return value;
    }
}
