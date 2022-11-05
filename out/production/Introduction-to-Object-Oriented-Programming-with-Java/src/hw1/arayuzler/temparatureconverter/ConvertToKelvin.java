package hw1.arayuzler.temparatureconverter;

public class ConvertToKelvin extends Converter{

    @Override
    public Locale getDefault(String country){

        Locale locale = new KelvinLocale();
        return locale;
    }

}
