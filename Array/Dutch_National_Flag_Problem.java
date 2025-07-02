public class  Dutch_National_Flag_Problem{

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i=0;
        while(i<=high){
            if (nums[i] == 0) {
                int temp = nums[low];
                nums[low]= nums[i];
                nums[i]= temp;
                low++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[high];
                nums[high] = nums[i];
                nums[i] = temp;
                high--;
            }
            else{
                i++;
            }

        }
        for(int j=0;j<nums.length;j++)
        {
            System.out.println(nums[j]);
        }
    }


    public static void main(String args[]) {
        int[] a = {0,0,1,0,2,0,2,0};
        sortColors(a); 
        

    }

}
