
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
public class CookieClicker {
    
    
    public static void main(String[]args){
        File inputFile = new File("C:/codejam/B-large-practice.in");
        File outputFile = new File("C:/codejam/B-large-practice.out");

        try {
            
            Scanner in= new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(in.nextLine());
            
            
            for (int i=1;i<=testCases;i++){
                
                double C = in.nextDouble();
                double F = in.nextDouble();
                double X= in.nextDouble();
                
                double dontBuy= (X/2); // Time needed to buy Cookie Castle
                
                        
                int n=2;
                int m=1;
                double cTime= (C/2);
                double xTime= (X/(2+(F)));
                double buy=cTime + xTime;
                
                if (buy<dontBuy){
                    while(buy<dontBuy){
                        
                        dontBuy=buy;
                        
                        cTime+=(C/(2+(m*F)));
                        
                        xTime= (X/(2+(n*F)));
                        
                        buy= cTime+ xTime;
                        m++;
                        n++;
                    }
                    bw.write("Case #"+i+": "+dontBuy);
                    bw.newLine();
                    
                }
                else{
                    bw.write("Case #"+i+": "+dontBuy);
                    bw.newLine();
                }
                
                
                
                
                
            }
            bw.close();
            

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       

        
        
        
    }
    
}
