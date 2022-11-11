package golbekir_hw2_restful.domain;

import java.time.Instant;

import golbekir_hw2_restful.converter.Tempeture;

public class Conversion {
	static int count;
	private int id;
	{
		id = ++count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String from;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	private String to;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	private double fromTemp;

	public double getFromTemp() {
		return fromTemp;
	}

	public void setFromTemp(double fromTemp) {
		this.fromTemp = fromTemp;
	}

	private double toTemp;

	public double getToTemp() {
		return toTemp;
	}

	public void setToTemp(double toTemp) {
		this.toTemp = toTemp;
	}

	private Instant date;

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}

	public Conversion(String from, String to, double fromTemp, double toTemp) {
		this.from = from;
		this.to = to;
		this.fromTemp = fromTemp;
		this.toTemp = toTemp;
		date = Instant.now();
	}
}
