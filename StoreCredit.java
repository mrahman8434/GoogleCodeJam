
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
public class StoreCredit {
    public static void main(String[]args){
        
        File inputFile = new File("C:/codejam/A-large-practice.in");
        File outputFile = new File("C:/codejam/A-large-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            
            
            for (int i=1;i<=testCases;i++){
                int c = Integer.parseInt(br.readLine());
                int l = Integer.parseInt(br.readLine());
                String itemValue[]= br.readLine().split(" ");
                for(int j=0;j<itemValue.length;j++){
                    for(int k=j+1;k<itemValue.length;k++){
                        if (Integer.parseInt(itemValue[j])+Integer.parseInt(itemValue[k])==c)
                            bw.write("Case #"+i+": "+(j+1)+" "+(k+1));
                    }
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
