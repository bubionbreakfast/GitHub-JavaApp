import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;
    private ArrayList<Commit> commits;
//    private ArrayList<Commit> commitObjects;
//    private Commit commit;

    public Repository(String name, String description, RepositoryType repositoryType) {
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<Commit>();
//        this.commitObjects = new ArrayList<Commit>();
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

    public int getCommitCount(){
        return this.commits.size();
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

    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public Commit findCommitById(int id) {
        Commit commitObject = null;
        for(Commit commit : this.commits){
            if (id  == commit.getId()){
                commitObject = commit;
            }
        }
        return commitObject;

    }

//    public ArrayList<CommitType> findCommitByCommitType(CommitType commitType){
//        for (Commit commit : this.commits){
//            if(commitType == commit.getCommitType()){
////                this.commitObjects = new ArrayList<CommitType>();
//                this.commitObjects.add(commit);
//            }
//        }
//        return commitObjects;
//
//    }

//    public Commit findCommitByCommitType(CommitType commitType){
//        ArrayList commitObject = null;
//
//        for (Commit commit : this.commits){
//            if(this.commits.contains(commit.getCommitTypeValue())){
//                commitObject.add(commit.getDescription());
//            }
//        }
//        return commitObject;
//    }

//    public Commit findCommitByCommitType(CommitType commitType) {
////        for (Commit commit : this.commits) {
////            for (CommitType commitType : CommitType.values()) {
//                if (CommitType.values() == commitType) {
//                    this.commitObjects3 = new ArrayList<Commit>();
//                    commitObjects3.add(commit);
//                }
//            }
//            return commitObjects3;
//        }
//    }

//    public Commit findCommitByCommitType(CommitType commitType) {
//        for (Commit commit : this.commits){
//            for (CommitType type : CommitType.values()) {
//                if (CommitType.values(commitType)) ;
//                commitObjects3.add(commit);
//
//            }
//        }
//
//        return this.commitObjects3;
//
//    }

//    public CommitType findCommitByCommitType(CommitType commitType) {
//            return  commit.getCommitType(commitType);
//
//    }

}

