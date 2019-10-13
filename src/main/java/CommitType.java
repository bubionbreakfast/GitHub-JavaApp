public enum CommitType {
    FEATURE("Button"),
    BUGFIX("fixed bug"),
    REFACTOR("refactored"),
    OTHER("some other value");

    private final String value;

    CommitType(String value){
        this.value = value;
    }
    public String getValue()
    {
        return value;
    }

}
