
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahbubur
 */
public class Round1A_ProblemB {

    public static void main(String[] args) {

        File inputFile = new File("C:/codejam/B-large-practice.in");
        File outputFile = new File("C:/codejam/B-large-practice.out");

        try {

            Scanner in = new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = in.nextInt();

            int[] array;

            for (int i = 1; i <= testCases; i++) {

                int N = in.nextInt();
                //System.out.println(N);

                int numElem = (N * 2 - 1) * N;
                array = new int[numElem];

                for (int j = 0; j < numElem; j++) {
                    array[j] = in.nextInt();
                }
                Arrays.sort(array);

                for (int j = 0; j < numElem; j++) {
                    System.out.print(array[j] + " ");
                }
                String sol = "";
                int count = 1;
                for (int j = 0; j < numElem - 1; j++) {

                    if (array[j] == array[j + 1]) {
                        count++;
                    }
                    
                    if (array[j] != array[j + 1]) {
                        if (count % 2 != 0) {
                            sol = sol + " " + array[j];
                        }
                        count = 1;

                    }
                    if ((j == numElem - 2) && array[array.length - 1] != array[array.length - 2]) {
                        sol = sol + " " + array[array.length - 1];
                    }
                }

                bw.write("Case #" + i + ":" + sol);
                System.out.println("Case #" + i + ":" + sol);
                bw.newLine();

            }
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
