/**
 * 
 */
package td8;

import java.util.HashSet;

/**
 * @author mpluchar
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		var apple1 = new Apple(20, AppleKind.Golden);
        var apple2 = new Apple(40, AppleKind.PinkLady);
        var pear = new Pear(5);
   
        var basket = new Basket();
        basket.add(apple1, 5);
        basket.add(apple2);
        basket.add(pear, 7);
        System.out.println(basket);
        

        var set = new HashSet<Apple>();
        set.add(new Apple(20, AppleKind.Golden));
        System.out.println(set.contains(new Apple(20, AppleKind.Golden)));
	}

}
