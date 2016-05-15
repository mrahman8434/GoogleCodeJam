
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
public class Round1B_ProblemB {
    public static void main(String[] args) {

        

        File inputFile = new File("C:/codejam/B-small-attempt0.in");
        File outputFile = new File("C:/codejam/B-small-attempt0.out");

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            
            int testCases= Integer.parseInt(br.readLine());
            
            for (int i=1;i<=testCases;i++){
                String[] array= br.readLine().split(" ");
                
               StringBuilder string1= new StringBuilder(array[0].toString());
                StringBuilder string2=new StringBuilder( array[1].toString());
                
              
                //System.out.println(string1+" "+string2);
                
                //If all chars are ? replace with 0
                int length=string1.length();
                String qString="";
                for(int j=0;j<string1.length();j++){
                    qString+="?"; 
                }
                if (string1.equals(qString)&&string2.equals(qString)){
                    string1=string1.replace("?", "0");
                    string2=string2.replace("?", "0");
                }
                
                //replacing first ? in both strings
                if (string1.substring(0, 1).equals("?")&&(string2.substring(0, 1).equals("?"))){
                    string1="0"+string1.substring(1);
                   
                    string2="0"+string2.substring(1);
                }
                //replacing last ? in strings
                if (string1.substring(length-1, length).equals("?")&& string2.substring(length-1, length).equals("?")){
                    if (string1.substring(length-2, length-1).compareTo(string2.substring(length-2, length-1))<0){
                        string1= string1.replace("?", "9");
                        string2=string2.replace("?", "0");
                                }
                    else{
                        string1= string1.replace("?", "0");
                        string2=string2.replace("?", "9");
                    }
                }
                
                
                // replacing samenumbers if the other one is ? in both strings
                for (int j=0;j<string1.length();j++){
                    if (string1.substring(j, j+1).equals("?") && !string2.substring(j, j+1).equals("?")){
                        string1=string1.replace(string1.substring(j, j+1), string2.substring(j, j+1));
                    }
                    if (string2.substring(j, j+1).equals("?") && !string1.substring(j, j+1).equals("?")){
                        string2=string2.replace(string2.substring(j, j+1), string1.substring(j, j+1));
                    }    
                }
                
                
                //string1=string1.replace("?", "9");
                //string2=string2.replace("?", "0");
                
                bw.write("Case #"+i+": "+string1+" "+string2);
                bw.newLine();
                
                
                
                
                
               
                
                
            }
            bw.close();
            br.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

       

    }
    
    
}
