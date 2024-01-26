public String stringSplosion(String str)
{
    String stringSplosion = "";
    for(int i = 0; i < str.length(); i++)
    {
        stringSplosion += str.substring(0, i + 1);
    }
    return stringSplosion;
}
