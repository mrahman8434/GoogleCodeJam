
import java.awt.List;
import java.util.ArrayList;

public class CoinJam {

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static long getSdivisor(long n){
        long returnValue=0;
        for(int i=2;i<n;i++){
            long z=n%i;
            if(z==0){
                returnValue=i;
                break;
            }
            
        }
        return returnValue;
    }
    public static void printDivisors(String binary){
       
        long value2=getSdivisor(Long.parseLong(binary,2));
        long value3=getSdivisor(Long.parseLong(binary,3));
        long value4=getSdivisor(Long.parseLong(binary,4));
        long value5=getSdivisor(Long.parseLong(binary,5));
        long value6=getSdivisor(Long.parseLong(binary,6));
        long value7=getSdivisor(Long.parseLong(binary,7));
        long value8=getSdivisor(Long.parseLong(binary,8));
        long value9=getSdivisor(Long.parseLong(binary,9));
        long value10=getSdivisor(Long.parseLong(binary,10));
        
        System.out.println(value2+" "+value3+" "+value4+" "+value5+" "+value6+" "+value7+" "+value8+" "+value9+" "+value10);
    }
    
    
    
    /*public static int[] divisors(String binary){
        
    } */

    public static boolean isJamCoin(String binary) {

        boolean jamCoin=true;
        if (isPrime(Long.parseLong(binary, 2))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 3))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 4))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 5))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 6))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 7))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 8))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 9))) {
            jamCoin = false;
        }
        else if (isPrime(Long.parseLong(binary, 10))) {
            jamCoin = false;
        }
        
        return jamCoin;

    }

    public static void main(String[] args) {
        int count = 0;
        ArrayList<String> binaryArrays = new ArrayList<String>();
        ArrayList<String> jamCoins = new ArrayList<String>();

        for (int i = 32769; i <= 65535; i++) {
            String binaryNumbers = Integer.toBinaryString(i);
            if ((binaryNumbers.charAt(0) == '1' && binaryNumbers.charAt(15) == '1')) {
                binaryArrays.add(binaryNumbers);

            }

        }
        
        
        
        int jamCount=0;
        
        for (int i = 100; i < 150; i++) {
            
            if(isJamCoin(binaryArrays.get(i))){
                jamCount++;
                System.out.print(binaryArrays.get(i)+" ");
                printDivisors(binaryArrays.get(i));
                
                
            }
            
            if(jamCount==50){
                break;
            }

        }
        System.out.println(jamCount);
        
        
        
        
        

        /*
                for(int j=0;j<binaryArrays.size();j++){
                    
                        
                        if(isPrime(Long.parseLong(binaryArrays.get(j),2))){
                            binaryArrays.remove(j);
                        }
                }
                System.out.println(binaryArrays.size());
                
                for(int j=0;j<binaryArrays.size();j++){
                    
                        
                        if(isPrime(Long.parseLong(binaryArrays.get(j),3))){
                            binaryArrays.remove(j);
                        }
                }
		
                System.out.println(binaryArrays.size());
                
                for(int j=0;j<binaryArrays.size();j++){
                    
                        
                        if(isPrime(Long.parseLong(binaryArrays.get(j),4))){
                            binaryArrays.remove(j);
                        }
                }
		
                System.out.println(binaryArrays.size());
                
                for(int j=0;j<binaryArrays.size();j++){
                    
                        
                        if(isPrime(Long.parseLong(binaryArrays.get(j),5))){
                            binaryArrays.remove(j);
                        }
                }
		
                System.out.println(binaryArrays.size());
                for(int j=0;j<binaryArrays.size();j++){
                    
                        
                        if(isPrime(Long.parseLong(binaryArrays.get(j),6))){
                            binaryArrays.remove(j);
                        }
                }
		
                System.out.println(binaryArrays.size());
			
                        
         */
 /*
		
		
//		for(int j = 0; j < binaryArrays.size(); j++)
//		{
//			System.out.println(binaryArrays.get(j));
//		}
                System.out.println(binaryArrays.size());
                
                int num=binaryArrays.size();
                        

		int count1 = 0;
		for(int k = 0; k < num-1; k++)
		{
			String base2 = binaryArrays.get(k);
			long myNum = Long.parseLong(base2, 2);
			if(!isPrime(myNum))
			{
				System.out.println("myNum: " + myNum);
				count1++;
			}
			
			
			String base3 = binaryArrays.get(k);
			long myNum3 = Long.parseLong(base3, 3);
			if(!isPrime(myNum3))
			{
				System.out.println("myNum: " + myNum3);
				count1++;
			}
			
			
			String base4 = binaryArrays.get(k);
			long myNum4 = Long.parseLong(base4, 4);
			if(!isPrime(myNum4))
			{
				System.out.println("myNum: " + myNum4);
				count1++;
			}
			
			
			String base5 = binaryArrays.get(k);
			long myNum5 = Long.parseLong(base5, 5);
			if(!isPrime(myNum5))
			{
				System.out.println("myNum: " + myNum5);
				count1++;
			}
			
			
			String base6 = binaryArrays.get(k);
			long myNum6 = Long.parseLong(base6, 6);
			if(!isPrime(myNum6))
			{
				System.out.println("myNum: " + myNum6);
				count1++;
			}
			
			
			String base7 = binaryArrays.get(k);
			long myNum7 = Long.parseLong(base7, 7);
			if(!isPrime(myNum7))
			{
				System.out.println("myNum: " + myNum7);
				count1++;
			}
			
			
			String base8 = binaryArrays.get(k);
			long myNum8 = Long.parseLong(base8, 8);
			if(!isPrime(myNum8))
			{
				System.out.println("myNum: " + myNum8);
				count1++;
			}
			
			
			String base9 = binaryArrays.get(k);
			long myNum9 = Long.parseLong(base9, 9);
			if(!isPrime(myNum9))
			{
				System.out.println("myNum: " + myNum9);
				count1++;
			}
			;
			
			String base10 = binaryArrays.get(k);
			long myNum10 = Long.parseLong(base10, 10);
			if(!isPrime(myNum10))
			{
				System.out.println("myNum: " + myNum10);
				count1++;
			}
			
			System.out.println(count1);
		}
                
		
		
         */
//		System.out.println(myNum);
//		String x = "100011";
//		int nums = Integer.parseInt(x, 2);
//		System.out.println(nums);
    }
}
