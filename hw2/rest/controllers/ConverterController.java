package com.ecommint.spring.rest.controllers;


import com.ecommint.spring.rest.services.ConverterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convert")
public class ConverterController {

    private final ConverterService converterService;

    public ConverterController(ConverterService converterService) {
        this.converterService = converterService;
    }


    @GetMapping("/kelvinfromcelcius")
    public ResponseEntity<?> kelvinFromCelcius(@RequestParam double degree){
        return ResponseEntity.ok(converterService.kelvinFromCelcius(degree));
    }

    @GetMapping("/celciusfromkelvin")
    public ResponseEntity<?> celciusFromKelvin(@RequestParam double degree){
        return ResponseEntity.ok(converterService.celciusFromKelvin(degree));
    }

    @GetMapping("/celciusfromfahrenheit")
    public ResponseEntity<?> celciusFromFahrenheit(@RequestParam double degree){
        return ResponseEntity.ok(converterService.celciusFromFahrenheit(degree));
    }

    @GetMapping("/fahrenheitfromcelcius")
    public ResponseEntity<?> fahrenheitFromCelcius(@RequestParam double degree){
        return ResponseEntity.ok(converterService.fahrenheitFromCelcius(degree));
    }

    @GetMapping("/customfromkelvin")
    public ResponseEntity<?> customFromKelvin(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.customFromKelvin(degree,minDegree,maxDegree));
    }

    @GetMapping("/customfromfahrenheit")
    public ResponseEntity<?> customFromFahrenheit(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.customFromFahrenheit(degree,minDegree,maxDegree));
    }

    @GetMapping("/customfromcelcius")
    public ResponseEntity<?> customFromCelcius(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.customFromCelcius(degree,minDegree,maxDegree));
    }

    @GetMapping("/kelvinfromcustom")
    public ResponseEntity<?> kelvinFromCustom(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.kelvinFromCustom(degree,minDegree,maxDegree));
    }

    @GetMapping("/fahrenheitfromcustom")
    public ResponseEntity<?> fahrenheitFromCustom(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.fahrenheitFromCustom(degree,minDegree,maxDegree));
    }

    @GetMapping("/celciusfromcustom")
    public ResponseEntity<?> celciusFromCustom(@RequestParam double degree, @RequestParam(defaultValue = "0") int minDegree, @RequestParam(defaultValue = "100") int maxDegree ){
        return ResponseEntity.ok(converterService.celciusFromCustom(degree,minDegree,maxDegree));
    }


    @GetMapping("/getConvertHistor")
    public ResponseEntity<?> getConvertHistory(){
        return ResponseEntity.ok(converterService.getConvertHistory());
    }



}
