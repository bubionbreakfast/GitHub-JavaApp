public class Commit {
    private String description;
    private CommitType commitType;
    private int id;

    public Commit(String description, CommitType commitType, int id) {
        this.description = description;
        this.commitType = commitType;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CommitType getCommitType() {
        return commitType;
    }

    public void setCommitType(CommitType commitType) {
        this.commitType = commitType;
    }

    public int getId() {
        return this.id;
    }

    public void setUniqueId(int id) {
        this.id = id;
    }
}
