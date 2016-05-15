
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
public class RevengePancakes {
    

    public static void flip(char[] charArray, int startIndex, int endIndex) {
        

// choose which index to start and end at.
        for (int i = startIndex; i <= endIndex; i++) {

            if (charArray[i] == '+') {

                charArray[i] = '-';

            } else if (charArray[i] == '-') {

                charArray[i] = '+';

            }

        }
        
        

    }

    public static void main(String[] args) {

        File inputFile = new File("C:/codejam/B-large.in");
        File outputFile = new File("C:/codejam/B-large.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = Integer.parseInt(br.readLine());

            for (int i = 1; i <= testCases; i++) {
                
                char[] pancakes= br.readLine().toCharArray();
                
                
              
               int countFlip=0;
                
                for (int k=0;k<pancakes.length;k++){
                    if(k==(pancakes.length-1)){
                        if(pancakes[k]=='-'){
                            flip(pancakes,0,k);
                            countFlip++;
                        }
                    }
                    else{
                    if (pancakes[k]!=pancakes[k+1]){
                        flip(pancakes,0,k);
                        countFlip++;
                    }
                    
                    }
                    
                }
                
                
                bw.write("Case #"+i+": "+countFlip);
                
                bw.newLine();
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
