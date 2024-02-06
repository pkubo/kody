public class Array667 {
    public void array667(int[] nums) {
        int l = 0;
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i]==6 && nums[i+1]>=6)
            {
                l++;
            }
        }
        System.out.println(l);
    }

}
