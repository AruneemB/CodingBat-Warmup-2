public String stringX(String str)
{
    String stringXOutput = "";

    if(str.equalsIgnoreCase("xx") || str.equalsIgnoreCase("x") || str.equalsIgnoreCase("")) return str;

    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i) != 'x') stringXOutput += str.charAt(i);
    }

    if(str.charAt(0) == 'x') stringXOutput = "x" + stringXOutput;
    if(str.charAt(str.length() -1) == 'x') stringXOutput += "x";

    return stringXOutput;
}
