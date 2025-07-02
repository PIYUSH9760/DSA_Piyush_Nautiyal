public class Replace_Elements_with_Greatest_Element_on_Right_Side {

     public static int[] replaceElements(int[] arr) {

        int max = arr[arr.length-1];

        int[] result=new int[arr.length];

        for(int i = arr.length-2 ; i >= 0 ; i--)  
            {                                      
                if(arr[i]<max)
                {
                    result[i] = max;
                }
                else{
                    result[i]=max;
                    int temp = arr[i];
                    max = temp;
                    
                }
                
            }
        result[arr.length-1]=-1;
        return result;
        
    }

    public static void main(String args[])
    { 
        int [] test = {17,18,5,4,6,1};         // 18,6,6,6,1,-1
    int[]run = replaceElements(test);
    for(int i =0;i<=run.length;i++)
    {
        System.out.println(run[i]);
    }

    

    }
    
}
