
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Collections;

import java.util.Arrays;

import java.util.ArrayList;

/**
 *
 *
 *
 * @author Lucas Padden
 *
 */
public class DeceitfulWar {

    public static void main(String[] args) {

        File inputFile = new File("C:/codejam/D-large-practice.in");
        File outputFile = new File("C:/codejam/D-large-practice.out");

        try {

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));
            int testCases = Integer.parseInt(br.readLine());

            String[] Naomi;
            String[] Ken;
            for (int i = 1; i <= testCases; i++) {

                int blocks = Integer.parseInt(br.readLine());
                Naomi = br.readLine().split(" ");
                Ken = br.readLine().split(" ");

                ArrayList<String> NaomiList = new ArrayList<String>(Arrays.asList(Naomi));  // Converting to ArrayList
                ArrayList<String> KenList = new ArrayList<String>(Arrays.asList(Ken));

                Collections.sort(NaomiList);
                Collections.sort(KenList);

                int naomiPointsWar = 0;
                

                for (int j = 0; j < blocks; j++) {  // running for each block

                    double Nvalue = Double.parseDouble(NaomiList.get(0)); //Naomi picks first value
                    double KenMax = Double.parseDouble(KenList.get(KenList.size() - 1));

                    if (KenMax > Nvalue) { //checking if ken has one or more value greater than Nvalue
                        for (int k = 0; k < KenList.size(); k++) { // finding the immediate larger value and removing it along with the nValue
                            if (Double.parseDouble(KenList.get(k)) > Nvalue) {
                                KenList.remove(k);
                                NaomiList.remove(0);
                                break; // to get out of the loop as soon as we find a larger value
                            }

                        }
                    } else { //
                        NaomiList.remove(0);
                        KenList.remove(0);
                        naomiPointsWar++;

                    }

                    //-----------------------------------------------------War Complete    
                }
                System.out.println(naomiPointsWar);

                ArrayList<String> NaomiList2 = new ArrayList<String>(Arrays.asList(Naomi));  // Converting to ArrayList
                ArrayList<String> KenList2 = new ArrayList<String>(Arrays.asList(Ken));

                Collections.sort(NaomiList2);
                System.out.println(NaomiList2);
                Collections.sort(KenList2);
                System.out.println(KenList2);
                
                int naomiPointsDwar = 0;

                for (int j = 0; j < blocks; j++) {
                    double Nvalue = Double.parseDouble(NaomiList2.get(0)); // Naomi picks first value
                    double Kmin = Double.parseDouble(KenList2.get(0));
                    
                    double Kmax = Double.parseDouble(KenList2.get(KenList2.size() - 1));
                        
                    
                     if (Nvalue < Kmin) {
                        KenList2.remove(KenList2.size() - 1);
                        NaomiList2.remove(0);
                        
                    } else{
                        KenList2.remove(0);
                        NaomiList2.remove(0);
                        naomiPointsDwar++;
                        

                    }

                }
                System.out.println(naomiPointsDwar);
                bw.write("Case #"+i+": "+naomiPointsDwar+" "+naomiPointsWar);
                bw.newLine();

            }

            bw.close();

            br.close();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }

}
