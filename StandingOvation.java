
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahbubur
 */
public class StandingOvation {

    public static void main(String[] args) {
        File inputFile = new File("C:/codejam/A-large-practice.in");
        File outputFile = new File("C:/codejam/A-large-practice.out");

        try {
            Scanner input = new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

           int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            int N = input.nextInt();
            String s = input.next();
           
            int total = 0, numFriends = 0;
            for (int i = 0; i <= N; i++)
            {
                int d = s.charAt(i) - '0';
                if (d > 0 && total < i)
                {
                    numFriends += i - total;
                    total = i;
                }
                total += d;
            }
            bw.write("Case #"+(n+1)+": "+numFriends);
            bw.newLine();
            

        }
        bw.close();
        input.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
