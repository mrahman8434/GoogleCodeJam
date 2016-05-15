
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
public class ReverseWords {

    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/B-large-practice.in");
        File outputFile = new File("C:/codejam/B-large-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            String reverse[];
            
            for (int i=1;i<=testCases;i++){
                String line = br.readLine();
                reverse= line.split(" ");
                bw.write("Case #"+i+": ");
                for(int j=reverse.length-1;j>=0;j--){
                    bw.write(reverse[j]);
                    bw.write(" ");
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
