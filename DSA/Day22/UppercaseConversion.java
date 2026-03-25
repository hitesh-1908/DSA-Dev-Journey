class UppercaseConversion {
    public static String toUpperCaseFirstLetterOnly(String str)
    {
        StringBuilder strnew = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        strnew.append(ch);

        for(int i=1; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ' && i < str.length()-1)
            {
                strnew.append(str.charAt(i));
                i++;
                strnew.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                strnew.append(str.charAt(i));
            }
        }

        return strnew.toString();
    }

    public static void main(String[] args)
    {
        String str="hi, i am hitesh bhattad ";
        System.out.println(toUpperCaseFirstLetterOnly(str));
    }
}
