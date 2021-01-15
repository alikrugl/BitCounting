public class BitCounting {

    /**
     *  Takes a non-negative integer as input,
     *  and returns the number of bits that are equal to one in the binary representation of that number
     */
    public static int countBits(int n){
        int count =0;
        while(n>0){
            count+=n&1;
            n>>=1;
        }
        return count;
    }

}