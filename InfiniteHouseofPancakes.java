
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahbubur
 */
public class InfiniteHouseofPancakes {

    private static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int maxIndex(int[] array) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;

    }

    private static int secondMax(int[] array) {
        int max = findMax(array);
        int mIndex = maxIndex(array);
        array[mIndex] = 0;
        int sMax = findMax(array);
        array[mIndex] = max;
        return sMax;
    }

    /*private static int secondMax(int[] array){
        
    } */
    public static void main(String[] args) {
        File inputFile = new File("C:/codejam/B-small-practice.in");
        File outputFile = new File("C:/codejam/B-small-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCases; i++) {
                int D = Integer.parseInt(br.readLine());

                String[] pancakes = br.readLine().split(" ");
                int[] p = new int[pancakes.length];
                for (int j = 0; j < pancakes.length; j++) {
                    p[j] = Integer.parseInt(pancakes[j]);
                }

                for (int j = 0; j < p.length; j++) {
                    if (D == 1) {
                        long mins = (Math.round(p[0] / 2.0));
                        bw.write("Case #" + i + ": " + (mins + 1));
                        break;
                    }
                    else if (findMax(p)==secondMax(p)){
                        bw.write("Case #" + i + ": " + secondMax(p));
                        break;
                    }
                    else if (secondMax(p) == (findMax(p) / 2.0)) {
                        bw.write("Case #" + i + ": " + (secondMax(p)+1));
                        break;
                    }
                    else if (secondMax(p) < (findMax(p) / 2.0)) {
                        long mins = Math.round((findMax(p) / 2.0));
                        bw.write("Case #" + i + ": " + (mins + 1));
                        break;
                    }
                    else if (secondMax(p) > (findMax(p) / 2.0)) {
                        bw.write("Case #" + i + ": " + (secondMax(p)+1));
                        break;
                    }
                    
                    
                }
                bw.newLine();

            }

            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
    }
}
