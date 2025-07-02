// Max voting 
// an element should occur more than n/2 times . 


class Majority_Element{

            public static int majorityElement(int[] nums) {
            
        int count=0;
        int leader = nums[0]; //2
        for (int i=0;i<nums.length;i++) // [2 ,2 , 5, 4, 9, 2, 2, ]
            {
                
                if(nums[i]==leader) 
                {
                    count++;
                }
                else{
                    count--;
                }
                if(count==0)
                {
                    leader = nums[i+1];
                }
            }
            return leader;
        }

    public static void main(String[] args) {

        int[] a= {2,2,1,1,1,2,2};
        int i = majorityElement(a);
        System.out.println(i);
    }

        
    
}