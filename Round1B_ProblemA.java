
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahbubur
 */
public class Round1B_ProblemA {

    public static String matchRemove(String bigString, String toFind) {
        char[] array = toFind.toCharArray();
        char[] bigArray = bigString.toCharArray();
        int foundCounter = 0;

        for (int i = 0; i < toFind.length(); i++) {
            for (int j = 0; j < bigString.length(); j++) {
                if (array[i] == bigArray[j]) {
                    foundCounter++;
                    bigArray[j] = '*';
                    break;
                }
            }
        }
        if (foundCounter == toFind.length()) {
            String out = new String(bigArray);
            return out;
        } else {
            return "-1";
        }
    }

    public static void main(String[] args) {

        File inputFile = new File("C:/codejam/A-large-practice.in");
        File outputFile = new File("C:/codejam/A-large-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCases; i++) {
                String S = br.readLine();
               

                int length = S.length();

                String out = "";
                
                while (!matchRemove(S, "ZERO").equals("-1")) {
                    out += "0";
                    S = matchRemove(S, "ZERO");
                }
                while (!matchRemove(S, "TWO").equals("-1")) {
                    out += "2";
                    S = matchRemove(S, "TWO");
                }
                while (!matchRemove(S, "FOUR").equals("-1")) {
                    out += "4";
                    S = matchRemove(S, "FOUR");
                }
                while (!matchRemove(S, "SIX").equals("-1")) {
                    out += "6";
                    S = matchRemove(S, "SIX");
                }
                while (!matchRemove(S, "EIGHT").equals("-1")) {
                    out += "8";
                    S = matchRemove(S, "EIGHT");
                }        
                while (!matchRemove(S, "ONE").equals("-1")) {
                    out += "1";
                    S = matchRemove(S, "ONE");
                }
                while (!matchRemove(S, "THREE").equals("-1")) {
                    out += "3";
                    S = matchRemove(S, "THREE");
                }
                while (!matchRemove(S, "FOUR").equals("-1")) {
                    out += "4";
                    S = matchRemove(S, "FOUR");
                }
                while (!matchRemove(S, "FIVE").equals("-1")) {
                    out += "5";
                    S = matchRemove(S, "FIVE");
                }
                while (!matchRemove(S, "SEVEN").equals("-1")) {
                    out += "7";
                    S = matchRemove(S, "SEVEN");
                }
                 while (!matchRemove(S, "NINE").equals("-1")) {
                    out += "9";
                    S = matchRemove(S, "NINE");
                }
                
//-----------------------------------------------------------------------
                String compS = "";
                for (int j = 0; j < length; j++) {
                    compS += "*";
                }
                if (!S.equals(compS)) {
                    out +="*";
                }
                
                char[] ChArray= out.toCharArray();
               Arrays.sort(ChArray);
               String sOut= new String(ChArray);
                
                System.out.println(sOut);
                bw.write("Case #" + i + ": " + sOut);
                bw.newLine();

            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
