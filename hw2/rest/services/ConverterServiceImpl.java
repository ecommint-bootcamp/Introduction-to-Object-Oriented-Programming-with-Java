package com.ecommint.spring.rest.services;

import com.ecommint.spring.rest.repositories.ConvertHistoryDao;
import com.ecommint.spring.rest.thermometer.*;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ConverterServiceImpl implements ConverterService{

    private final ConvertHistoryDao convertHistoryDao;

    private final ThermometerConverter thermometerConverter;

    private final ThermometerFactory thermometerFactory;

    public ConverterServiceImpl(ConvertHistoryDao convertHistoryDao, ThermometerConverter thermometerConverter, ThermometerFactory thermometerFactory) {
        this.convertHistoryDao = convertHistoryDao;
        this.thermometerConverter = thermometerConverter;
        this.thermometerFactory = thermometerFactory;
    }

    @Override
    public double kelvinFromCelcius(double degree) {
        CelciusThermometer from = thermometerFactory.getCelciusThermometer(degree);
        KelvinThermometer to = thermometerFactory.getKelvinThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double celciusFromKelvin(double degree) {
        KelvinThermometer from = thermometerFactory.getKelvinThermometer(degree);
        CelciusThermometer to = thermometerFactory.getCelciusThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double celciusFromFahrenheit(double degree) {
        FahrenheitThermometer from = thermometerFactory.getFahrenheitThermometer(degree);
        CelciusThermometer to = thermometerFactory.getCelciusThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double fahrenheitFromCelcius(double degree) {
        CelciusThermometer from = thermometerFactory.getCelciusThermometer(degree);
        FahrenheitThermometer to = thermometerFactory.getFahrenheitThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double customFromKelvin(double degree, int minDegree, int maxDegree) {
        KelvinThermometer from = thermometerFactory.getKelvinThermometer(degree);
        Thermometer to = thermometerFactory.getCustomThermometer(minDegree, maxDegree);
        return convertAndSave(from,to);
    }

    @Override
    public double customFromFahrenheit(double degree, int minDegree, int maxDegree) {
        FahrenheitThermometer from = thermometerFactory.getFahrenheitThermometer(degree);
        Thermometer to = thermometerFactory.getCustomThermometer(minDegree, maxDegree);
        return convertAndSave(from,to);
    }

    @Override
    public double customFromCelcius(double degree, int minDegree, int maxDegree) {
        CelciusThermometer from = thermometerFactory.getCelciusThermometer(degree);
        Thermometer to = thermometerFactory.getCustomThermometer(minDegree, maxDegree);
        return convertAndSave(from,to);
    }

    @Override
    public double kelvinFromCustom(double degree, int minDegree, int maxDegree) {
        Thermometer from = thermometerFactory.getCustomThermometer(minDegree, maxDegree,degree);
        KelvinThermometer to = thermometerFactory.getKelvinThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double fahrenheitFromCustom(double degree, int minDegree, int maxDegree) {
        Thermometer from = thermometerFactory.getCustomThermometer(minDegree, maxDegree,degree);
        FahrenheitThermometer to = thermometerFactory.getFahrenheitThermometer();
        return convertAndSave(from,to);
    }

    @Override
    public double celciusFromCustom(double degree, int minDegree, int maxDegree) {
        Thermometer from = thermometerFactory.getCustomThermometer(minDegree, maxDegree,degree);
        CelciusThermometer to = thermometerFactory.getCelciusThermometer();
        return convertAndSave(from,to);
    }


    @Override
    public List<String> getConvertHistory() {
        return convertHistoryDao.getHistories();
    }

    private void addConverterHistory(Thermometer from ,Thermometer to,double result){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat();
        String format = dateFormat.format(date);
        String operation = from + " : "+ from.getCurrentDegree() + " degree " + " is equals " + result + " degree of "+ to +"\n "+ " Date : "+format;
        convertHistoryDao.addHistories(operation);

    }

    private double convertAndSave(Thermometer from,Thermometer to){
        double result = thermometerConverter.convert(from,to);
        addConverterHistory(from ,to,result);
        return result;
    }
}
