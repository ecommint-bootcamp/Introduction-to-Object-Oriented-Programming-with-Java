package domain;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;


public class Conversion {
	static int count;
	private String from;
	private String to;
	private double fromTemp;
	private double toTemp;
	private LocalDate date;

	private int id;
	{
		id = ++count;
	}
	
	public Conversion(String from, String to, double fromTemp, double toTemp) {
		this.from = from;
		this.to = to;
		this.fromTemp = fromTemp;
		this.toTemp = toTemp;
		date = LocalDate.now();
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}



	public double getFromTemp() {
		return fromTemp;
	}

	public void setFromTemp(double fromTemp) {
		this.fromTemp = fromTemp;
	}

	public double getToTemp() {
		return toTemp;
	}

	public void setToTemp(double toTemp) {
		this.toTemp = toTemp;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	
	}