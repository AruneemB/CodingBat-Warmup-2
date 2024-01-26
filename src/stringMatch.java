public int stringMatch(String a, String b)
{
    int length = Math.min(a.length(), b.length());
    int count = 0;

    for(int i = 0; i < length -1; i ++)
    {
        if(a.substring(i, i +2).equalsIgnoreCase(b.substring(i, i+2))) count++;
    }

    return count;
}
