import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Account account;
    Repository repository;
    Commit commit;
    Commit commit2;

    @Before
    public void before(){
        repository = new Repository("Vet Book", "A vet management App", RepositoryType.PUBLIC );
        commit = new Commit("added home button", CommitType.FEATURE, 9991);
        commit2 = new Commit("added back button", CommitType.FEATURE, 9992);
    }

    @Test
    public void canGetRepositoryName(){
        assertEquals("Vet Book", repository.getName());
    }

    @Test
    public void canGetRepositoryDescription(){
        assertEquals("A vet management App", repository.getDescription());
    }

    @Test
    public void canGetRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository.getRepositoryType());
    }

    @Test
    public void canAddCommit(){
        repository.addCommit(commit);
        repository.addCommit(commit2);
        assertEquals(2, repository.getCommitCount());
    }


}
