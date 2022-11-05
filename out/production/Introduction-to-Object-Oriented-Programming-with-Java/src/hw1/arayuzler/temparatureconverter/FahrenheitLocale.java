package hw1.arayuzler.temparatureconverter;

public class FahrenheitLocale extends Locale{

    public double getConvert(double temperature){

        return temperature * 1.8 + 32;
    }
}
