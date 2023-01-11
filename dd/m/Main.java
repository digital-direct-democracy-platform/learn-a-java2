package dd.m;
public class Main {
    public static void main(String[] arg) {
        System.out.println("-start-------------");
        int sum1 = 0;
        int a[][] = new int[1][3000];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = i + j;
                sum1 += a[i][j];

            }
        }
        System.out.println("sum = "+sum1);
        System.out.println("-----END-------------");

        dd.s.Sub.sub1();
    }
   
}