package homework3.task3;

public class Main {
//    В каждом предложении текста(текст взять любой из интернета) поменять местами первое слово с последним, не изменяя длины предложения.
//    Дополнительное задание
//    Вывести все предложения заданного текста(текст взять любой из интернета) в порядке возрастания количества слов в каждом из них.
public static void main(String[] args) {
    String sentence;
    StringBuilder stringBuilder = new StringBuilder(" В рамках конкурса разработчики могут использовать как сами игры, создавая ремейки или сиквелы, так и отдельных персонажей для разработки конверсий и комбинаций. В списке при этом отсутствуют крупные тайтлы вроде Silent Hill, Metal Gear или Castlevania. Разработчикам предлагается список из более чем 70 игр, в том числе Gradius, Salamander, Parodius, Star Soldier и Crisis Force.");
    while (stringBuilder.length() != 0) {
        int index = stringBuilder.indexOf(".") + 1;
        sentence = stringBuilder.substring(1, index);
        System.out.println("Оригинальное предложение: ");
        System.out.println(sentence);
        System.out.println();
        System.out.println("Переделанное предложение: ");
        System.out.println();
        int indexfirst = sentence.indexOf(" ") + 1;
        String firstWord = sentence.substring(0, indexfirst);
        int indexsecond = sentence.indexOf(".");
        String lastWord = sentence.substring(sentence.lastIndexOf(" "), indexsecond) + " ";
        sentence = sentence.replace(firstWord, lastWord);
        sentence = sentence.substring(0, sentence.lastIndexOf(" ") + 1);
        sentence += firstWord;
        System.out.println(sentence);
        System.out.println("\n" + "Следующее предложение" + "\n");
        stringBuilder.delete(0, index);
    }


}
}
