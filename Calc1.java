class cacl1{
    public static void main(String[] args) {
        int n=11;
        //hamming weight
        int count = 0;
        while(n>0){
            count += n & 1;
            n >>= 1; 
        }
        System.out.println(count);
    }
}