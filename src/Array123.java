public class Array123 {
    public void array123(int[] nums) {
        boolean t = false;
        for(int i = 0 ;i<nums.length-2;i++)
        {
            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3)
            {
                t =true;
            }
        }
        System.out.println(t);
    }

}
