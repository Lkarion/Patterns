package adapter;

public class Meeting {

    public static void main(String[] args) {

        EnglishSpeaker englishSpeaker = new EnglishSpeaker();
        GermanSpeaker germanSpeaker = new GermanSpeaker();
        RussianSpeaker russianSpeaker = new RussianSpeaker();
        FrenchSpeaker frenchSpeaker = new FrenchSpeaker();

        // greetings in their own languages

        System.out.println(englishSpeaker.greet());
        System.out.println(germanSpeaker.greet());
        System.out.println(russianSpeaker.greet());
        System.out.println(frenchSpeaker.greet());

        System.out.println("----------------------");


        // greetings after translation into English

        System.out.println(germanSpeaker.translateIntoEnglish("Guten Tag"));
        System.out.println(russianSpeaker.translateIntoEnglish("Добрый день"));
        System.out.println(frenchSpeaker.translateIntoEnglish("Bon jour"));

    }
}
