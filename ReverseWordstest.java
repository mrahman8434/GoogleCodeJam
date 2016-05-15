/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahbubur
 */
public class ReverseWordstest {
    public static void main(String[]args){
        String in= "this is a test";
        String out= "";
        int j=in.length();
        int i=in.length();
        while(i>=0){
            if(i==0){
                out=out+" "+in.substring(i, j);
                i--;
            }
            else{
            if ((in.charAt(i-1)==' ') || (i==0) ){
                out=out+in.substring(i, j)+" ";
                j=i-1;
                i--;
                        }
            else
                i--;
        }
        }
        
        System.out.println(out);
    }
}
