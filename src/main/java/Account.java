import java.util.HashMap;

public class Account {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public Account(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.repositories = new HashMap<String, Repository>();
        this.accountType = accountType;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Repository> getRepositories() {
        return repositories;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRepositories(HashMap<String, Repository> repositories) {
        this.repositories = repositories;
    }

    public int getRepositorySize(){
        return this.repositories.size();
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }


}
