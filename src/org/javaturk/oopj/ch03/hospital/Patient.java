package org.javaturk.oopj.ch03.hospital;

import java.util.Date;

public class Patient {
    // Attributes or properties
    String id;
    String name;
    char sex;
    int age;
    String[] illnesses;

    // Behaviors or operations
    public void takeMedication(Prescription prescription) {
        //...
    }

    public void visitedBy(String relative) {
        //...
    }
}
