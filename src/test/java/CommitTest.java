import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;
    Repository repository;

    @Before
    public void before(){
        commit = new Commit("added home button", CommitType.FEATURE, 9999);
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("added home button", commit.getDescription());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.FEATURE, commit.getCommitType(CommitType.FEATURE));
    }

    @Test
    public void canGetUniqueId(){
        assertEquals(9999, commit.getId());
    }


}
