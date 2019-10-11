import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRepository {

    Account account;
    Repository repository;
    Commit commit;

    @Before
    public void before(){
        repository = new Repository("Vet Book", "A vet managment App", RepositoryType.PUBLIC );
    }

    @Test
    public void canGetRepositoryName(){
        assertEquals("Vet Book", repository.getName());
    }
}
