public enum RepositoryType {
    PRIVATE("Invisible"),
    PUBLIC("Visible");

    private final String value;

    RepositoryType(String value) {
        this.value = value;
    }

    public String getValue()
    {
        return value;
    }

}
