class kokoeatingbananas{
    public static void main(String[] args){
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int left = 0;
        int right = piles.length;

        while(left<=right){
            int mid = left + (right - left) / 2;
            int hours = 0;
            if(mid == 0) {
                mid = 1; 
            }
            for(int i = 0; i < piles.length; i++){
                hours += (piles[i] + mid - 1) / mid; 
            }
            if(hours > h) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(left);
    }
}