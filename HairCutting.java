
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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


public class HairCutting {
    public static void main(String[]args){
        File inputFile = new File("C:/codejam/B-small-practice.in");
        File outputFile = new File("C:/codejam/B-small-practice.out");

        try {
            Scanner in=new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            PrintWriter pw=new PrintWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(in.nextLine());
            int timer;
            
            for (int i=1;i<=testCases;i++){
                
               timer=0;
               
                
                int numBarber= in.nextInt(); 
                
                int[] bTime=new int[numBarber];
                int myPos=in.nextInt();
                int[] servedOrder=new int[myPos];
                int s=0; // to fill served orderArray
                
                for (int j=0;j<numBarber;j++){  //fill array with barber time needed to serve 1 customer
                    bTime[j]=in.nextInt();
                    
                }
                
                while(myPos >0){
                for(int j=0;j<numBarber;j++){
                   if (timer%bTime[j]==0){
                       servedOrder[s]=j+1;
                       s++;
                       myPos--;
                       if(myPos==0){
                           break;
                       }
                   }
                   
                }
                timer++;
                }
                
                bw.write("Case #"+i+": "+servedOrder[servedOrder.length-1]);
                bw.newLine();
               
            }
            bw.close();
            
            

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       
    }
    
}
