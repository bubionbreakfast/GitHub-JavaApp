import com.sun.jmx.mbeanserver.Repository;

import java.util.ArrayList;
import java.util.HashMap;

public class Account {

    private String username;
    private String name;
    private ArrayList<Repository> repositories;
    private AccountType accountType;

    public Account(String username, String name, AccountType accountType) {
        this.username = username;
        this.name = name;
        this.repositories = new ArrayList<Repository>();
        this.accountType = accountType;
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


//    public void addRepository(Repository repository) {
//        this.repositories.add(repository);
//    }
}
