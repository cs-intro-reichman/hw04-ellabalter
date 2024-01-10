public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String s = "One two tHRee world";
        System.out.println(capVowelsLowRest(s));

    }

    public static String capVowelsLowRest(String s) {
        String modifiedVowels = "";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if ( (vowels.indexOf(c) == -1) && (s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')){
                c = (char) (c + 32);

            }
            else
            {
                if ((vowels.indexOf(c) != -1) && (s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
                {
                    c = (char) (c - 32);
                }
            }
            modifiedVowels = modifiedVowels + c;
        }
        return modifiedVowels;
    }




    // for (int i = 0; i < length; i++) {
    //            char c = s.charAt(i);
    //            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
    //                strConversion = strConversion + ((char) (c + 32));
    //                }
    //                else {
    //                strConversion = strConversion + ((char) c);
    //
    //            }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
