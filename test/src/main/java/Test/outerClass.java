package Test;

class OuterClass{
    private String age = "20";
    public String getAge(){
        return age;
    }

    class Inner{
        private String name = "";
        public String getName(){
            return name;
        }
        public String getAge(){
            return age;
        }
    }

    outerClass.inner i = new outerClass.inner();
}
public class outerClass {
    private String name = "";

    static class inner{//该类不能访问外部类非公开的属性
        private String name;
    }

    public static void main(String[] args) {
        outerClass.inner in = new inner();
        OuterClass oc = new OuterClass();
        OuterClass.Inner i = oc.new Inner();
        System.out.println(i.getAge());
        outerClass out = new outerClass();
        Object o = out.method();
    }

    Object method(){
        final int localVariable = 0;
        class Inner{
            void println(){
                System.out.println("localVariable " + localVariable);
            }
        }
        Object In = new Inner();
        return In;
    }
}
