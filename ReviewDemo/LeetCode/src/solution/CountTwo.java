package solution;

/**
 * @author: Wade
 * @create: 2021/1/18
 */
public class CountTwo {
    public static int countNumberOf2s(int n){
        int i=0;
        int count = 0;
        if(n<2){
            return 0;
        } else if(n>=2&&n<=10){
            return count+1;
        }else{
            while(i<=n){
                if(i/10==2){
                    count+=1;
                }
                if(i%10==2){
                    count+=1;
                }
                i++;
            }
        }
        return count;
    }
}
