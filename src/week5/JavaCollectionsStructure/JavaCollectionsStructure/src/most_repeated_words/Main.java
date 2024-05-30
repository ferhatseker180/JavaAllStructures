package week5.JavaCollectionsStructure.JavaCollectionsStructure.src.most_repeated_words;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static String mostRepateWord(String sentences) {

        // Map key bölümünde kelimenin kendisini value bölümünde kaç defa geçtiğini tutar.
        Map<String, Integer> word = new HashMap<>();
        // Split ile cümle içerisindeki kelimeler ayrılır ve String arrayi içerisine atılır.
        String[] newSentences = sentences.split(" ");

        // Kelimeler büyük küçük harf duyarlılığı olmaması için küçük hale getirilir.
        // Daha önce kelimenin geçip geçmediği kontrol edilir eğer geçtiyse value 1 arttırılır geçmediyse 1 değeri atanır.
        for (String sentence : newSentences) {
            String finalSentences = sentence.toLowerCase();
            if (word.containsKey(finalSentences)) {
                word.put(finalSentences, word.get(finalSentences) + 1);
            } else {
                word.put(finalSentences, 1);
            }
        }
        // En çok tekrar eden kelime başlangıçta null olur ve tekrar etme sayısı başlangıçta 0'a eşittir.
        String mostRepeated = null;
        int max = 0;

        // Burada 0 olarak başlangıç değeri verilen max değeri value değeri kendisinden büyükse yeni değeriyle değiştirilir.
        // O değere sahip olan key değeri en çok tekrar eden kelime değişkenine atanır.
        for (Map.Entry<String, Integer> entry : word.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostRepeated = entry.getKey();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return mostRepeated;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kelimeyi Giriniz: ");
        String sentences = input.nextLine();
        // Fonksiyon burada çağrılır.
        String mostRepeatWord = mostRepateWord(sentences);
        System.out.println("Most Repeated Words: " + mostRepeatWord);


    }
}