public class Commit {
    private String description;
    private CommitType commitType;
    private int uniqueId;

    public Commit(String description, CommitType commitType, int uniqueId) {
        this.description = description;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
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

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }
}
