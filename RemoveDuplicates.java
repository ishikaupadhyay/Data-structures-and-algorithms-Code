import java.util.HashSet;
import java.util.Arrays;

class Solution {
//    // public int removeDuplicates(int[] nums)
//      { //METHID-1(BRUTE FORCE )TC-O(N),SC-O(N)
//      HashSet<Integer> seen=new HashSet<>();
     
//      int index=0;//starts frm this index

//      for(int num:nums)
//      {
//         if(!seen.contains(num))
//         {
//             seen.add(num);

//             nums[index]=num;//jitne bhi no(unique) num mai aayenga...utna index mai aajaega (mttlb  no.of uniq elements)
//             index++;//aage badhte chlo
//         }
//      }return index;
//     }


//METHOD - 2(OPTIMAL),O(n)&O(1)
   public int removeDuplicates(int[] nums)
{ Arrays.sort(nums);
    int n=nums.length;

    if (n==0)return 0;

    //MAIN CONDITION:
    int i=0; //strting frm index 1 
//j=nearby element of i 
//its a sorted array ,so duplicate elements if exist stays nearby only!
for(int j=1;j<n;j++){
    if (nums[j]!=nums[i])
    i++;
    nums[i]=nums[j];//if ele=uniq , bring it forward!
}
return i+1;//index ('kitne uniq el nkle')
}



    public static void main(String[]args){
        int []nums={1,2,36,1,2,5,1,36,15};

        Solution sol=new Solution();
        int k =sol.removeDuplicates(nums);

        System.out.println("NO OF UNIQUE elements ARE :"+k);

        //printing new array :
        System.out.println("NEW ARRAY : ");

        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    
    }
}