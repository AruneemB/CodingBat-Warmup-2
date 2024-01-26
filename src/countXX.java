int countXX(String str)
{
    int xxCounter = 0;

    for(int i = 0; i < str.length() - 1; i++)
    {
        if(str.substring(i, i + 2).equalsIgnoreCase("xx"))
        {
            xxCounter++;
        }
    }

    return xxCounter;

}
