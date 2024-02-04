public class ArrayCount9 {
    public void arrayCount9(int[] nums) {
        int l = 0;
        for(int i = 0 ;i<nums.length;i++)
        {
            if(nums[i]==9)
            {
                l = l+1;
            }
        }
        System.out.println(l);
    }
}
