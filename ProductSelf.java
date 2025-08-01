public class ProductSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        for(int i =0;i< nums.length; i++) {
            int product = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    product *= nums[j];
                }
            }
            System.out.print(product + " ");
        }
    }
}
