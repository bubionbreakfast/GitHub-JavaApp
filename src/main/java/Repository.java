import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;
    private ArrayList<Commit> commits;

    public Repository(String name, String description, RepositoryType repositoryType) {
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = commits;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public RepositoryType getRepositoryType() {
        return repositoryType;
    }

    public ArrayList<Commit> getCommits() {
        return commits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRepositoryType(RepositoryType repositoryType) {
        this.repositoryType = repositoryType;
    }

    public void setCommits(ArrayList<Commit> commits) {
        this.commits = commits;
    }
}
