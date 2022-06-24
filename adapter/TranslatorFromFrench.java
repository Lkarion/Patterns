package adapter;

public class TranslatorFromFrench implements Translator{


    @Override
    public String translateIntoEnglish(String message) {
        return "Good afternoon";
    }
}
