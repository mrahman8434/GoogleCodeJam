
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
import java.lang.StringBuilder;
public class CountingCulture {
    public static long flip(long inputLong){
        
        String input= Long.toString(inputLong);
        StringBuilder builder= new StringBuilder(input);
        builder.reverse();
        long output=Long.parseLong(builder.toString());
        
        return output;
        
    } 
    /*public static int reachDigit(int length){
        int count=0;
        long maxValue= 10^(length-1);
        int current=1;
        
      
       if (length==2){
           return count=10;
       }
        else{
        count=10;
        current=count;
        
    }
    } */
    
    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/test.in");
        File outputFile = new File("C:/codejam/test.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            for (int i=1;i<=testCases;i++){
                
                String inputN= br.readLine();
                int lengthN= inputN.length();
                long N= Long.parseLong(inputN);
                
                int count=1; // main counter
                
                
                
                
                
                
                
                
                
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }
        
        

    }
    
    
}
