import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Demo {
    static final String filename = "KP_p-3_n-10_ins-1.dat";
    int[][] v = new int[10][100];
    int[] w = new int[100];

    public static void main(String[] args) {
        File file = new File(Demo.filename);

        Demo demo = new Demo();
        int p = 0, n = 0, maxW = 0;

        try {
            Scanner input = new Scanner(file);
            p = input.nextInt();
            n = input.nextInt();
            maxW = input.nextInt();
            input.nextLine();

            for(int i = 0; i < p; ++i) {
                int m = 0;
                String s = input.nextLine();
                int val = 0;

                for(char c: s.toCharArray()) {
                    System.out.print(c);
                    if (c == '[') continue;
                    if (Character.isDigit(c) == true) {
                        val = val*10 + (c - '0');
                    }
                    else 
                    if (c == ',' | c == ']') {
                        //System.out.print(" " + m + " " + val);
                        demo.v[i][m] = val;
                        ++m;
                        val = 0;
                    }
                }

                System.out.println(" ");
            }

            String s = input.nextLine();
            int m = 0;
            int val = 0;
            for(char c: s.toCharArray()) {
                //System.out.print(c);
                if (c == '[') continue;
                if (Character.isDigit(c) == true) {
                    val = val*10 + (c - '0');
                }
                else 
                if (c == ',' | c == ']') {
                    //System.out.print(" " + m + " " + val);
                    demo.w[m] = val;
                    ++m;
                    val = 0;
                }
            }

            input.close();
        } catch (FileNotFoundException ex) {

        }

        System.out.println(p + "\n" + n + "\n" + maxW);
        for(int i = 0; i < p; ++i) {
            for(int j = 0; j < n; ++j) System.out.print(demo.v[i][j] + " ");
            System.out.println(" ");
        }

        for(int i = 0; i < n; ++i)
            System.out.print(demo.w[i] + " ");

    } 
}   