package m28_string_class_part2;

public class MutableSequenceOfCharacters {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("java");
        stringBuilder.append(" Is a good language");
        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);
        String str_withToString=stringBuilder.toString();
        System.out.println("str_withToString = " + str_withToString);
        
        StringBuffer stringBuffer=new StringBuffer("Gayathri ");
        stringBuffer.append("is like finix bird");
        System.out.println("stringBuffer = " + stringBuffer);
        
    }
}
