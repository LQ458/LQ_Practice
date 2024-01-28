import java.util.Scanner;
public class HunCow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long total = 0;
        int N = scanner.nextInt();
        int left = 0;
        long T = scanner.nextLong();
        long[][] hayBales = new long[100000][2];
        for(int i = 0; i < N; i++){
            hayBales[i][0] = scanner.nextLong();
            hayBales[i][1] = scanner.nextLong();
        }
        if(N==1){
            if(T - hayBales[0][0]+1 < hayBales[0][1]){
                total = T-hayBales[0][0] + 1;
            }
            else{
                total = hayBales[0][1];
            }
        }
        else{
            for(int i = N-1; i > 0; i--){
                if(hayBales[i][0] > T){
                    continue;
                }
                else if(hayBales[i][0] == T){
                    total++;
                }
                else{
                    if(hayBales[i][0] - hayBales[i-1][0] <= left){
                        total += hayBales[i][0] - hayBales[i-1][0];
                        left -= hayBales[i][0] - hayBales[i-1][0];
                    }
                    else{
                        total += left;
                        left = 0;
                        if(hayBales[i][0] - hayBales[i-1][0] <= hayBales[i-1][1]){
                            total += hayBales[i][0] - hayBales[i-1][0];
                            left += hayBales[i-1][1] - (hayBales[i][0] - hayBales[i-1][0]);
                        }
                        else{
                            total += hayBales[i-1][1];
                        }
                    }
                }
            }
        }
        scanner.close();
        System.out.print(total);
    }
}
