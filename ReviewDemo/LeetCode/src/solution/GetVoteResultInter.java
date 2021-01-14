package solution;

/**
 * @author: Wade
 * @create: 2021/1/14
 */
public interface GetVoteResultInter {
    /**
     * add candidate's name
     * @param candidateName the candidate's name
     * @return int
     */
    int addCandidate(char candidateName);

    /**
     * insert vote number
     * @param candidateName the candidate's name
     */
    void vote(char candidateName);

    /**
     * count candidate'vote
     * @param candidateName the candidate's name
     * @return int
     */
    int getVoteResult(char candidateName);

    /**
     * clear or date
     */
    void clear();
}
