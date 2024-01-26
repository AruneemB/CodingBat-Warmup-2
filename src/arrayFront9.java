public boolean arrayFront9(int[] nums)
{
    if(nums.length < 4)
    {
        for(int num : nums)
        {
            if(num == 9) return true;
        }
        return false;
    }
    else
    {
        for(int i = 0; i < 4; i++)
        {
            if(nums[i] == 9) return true;
        }
        return false;
    }
}
