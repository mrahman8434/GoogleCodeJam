
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class CoinJam2 {

    public static void main(String[] args) {
        int n = 32, j = 500;
        char[] s1 = new char[n];
        Arrays.fill(s1, '0');
        s1[n - 1] = '1';
        s1[n / 2 - 1] = '1';
        BigInteger[] mult = new BigInteger[11];
        for (int i = 2; i <= 10; i++) {
            mult[i] = new BigInteger(new String(s1), i);
        }
        char[] s2 = new char[n];
        Arrays.fill(s2, '0');
        s2[n / 2] = '1';
        BigInteger a1 = mult[2];
        int count = 0;
        for (int i = 1; count < j; i += 2) {
            BigInteger add = new BigInteger(new String(s2), 2);
            add = add.add(new BigInteger("" + i));
            BigInteger result = add.multiply(a1);
            System.out.print(result.toString(2));
            for (int k = 2; k <= 10; k++) {
                System.out.print(" " + mult[k]);
            }
            count++;
            System.out.println();

        }
    }
}
