import java.util.Arrays;

class multi{
    public static void main(String[] args) {
        int nums[]={2,5};
        int nums1[]={3,4};

        int n=nums.length*nums1.length;
        int[] arr = new int[n];

        int index = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums1.length;j++){
                arr[index++] = nums[i] * nums1[j];
            }
        }
        Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        System.out.println(arr[1]);
    }
}