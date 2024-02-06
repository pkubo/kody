public class Has271 {
    public void has271(int[] nums) {
        boolean t = false;
        for(int i = 0;i<nums.length-2;i++)
        {
            if(nums[i]+5 == nums[i+1])

                for(int j = -2;j<=2;j++)
                {
                    if(nums[i]-1==nums[i+2]+j)
                        t = true;
                }
        }
        System.out.println(t);
    }

}
