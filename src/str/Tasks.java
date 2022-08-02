package str;

public class Tasks {
    public void task1(){
        String str = "testfull untestable testless testing";
        String test = "test";
        char[] testChar = test.toCharArray();
        char[] strChar = str.toCharArray();
        //String[] words = str.split(" ");
        int count = 0;
        int value = 0;
        for (int i = 0; i < strChar.length; i++) {
            for (int j = 0; j < testChar.length; j++) {
                if (strChar[i] == testChar[j]){
                    count++;
                    i++;
                }
            }
        }
        value = count / test.length();
        System.out.printf("В строке слово %s встречается %d раз\n", test, value);
    }

    public void task2(){
        String str = "aasdfghjkl";
        char firstSymbol = str.charAt(0);
        char averageSymbol = str.charAt(str.length()/2);
        char lastSymbol = str.charAt(str.length() - 1);
        System.out.printf("В строке %s первый символ - %s, средний - %s ,последний - %s.\n", str, firstSymbol, averageSymbol,
                lastSymbol);

    }

    public void task3(){
        String str = "asdhfghasdfhgh";
        char[] strChar = str.toCharArray();
        int[] indexes = new int[10];
        char lastSymbol = strChar[strChar.length - 1];

        for (int i = 0; i < strChar.length; i++) {
            if (lastSymbol == strChar[i]){
                System.out.printf("%d\t", i);
            }
        }
        System.out.println();
    }

    public void task4(){
        String str = "1212313321344445345";

        char[] strChar = str.toCharArray();
        String number = "1234567890";
        char[] numbers = number.toCharArray();

        int count = 0;
        int value = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < strChar.length; j++) {
                if (strChar[j] == numbers[i]){
                    count++;
                }
                else{
                    if (value <= count){
                        value = count;
                        count = 0;
                    }
                    else{
                        count = 0;
                    }
                }
            }
        }
        System.out.println(value);

    }
}
