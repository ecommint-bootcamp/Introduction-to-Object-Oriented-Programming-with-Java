package org.javaturk.oopj.ch11.car;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha cok bilgi icin lutfen aşağıdaki linkleri ziyaret edin.
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 */
public class Test {

	public static void main(String[] args) {
		Car car1 = new Car("Mercedes", "C200", "2019", 0, 0);

		System.out.println("When the car stands still.");
		System.out.println(car1.info());

		System.out.println("\nWhen the car moves.");
		car1.accelerate(125);
		car1.go(100);
		car1.go(50);
		System.out.println(car1.info());

		System.out.println();

		Car car2 = new Car("BMW", "i8", "2017", 10_000, 160);
		System.out.println(car2.info());

		car2.accelerate(220);
		double timeToGo = car2.go(1000);
		System.out.println("Time to go 1000 km " + timeToGo + " hour.");
		System.out.println(car2.info());
	}
}
