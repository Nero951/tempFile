package solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            List<Integer> list = new ArrayList<>();
            list.add(scan.nextInt());
            System.out.println(list);
        }
    }

}
