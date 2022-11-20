package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Conversions {

	
	
		private List<Conversion> conversions = Collections.synchronizedList(new ArrayList<>());
		private List<String> temperatures = new ArrayList<String>(Arrays.asList("Kelvin","Celcius","Fahreheit")); 
		
				
		
		public Conversions() {
		}
		
		public void addConversion(Conversion conversion) {
			conversions.add(conversion);
//			System.out.println("Adding a new conversion and size: " + conversions.size());
		}

		public List<Conversion> getConversions() {
			return conversions;
		}

		public void setConversions(List<Conversion> list) {
			conversions = list;
		}
		public List<String> getTemperatures() {
			return temperatures;
		}

		public void setTemperatures(List<String> temperatures) {
			this.temperatures = temperatures;
		}

	}

