public enum CommitType {
    FEATURE(""),
    BUGFIX(""),
    REFACTOR(""),
    OTHER("");

    private final String value;

    CommitType(String value) {this.value = value;}
}
