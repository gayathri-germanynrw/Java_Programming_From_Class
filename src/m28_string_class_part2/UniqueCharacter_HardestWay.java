package m28_string_class_part2;

public class UniqueCharacter_HardestWay {
    public static void main(String[] args) {
        String str="aabccd";
        String unique="";
        
        int frequency=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }
            if((unique.indexOf(ch)==-1)) {
                if (frequency == 1) {
                    unique += ch;
                }
            }

        }

        System.out.println("unique = " + unique);
    }
}
