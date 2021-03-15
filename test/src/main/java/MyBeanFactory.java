import Dao.CustomerDao;
import Dao.CustomerDaoIml;

public class MyBeanFactory {
    public static void getBean(){
        final CustomerDao customerDao = new CustomerDaoIml();

    }
}
