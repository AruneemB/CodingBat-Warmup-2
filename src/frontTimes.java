public String frontTimes(String str, int n)
{
    String frontTimesOutput = "";

    int endingIndex = 3;

    if(str.length() < 3)
    {
        endingIndex = str.length();
    }

    for(int i = 0; i < n; i++)
    {
        frontTimesOutput += str.substring(0, endingIndex);
    }

    return frontTimesOutput;
}
