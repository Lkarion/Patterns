package adapter;

public class TranslatorFromRussian implements Translator{

    @Override
    public String translateIntoEnglish(String message) {
        return "Good afternoon";
    }
}
