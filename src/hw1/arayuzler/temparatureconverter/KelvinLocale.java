package hw1.arayuzler.temparatureconverter;

public class KelvinLocale extends Locale{

    public double getConvert(double temperature){

        return temperature + 273.15;
    }
}
