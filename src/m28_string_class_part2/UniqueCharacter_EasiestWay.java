package m28_string_class_part2;

public class UniqueCharacter_EasiestWay {
    public static void main(String[] args) {
        String str="aabccd";
        String unique="";

        int frequency=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){ //
                unique+=ch;
            }


        }

        System.out.println("unique = " + unique);
    }
}
