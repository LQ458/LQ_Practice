import java.util.Scanner;
public class HunCow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long total = 0;
        long N = scanner.nextLong();
        long T = scanner.nextLong();
        long[][] hayBales = new long[100000][2];
        for(int i = 0; i < N; i++){
            hayBales[i][0] = scanner.nextLong();
            hayBales[i][1] = scanner.nextLong();
        }
        scanner.close();

        for(int i = 0; i < T; i++){
            if(T-hayBales[i][0] >= hayBales[i][1]){
                total += hayBales[i][1];
            }
            else{
                total += T - hayBales[i][0] + 1;
            }
        }
        if(total > T){
            total = T;
        }
        System.out.println(total);
    }
}
