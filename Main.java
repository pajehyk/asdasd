import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int z = 0; z < t; z++) {
            int k = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();
            int[] mono = new int[n];
            int[] poly = new int[m];
            int[] ans = new int[n + m];
            for (int i = 0; i < n; i++) {
                mono[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                poly[i] = in.nextInt();
            }
            int i = 0, j = 0, fl = 0;
            boolean tf = true;
            int t1=0, t2=0;
            while (i < n || j < m) {
                if (i < n) {
                    if (mono[i] <= k) {
                        ans[fl] = mono[i];
                        fl++;
                        if (mono[i] == 0)
                            k++;
                        i++;
                        if (i >= n) t1 = 5;
                        else t1 = 0;
                    } else {
                        t1++;
                    }
                }
                if (t1 * t2 != 0) {
                    tf = false;
                    break;
                }
                if (j < m) {
                    if (poly[j] <= k) {
                        ans[fl] = poly[j];
                        fl++;
                        if (poly[j] == 0)
                            k++;
                        j++;
                        if (j >= m) t2 = 5;
                        else t2 = 0;
                        t2 = 0;
                    } else {
                        t2++;
                    }
                }
            }
            if (tf) {
                for (int ii = 0; ii < n + m; ii++) {
                    System.out.print(ans[ii] + " ");
                }
                System.out.println();
            } else
                System.out.println(-1);
        }
    }
}
