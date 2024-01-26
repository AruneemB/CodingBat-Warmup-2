public String altPairs(String str)
{
    String altPairs = "";
    for(int i = 0; i < str.length(); i++)
    {
        if(i == 0 ||
                i == 1 ||
                i == 4 ||
                i == 5 ||
                i == 8 ||
                i == 9 ||
                i == 12 ||
                i == 13) altPairs += str.charAt(i);
    }
    return altPairs;
}
