boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1) return false;
    String x = str.substring(i);
    return x.startsWith("xx");
}