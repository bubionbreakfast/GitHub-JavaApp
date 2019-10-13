import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Account account;
    Repository repository;
    Commit commit;
    Commit commit2;
    Commit commit3;

    @Before
    public void before(){
        repository = new Repository("Vet Book", "A vet management App", RepositoryType.PUBLIC );
        commit = new Commit("added home button", CommitType.FEATURE, 9991);
        commit2 = new Commit("added back button", CommitType.FEATURE, 9992);
        commit3 = new Commit("added back button", CommitType.BUGFIX, 9993);
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

    @Test
    public void canGetCommitById(){
        assertEquals(9991, commit.getId());
    }

    @Test
    public void canGetAnyCommitById(){
        repository.addCommit(commit);
        repository.addCommit(commit2);
//        repository.findCommitById();
        assertEquals(commit2, repository.findCommitById(9992));
    }

//    @Test
//    public void canGetCommitByFeature(){
//        repository.addCommit(commit);
//        repository.addCommit(commit2);
//        repository.addCommit(commit3);
//        assertEquals(CommitType.BUGFIX,  repository.findCommitByCommitType(CommitType.BUGFIX));
//    }


}
