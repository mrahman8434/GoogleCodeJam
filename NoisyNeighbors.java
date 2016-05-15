
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
public class NoisyNeighbors {
    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/test.in");
        File outputFile = new File("C:/codejam/test.out");

        try {
            Scanner in= new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= in.nextInt();
            
            
            for (int i=1;i<=testCases;i++){
                int R = in.nextInt();
                int C= in.nextInt();
                int N= in.nextInt();
                
                int numApt= R*C;
                
                
                if ((numApt%2==0)&&(N <= (R*C/2))){
                    System.out.println(0);
                }
                else if ((numApt%2==1)&&(N<=(R*C/2)+1)){
                    System.out.println(0);
                }
                else
                    System.out.println("Continue");
                
                
                
                
                
            }
            bw.close();
            in.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       

    }
    
}
