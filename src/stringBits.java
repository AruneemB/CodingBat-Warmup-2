public String stringBits(String str)
{
    String stringBitsStr = "";
    for(int i = 0; i < str.length(); i += 2)
    {
        stringBitsStr += str.substring(i, i + 1);
    }
    return stringBitsStr;
}
