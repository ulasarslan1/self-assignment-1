/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

public class Primes{
    public static void main(String[] args){
        int nValues = 50;
        //boolean isPrime = true;
        out:
        for(int i = 2; i <= nValues; i++){
            //isPrime = true;
            for (int j = 2; j <= Math.sqrt(i) /*i*/; j++){
                if (i % j == 0){
                    //isPrime = false;
                    //break;
                    continue out;
                    }
                }
            System.out.println(i);
            /*if (isPrime)
                System.out.println(i);*/
        }
    }
}