public class Main {
    public static void main(String[] args) {
        System.out.println(fastTrack(34323443,5,1000000007));
    }

    static long fastTrack(long a, long b, int n){
        long  r=1;

        while (b>0){
            if((b&1)!=0){
                r=(r*a%n)%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;

        }
        return r;
    }
}