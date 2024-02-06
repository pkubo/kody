public class NoTriples {
    public void noTriples(int[] nums) {
        boolean t = true;
        for(int i = 0;i<nums.length-2;i++)
        {
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2])
            {
                t = false;
            }
        }
        System.out.println(t);
    }

}
