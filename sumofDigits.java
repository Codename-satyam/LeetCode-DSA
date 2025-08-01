public class sumofDigits {
    public static int sums(int n){
        int sum=0;
        while(n>0){
            sum+= n % 10;
            n /= 10;
        }
        if(sum<10){
            return sum;
        } else {
            return sums(sum);
        }
    }
    public static void main(String[] args) {
        int n = 12345; // Example input
        System.out.println("The sum of the digits is: " + sums(n));
    }
}
