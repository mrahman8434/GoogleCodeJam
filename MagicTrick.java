
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
public class MagicTrick {
    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/A-small-practice.in");
        File outputFile = new File("C:/codejam/A-small-practice.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            for (int i=1;i<=testCases;i++){
                int rowChoice1= Integer.parseInt( br.readLine());
                
                
                for(int j=1;j<rowChoice1;j++){  //to skip rows
                   br.readLine();
                }
                String[] numberArray= br.readLine().split(" ");
                
                for(int j=0;j<(4-rowChoice1);j++){  //to skip rows
                    br.readLine();
                }
                
                int rowChoice2= Integer.parseInt( br.readLine());
               
                for(int j=1;j<rowChoice2;j++){  //to skip rows
                    br.readLine();
                }
                String[] numberArray2= br.readLine().split(" ");
                for(int j=0;j<(4-rowChoice2);j++){  //to skip rows
                    br.readLine();
                }
                
                int matchCount=0;
                String value="";
                for(int j=0;j<numberArray.length;j++){
                    for(int k=0;k<numberArray2.length;k++){
                        if(numberArray[j].equals(numberArray2[k])){
                            matchCount++;
                            value=numberArray[j];   
                        }
                        
                        
                    }
                     
                }
                        if(matchCount==0){
                            bw.write("Case #"+i+": "+"Volunteer cheated!");
                        }
                        else if(matchCount==1){
                            bw.write("Case #"+i+": "+value);
                        }
                        else{
                            bw.write("Case #"+i+": "+"Bad magician!");
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
    

