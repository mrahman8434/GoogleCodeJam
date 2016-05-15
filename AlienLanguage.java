
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahbubur
 */
public class AlienLanguage {
   public static void main(String[]args){
       File inputFile = new File("C:/codejam/test.in");
        File outputFile = new File("C:/codejam/test.out");

        try {
            Scanner input= new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int l = input.nextInt();
            int d = input.nextInt();
            int n = input.nextInt();

            String[] words = new String[d];
            for (int i = 0; i < d; i++) {
                words[i] = input.nextLine();
            }

            for (int k = 0; k < n; k++) {
                char[] chars = input.nextLine().toCharArray();
                StringBuilder pattern = new StringBuilder();
                pattern.append('^');
                for (char c : chars) {
                    if (c == '(') {
                        pattern.append('[');
                    } else if (c == ')') {
                        pattern.append(']');
                    } else {
                        pattern.append(c);
                    }
                }
                pattern.append('$');

                int result = 0;
                Pattern p = Pattern.compile(pattern.toString());
                for (int i = 0; i < d; i++) {
                    if (p.matcher(words[i]).matches()) {
                        result++;
                    }
                }

                System.out.println("Case #" + (k + 1) + ": " + result);
            }
        
            

        } catch (IOException ex) {
            ex.printStackTrace();

        }

        
   } 
}
