import java.util.ArrayList;

public class Account {

    private String username;
    private String name;
    private AccountType accountType;
    private ArrayList<Repository> repositories;

    public Account(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.accountType = accountType;
        this.repositories = new ArrayList<Repository>();
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
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

    public void setRepositories(ArrayList<Repository> repositories) {
        this.repositories = repositories;
    }

    public int getRepositoryCount(){
        return this.repositories.size();
    }

    public void addRepository(Repository repository){
         this.repositories.add(repository);
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Account getAccountByName(Account account){
            if(account.name == account.getName());
        return account;

//    }
    }

}
