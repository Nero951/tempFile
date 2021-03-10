package thread;


public class print {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1; i<=100; i++){
            if(i/10!=9 && i%10!=9){
                System.out.print(i+" ");
                count++;
                if(count==5){
                    System.out.println();
                    count=0;
                }
            }
        }
    }
}
