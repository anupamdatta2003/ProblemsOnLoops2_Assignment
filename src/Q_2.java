import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         int sum = 0;
         while(sc.hasNextInt()){
             int num = sc.nextInt();
             if(num >= 0){
                 sum+=num;
             }
             else{
                 sum = -1;
                 break;
             }

         }
        System.out.println(sum);
    }
}
