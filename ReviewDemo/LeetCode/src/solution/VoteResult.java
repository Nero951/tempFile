package solution;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/14
 */
public class VoteResult implements GetVoteResultInter{
    Scanner scan = new Scanner(System.in);
    @Override
    public int addCandidate(char candidateName) {
        int num = scan.nextInt();
        HashMap<Character, Integer> map = new HashMap<>(num);
        while(scan.hasNext()){
            String str = scan.next();
            for (int i=0; i<num; i++){
                map.put(str.charAt(0), 0);
            }
        }
        return 0;
    }

    @Override
    public void vote(char candidateName) {
        while(scan.hasNext()){

        }
    }

    @Override
    public int getVoteResult(char candidateName) {
        return 0;
    }

    @Override
    public void clear() {

    }
}
