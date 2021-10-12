package be.intecbrussel;

public class stringDemo {
    public static void main(String[] args) {

        String text = "very money";
//        text = text.toUpperCase();
        text = text.concat(" very happy");
        text = text.replace('a', 'o');


        String textToPlaceInUppercase = text.substring(5, 10);
        String textInUppercase = textToPlaceInUppercase.toUpperCase();

        System.out.println(textToPlaceInUppercase);
        text = text.replace(textToPlaceInUppercase, textInUppercase);
        
        System.out.println(text);
    }
}
