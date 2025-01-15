import java.util.LinkedHashMap;

public class VotingSystem {
    public LinkedHashMap<String, Integer> votingCount = new LinkedHashMap<>();

    public void vote(String contestant) {
        votingCount.merge(contestant,1 ,Integer::sum);
    }

    // This method should return the LinkedHashMap field you create at the top of
    // the class.
    public LinkedHashMap getVotes() {
        return votingCount;
    }

}
