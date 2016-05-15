
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
public class MushroomMonster {
    public static void main(String[]args){
        
        
        File inputFile = new File("C:/codejam/A-large-practice.in");
        File outputFile = new File("C:/codejam/A-large-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
     
            
            for (int i=1;i<=testCases;i++){
                String numberOfIntervals=br.readLine();
                
                String[] inputArray= br.readLine().split(" ");
               
                
                
                int cakesEaten=0;
                for (int j=0;j<inputArray.length-1;j++){
                    if(Integer.parseInt(inputArray[j])-Integer.parseInt(inputArray[j+1])>0){
                    cakesEaten+=Integer.parseInt(inputArray[j])-Integer.parseInt(inputArray[j+1]);
                    }
                }
                
                int cakesEaten2=0;
                int maxDiff=0;
                for (int j=0;j<inputArray.length-1;j++){
                    
                    if(Integer.parseInt(inputArray[j])-Integer.parseInt(inputArray[j+1])>0){
                        int diff=Integer.parseInt(inputArray[j])-Integer.parseInt(inputArray[j+1]);
                    if(diff>maxDiff){
                        maxDiff=diff;
                    }
                    }
                }
                for(int j=0;j<inputArray.length-1;j++){
                    if(Integer.parseInt(inputArray[j])<maxDiff){
                        cakesEaten2+=Integer.parseInt(inputArray[j]);
                    }
                    else
                        cakesEaten2+=maxDiff;
                } 
                    

                
                
                
                
                bw.write("Case #"+i+": "+cakesEaten+" "+cakesEaten2);
                
                bw.newLine();
                
                
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }
    
}
