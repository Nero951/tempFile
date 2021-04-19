package solution;

/**
 * @author: Wade
 * @create: 2021/1/10
 */
public class MainMethods {
    public static void main(String[] args) {
        try{
            int n = 10/0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            Throwable t = new Throwable();
            System.out.println(t.getMessage());
            t.getCause();
            System.out.println(t.getClass());
            t.getStackTrace();

        }
    }
}
