package hw1.arayuzler.temparatureconverter;

public class TemperatureConverter {

    public static void main(String[] args){

        TemperatureConverter app = new TemperatureConverter();
        app.BaseConverter();
    }

    public static void BaseConverter(){

        double temperature = 25.0;

        Converter celsius = new ConvertToCelsius();
        Converter fahrenheit = new ConvertToFahrenheit();
        Converter kelvin = new ConvertToKelvin();

        System.out.printf("%.2f degrees Celsius is %.2f degrees Fahrenheit\n",celsius.getConvert("",temperature),
                fahrenheit.getConvert("BS",temperature));
        System.out.printf("%.2f degrees Celsius is %.2f degrees Kelvin\n",celsius.getConvert("",temperature),
                kelvin.getConvert("BS",temperature));
    }
}
