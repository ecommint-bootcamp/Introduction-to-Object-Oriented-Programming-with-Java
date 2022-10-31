package org.javaturk.oopj.ch05.loop;

/**
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         For more info please
 * @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * @see <a href="http://www.selsoft.com.tr">http://www.selsoft.com.tr</a>
 *      </p>
 *      This is an example that shows arithmetic promotions made in operators.
 */
public class DoWhileDemo {
    public static void main(String[] args) {
    	
//        double r = Math.random();
//        System.out.println("r: " + r);
//        double r;
//        do {	// First block
//            r = Math.random();
//            System.out.println("in do-while: " + r);
//        }while(r < 0.8d);	// Then condition

        long factorial = 1;
        int n = 25;
        int count = 2;
        do{
            factorial *= count;
            count++;
        }while(count <= n);
        System.out.println("Factorial of : " + n + " is " + factorial);


    }
}
