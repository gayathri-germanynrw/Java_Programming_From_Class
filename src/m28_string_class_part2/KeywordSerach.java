package m28_string_class_part2;

public class KeywordSerach {
    public static void main(String[] args) {
        String text="Code without tests is broken by design";
        String keyword="DESIGN";
        boolean result=containsKeyword(text,keyword);
        System.out.println("result = " + result);

        String str2="      ";
        String str3="hfhfhfh           ";
        System.out.println("str2.isEmpty() = " + str2.isEmpty());
        System.out.println("str3.isBlank() = " + str3.isBlank());
        
    }
    public static boolean containsKeyword(String text, String keyword){
        return text.toLowerCase().contains(keyword.toLowerCase());
    }
}
