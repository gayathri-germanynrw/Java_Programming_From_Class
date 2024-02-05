package m28_string_class_part2;

public class FrequencyOfWord {
    public static void main(String[] args) {
        
        String sentence="Java Java Java JAVA Java";
        sentence.toLowerCase();
        //split the sentence into an array of words
        String[] words = sentence.split("\\s+");
        int freq=0;
        for(String word:words){
            System.out.println("word = " + word);
            if(word.equalsIgnoreCase("java")){
                freq++;
            }
            
        }
        System.out.println("freq = " + freq);


    }
}


/*
Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5

 */

