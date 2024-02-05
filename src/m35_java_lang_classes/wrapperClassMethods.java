package m35_java_lang_classes;

public class wrapperClassMethods {
    public static void main(String[] args) {
        char ch='a';
        char ch2='&';

       boolean isdigit= Character.isDigit(ch);
        System.out.println(isdigit);
        boolean isLetter= Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        boolean isLettOrDigit=!Character.isLetterOrDigit(ch2);
        System.out.println("isLettOrDigit = " + isLettOrDigit);

        System.out.println("-------------------------------------");

        String str2="abcdefjkjckld4556!@##$$";
        char[] charArray=str2.toCharArray();
        for(char eachChar:charArray){
            //System.out.println(eachChar);
            if(Character.isDigit(eachChar)){
                System.out.println("eachChar = " + eachChar);
            }
            
        }




    }
}
