package org.javaturk.oopj.ch03.primitives.characters;

public class Characters {

	public static void main(String[] args) {
		char ch = 'a';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'A';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '9';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = ' ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '₺';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = 'ğ';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0c2c';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u2690';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		ch = '\u0041';
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);

		
		ch = (char) -5;
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
		
		ch = (char) -65535;
		System.out.println("Character: " + ch + " its numeric value: " + (int)ch);
	}
}
