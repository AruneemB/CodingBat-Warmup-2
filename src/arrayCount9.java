public int arrayCount9(int[] nums)
{
    int ninesCount = 0;
    for(int num : nums)
    {
        if(num == 9) ninesCount ++;
    }
    return ninesCount;
}
