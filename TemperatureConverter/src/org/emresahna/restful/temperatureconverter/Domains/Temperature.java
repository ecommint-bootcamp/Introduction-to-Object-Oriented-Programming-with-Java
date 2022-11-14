package org.emresahna.restful.temperatureconverter.Domains;

import java.util.Arrays;
import java.util.List;

public enum Temperature {
    Celsius,Fahrenheit,Kelvin;

    public static List<Temperature> getTemperatureList(){
        List<Temperature> list = Arrays.asList(Temperature.values());
        return list;
    }
}

/*
Celsius, Fahrenheit ve Kelvin sıcaklık derecelendirme sistemleri
arasında dönüşüm yapacak bir yapıyı RESTful web servisi
oalrak gerçekleştirin.Hangi sistemler arasında dönüşüm yapılabildiği, dönüşümler,
o ana kadar yapılan dönüşüm listesi tarihileri ile.
 */