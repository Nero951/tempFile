package solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author: Wade
 * @create: 2021/1/13
 */
public class GetVoteResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int num = scan.nextInt();
            int invalid = 0;
            HashMap<String, Integer> map = new HashMap<String, Integer>(num);
            for (int i=0; i<num; i++) {
                map.put(scan.next(),0);
            }
            int vote = scan.nextInt();
            for(int i=0; i<vote; i++){
                String str = scan.next();
                if(map.get(str)==null){
                    invalid++;
                }else {
                    map.put(str, map.get(str)+1);
                }
            }
            for (Map.Entry entry:map.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println("Invalid : "+invalid);
        }
    }

}
