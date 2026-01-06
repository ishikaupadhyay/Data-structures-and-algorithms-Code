// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class leftrotateMethII {
    public void rotateArrayByOne(int[] nums) 
    {
        if (nums == null || nums.length <= 1) return;
        
     //store the first var in a temp variable
     int temp=nums[0];
     //shift each element backward by 1 
     for(int i=1;i<nums.length;i++){
         nums[i-1]=nums[i];
     }
     //set first var to last (left rotation by 1)
     nums[nums.length-1]=temp;
    }
    



    public static void main(String[] args)
     {
        int[] nums = {1, 3, 5, 6, 7};
        leftrotateMethII sol = new leftrotateMethII();
        sol.rotateArrayByOne(nums);

        for (int x : nums) {
            System.out.print(x + " ");
        }
    }
}
