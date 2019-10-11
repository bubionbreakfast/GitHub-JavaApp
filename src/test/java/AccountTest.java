import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    Commit commit;
    Repository repository;
    Repository repository2;


    @Before
    public void before(){
        account = new Account("codeboy71", "Jon Snow", AccountType.FREE);
        repository = new Repository("CountMe!", "Calorie Counting App", RepositoryType.PUBLIC);
        repository2 = new Repository("VetBook", "A vet management App", RepositoryType.PUBLIC);
        commit = new Commit("added fancy graph", CommitType.FEATURE, 123456);
    }

    @Test
    public void canGetAccountName(){
        assertEquals("Jon Snow", account.getName());
    }

    @Test
    public void canSetAccountName(){
        account.setName("Bobby Brown");
        assertEquals("Bobby Brown", account.getName());
    }

    @Test
    public void canGetUserName(){
        assertEquals("codeboy71", account.getUsername());
    }

    @Test
    public void canSetUserName(){
        account.setUsername("codeboy66");
        assertEquals("codeboy66", account.getUsername());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(AccountType.FREE, account.getAccountType());
    }

    @Test
    public void canSetAccountType(){
        account.setAccountType(AccountType.PRO);
        assertEquals(AccountType.PRO, account.getAccountType());
    }

    @Test
    public void repositoriesHasObjects(){
        account.addRepository(repository2);
        account.addRepository(repository);
        assertEquals(1, account.getRepositoryCount());
    }

}
