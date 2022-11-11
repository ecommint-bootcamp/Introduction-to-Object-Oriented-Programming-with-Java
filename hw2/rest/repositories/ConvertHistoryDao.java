package com.ecommint.spring.rest.repositories;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConvertHistoryDao {

    private List<String> convertHistories = new ArrayList<>();

    public List<String> getHistories(){
        return convertHistories;
    }

    public void addHistories(String history){
        convertHistories.add(history);
    }
}
