public class MyBeanFactory {
    public static <CustomerDao> CustomerDao getBean(){
        final CustomerDao customerDao = new CustomerDaoIml();
    }
}
