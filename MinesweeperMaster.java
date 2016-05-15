
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
public class MinesweeperMaster {

    public static void main(String[] args) {
        File inputFile = new File("C:/codejam/C-small-practice.in");
        File outputFile = new File("C:/codejam/C-small-practice.out");

        try {
            Scanner in = new Scanner(inputFile);
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            int testCases = Integer.parseInt(in.nextLine());

            for (int i = 1; i <= testCases; i++) {
                int R = in.nextInt();
                int C = in.nextInt();
                int M = in.nextInt();
                int nonMines = (R * C) - M;
                boolean possible = true;

                String[][] mineSweeper = new String[R][C];   //Creating the minesweeper board

                for (int j = 0; j < R; j++) {         // Placing mines in all the cells
                    for (int k = 0; k < C; k++) {
                        mineSweeper[j][k] = "*";
                    }
                }

                if ((R > 1 && C > 1) && nonMines >= 4) {
                    mineSweeper[0][0] = "c";
                    mineSweeper[0][1] = ".";
                    mineSweeper[1][0] = ".";
                    mineSweeper[1][1] = ".";
                    nonMines = nonMines - 4;
                    for (int j = 0; j < R; j++) {         // Placing non mine cells in the grid
                        for (int k = 0; k < C; k++) {

                            if ((nonMines != 0) && (j >= 2 || k >= 2)) {
                                mineSweeper[j][k] = ".";
                                nonMines--;
                            }
                        }

                    }

                }else if((R > 1 && C > 1) && nonMines ==1 ){
                    mineSweeper[0][0]="c";
                }
                
                
                else if ((R == 1 || C == 1) && nonMines >= 2) {
                    for (int j = 0; j < R; j++) {         // Placing non mine cells in the grid
                        for (int k = 0; k < C; k++) {
                            if ((j == 0 && k == 0) || (j == 0 && k == 1) || (j == 1 && k == 0)) {

                                if (j == 0 && k == 0) {
                                    mineSweeper[j][k] = "c";
                                    nonMines--;
                                } else {
                                    mineSweeper[j][k] = ".";
                                    nonMines--;
                                }
                            } else if (nonMines != 0) {
                                mineSweeper[j][k] = ".";
                                nonMines--;
                            }
                        }

                    }
                }
                else if((R == 1 || C == 1) && nonMines ==1 ){
                    mineSweeper[0][0]="c";
                }
                
                
                else {
                    possible = false;
                }

                if (possible) {
                    bw.write("Case #" + i + ":");
                    bw.newLine();

                    for (int j = 0; j < R; j++) {
                        for (int k = 0; k < C; k++) {
                            bw.write(mineSweeper[j][k]);
                        }
                        bw.newLine();
                    }
                } else {
                    bw.write("Case #" + i + ":");
                    bw.newLine();
                    bw.write("Impossible");
                    bw.newLine();
                }

            }
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();

        }

    }

}
