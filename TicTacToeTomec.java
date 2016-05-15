
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
public class TicTacToeTomec {

    public static void main(String[] args) {

        File inputFile = new File("C:/codejam/A-large-practice.in");
        File outputFile = new File("C:/codejam/A-large-practice.out");

        try {
            Scanner input = new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = Integer.parseInt(input.nextLine());

            char[][] array = new char[4][4];

            for (int i = 1; i <= testCases; i++) {
                
                int win=0;
                int countX = 0;
                int countO = 0;
                int countT = 0;
                int spaceCount=0;

                for (int j = 0; j < 4; j++) {  //to create the 2d array
                    String line = input.next();
                    for (int k = 0; k < 4; k++) {
                        array[j][k] = line.charAt(k);

                    }
                    input.nextLine();
                }

               
                for (int j = 0; j < 4; j++) {  //traversing through the rows
                    for (int k = 0; k < 4; k++) {

                        if (array[j][k] == 'X') {
                            countX++;
                        } else if (array[j][k] == 'O') {
                            countO++;
                        } else if (array[j][k] == 'T') {
                            countT++;
                        }
                        else if(array[j][k]=='.'){
                            spaceCount++;
                        } 
                    }
                    if ((countX == 4 || (countX == 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"X won");
                        win++;
                        
                       
                    } else if ((countO== 4 || (countO== 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"O won");
                        win++;
                        

                    }
                    countX = 0;
                    countO = 0;
                    countT = 0;
                }
                //---------------------------------------- Start of columns

                for (int k = 0; k < 4; k++) {  //traversing through columns
                    for (int j = 0; j < 4; j++) {

                        if (array[j][k] == 'X') {
                            countX++;
                        } else if (array[j][k] == 'O') {
                            countO++;
                        } else if (array[j][k] == 'T') {
                            countT++;
                        }
                    }
                    if ((countX == 4 || (countX == 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"X won");
                        win++;
                       
                    } else if ((countO== 4 || (countO== 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"O won");
                        win++;
                        

                    }
                    countX = 0;
                    countO = 0;
                    countT = 0;
                }
                //------------------------------------------------Diagonal backward slash
                for (int j = 0; j < 4; j++) {
                        if (array[j][j] == 'X') {
                            countX++;
                        } else if (array[j][j] == 'O') {
                            countO++;
                        } else if (array[j][j] == 'T') {
                            countT++;
                        }
                }
                 if ((countX == 4 || (countX == 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"X won");
                        win++;
                        
                    } else if ((countO== 4 || (countO== 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"O won");
                        win++;
                        

                    }
                 countX = 0;
                    countO = 0;
                    countT = 0;
                    
                    //-------------------------------- Diagonal forward slash
                    if (array[0][3] == 'X') {
                            countX++;
                        } else if (array[0][3] == 'O') {
                            countO++;
                        } else if (array[0][3] == 'T') {
                            countT++;
                        }
                    if (array[1][2] == 'X') {
                            countX++;
                        } else if (array[1][2] == 'O') {
                            countO++;
                        } else if (array[1][2] == 'T') {
                            countT++;
                        }
                    if (array[2][1] == 'X') {
                            countX++;
                        } else if (array[2][1] == 'O') {
                            countO++;
                        } else if (array[2][1] == 'T') {
                            countT++;
                        }
                    if (array[3][0] == 'X') {
                            countX++;
                        } else if (array[3][0] == 'O') {
                            countO++;
                        } else if (array[3][0] == 'T') {
                            countT++;
                        }
                    if ((countX == 4 || (countX == 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"X won");
                        win++;
                        
                    } else if ((countO== 4 || (countO== 3 && countT == 1))&&(win==0)) {
                        bw.write("Case #"+i+": "+"O won");
                        win++;
                        

                    }
                 countX = 0;
                    countO = 0;
                    countT = 0;
                
                    
                    //------------------------------------------------
                    if (win==0){
                        if(spaceCount>0){
                            bw.write("Case #"+i+": "+"Game has not completed");
                            
                        }
                        else
                            bw.write("Case #"+i+": "+"Draw");
                    }
                    
                    bw.newLine();

                    
                

            }
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
