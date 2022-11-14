package org.emresahna.restful.temperatureconverter.Domains;

import java.time.Instant;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conversion {
    private Temperature current;
    private Temperature target;
    private double amount;
    private Instant date;

    public Conversion(Temperature current, Temperature target,double amount) {
        this.current = current;
        this.target = target;
        this.amount = amount;
        this.date = Instant.now();
    }

    public Temperature getCurrent() {
        return current;
    }

    public void setCurrent(Temperature current) {
        this.current = current;
    }

    public Temperature getTarget() {
        return target;
    }

    public void setTarget(Temperature target) {
        this.target = target;
    }
    
    public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
