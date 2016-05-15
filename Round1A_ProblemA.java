
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
public class Round1A_ProblemA {
    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/A-large.in");
        File outputFile = new File("C:/codejam/A-large.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            for (int i=1;i<=testCases;i++){
                
                String S=br.readLine();
                String A="";
                A=S.substring(0,1);
                
                for (int j=1;j<S.length();j++){
                    String firstElement= A.substring(0,1);
                    if(firstElement.compareTo(S.substring(j,j+1))>0){
                        A=A+S.substring(j,j+1);
                    }
                    else if (firstElement.compareTo(S.substring(j,j+1))==0){
                        A=S.substring(j,j+1)+A;
                    }
                    else{
                        A=S.substring(j,j+1)+A;
                    }
                    
                    
                    
                    
                }
                System.out.println(A);
                bw.write("Case #"+i+": "+A);
                bw.newLine();
                
                
                
                
                
                
                
                
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       

    }
    
}
