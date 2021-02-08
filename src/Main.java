import java.text.Collator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        addWords(words);
        printCountOfRepeatedWords(words);

    }

    public static void addWords (Collection<String> words){
        words.add("add");
        words.add("Java");
        words.add("String");
        words.add("int");
        words.add("long");
        words.add("char");
        words.add("boolean");
        words.add("long");
        words.add("char");
        words.add("boolean");
        words.add("String");
        words.add("int");
        words.add("long");
        words.add("char");
        words.add("Java");
        words.add("int");
        words.add("int");
        words.add("String");
    }
    public static void printCountOfRepeatedWords (LinkedList <String> words) {
        Collections.sort(words, new Comparator<String>(){
            @Override
                    public int compare(String o1, String o2){
                return Collator.getInstance().compare(o1, o2);
            }
        });
        String[] arrayWords = new String[words.size()];
        arrayWords = words.toArray(arrayWords);
        int countWords= 1;
        String leastWord = arrayWords[0];
        for (int i=1; i< arrayWords.length;i++){
            if(leastWord.equals(arrayWords[i])){
                countWords++;
            } else {
                System.out.printf("Array have %d words %s%n", countWords, leastWord);
                countWords =1;
                leastWord = arrayWords[i];
            }
        }

    }
}
