public class Q_6 {
    public static void main(String[] args) {
        int r = 5;
        int alpha = 65;
        int num = 0;
        for(int i = 1; i <= r; i++){
            for(int j = r; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < 2*i-1; k++){
                System.out.print((char)(alpha+num++));
            }
            num = 0;
            System.out.println();
        }
        for(int i = 1; i <= r-1; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int k = (r-i)*2 - 1; k > 0; k--){
                System.out.print((char)(alpha+num++));
            }
            num = 0;
            System.out.println();
        }
    }
}
