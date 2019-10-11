public enum AccountType {

    FREE(0),
    PRO(10);

    private final int value;

    AccountType(int value) {this.value = value;}

    public int getValue(){
        return value;
    }

}
