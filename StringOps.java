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
        //String s = "One two tHRee world";
        //System.out.println(capVowelsLowRest(s));
        int[] neww = allIndexOf("Hello world", 'l');
        for (int i = 0; i < neww.length; i++){
            System.out.print(neww[i] + ",");
        }
        System.out.println(camelCase("Intro to coMPUter sCIEncE"));
    }

    public static String capVowelsLowRest(String s) {
        String modifiedVowels = "";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((vowels.indexOf(c) == -1) && (s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
                c = (char) (c + 32);

            } else {
                if ((vowels.indexOf(c) != -1) && (s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) {
                    c = (char) (c - 32);
                }
            }
            modifiedVowels = modifiedVowels + c;
        }
        return modifiedVowels;
    }

    private static String upperCase(String str)
    {
        String lowerCaseString = "";
        char c = str.charAt(0);
        lowerCaseString = lowerCaseString + c;
        for( int i = 1; i < str.length(); i++ ) {
            c = str.charAt(i);
            if (str.charAt(i - 1) == 32 ) {
                if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    c = (char) (c - 32);
                }

            }
            else {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    c = (char) (c + 32);
                }
            }

            lowerCaseString = lowerCaseString + c;
        }
        return lowerCaseString;
    }

    private static String deleteSpaces(String str)
    {
        String modifiedString = "";
        char c = 'a';
        for ( int i = 0; i < str.length(); i++)
        {
            c = str.charAt(i);
            if (str.charAt(i) != 32)
            {
                modifiedString = modifiedString + c;
            }
        }
        return modifiedString;

    }

    public static String camelCase(String string) {
        String finalString = upperCase(string);
        finalString = deleteSpaces(finalString);
        if((finalString.charAt(0) >= 'A') && (finalString.charAt(0) <= 'Z'))
        {
            finalString = ((char)(finalString.charAt(0) + 32)) + finalString.substring(1, (finalString.length()));
        }
        return finalString;
    }


    public static int[] allIndexOf(String string, char chr) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                counter++;
            }
        }

        int[] charIndex = new int[counter];
        int currentIndex = 0;
        for (int i = 0; i < string.length(); i++)
        {

                if (string.charAt(i) == chr)
                {
                    charIndex[currentIndex] = i;
                    currentIndex ++;
                }
        }
        return charIndex;
    }
}
