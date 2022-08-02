import str.Tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {



    public static void main(String[] args){
        Tasks tasks = new Tasks();
        String str = "Я стану программистом";
        System.out.println(str.length());

        String[] s = str.split(" ");
        System.out.printf("В тексте %d слов.\n", s.length);
        String replace = str.replace("программистом", "Java программистом");
        System.out.printf("%s\n", replace);

        tasks.task1();
        tasks.task2();
        tasks.task3();
        tasks.task4();

        String text = "Егор Алла Анна";
        String regex = "A.+?a";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадение " + text.substring(start,end) + " c " + start + " no " + (end - 1) +
                    " позицию ");
        }
        System.out.println(matcher.replaceFirst("Ира"));
        System.out.println(matcher.replaceAll("Ольга"));
        System.out.println(text);
    }

}
