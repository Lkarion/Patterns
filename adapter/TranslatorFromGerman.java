package adapter;

public class TranslatorFromGerman implements Translator {

    @Override
    public String translateIntoEnglish(String message) {
        return "Good afternoon";
    }
}
