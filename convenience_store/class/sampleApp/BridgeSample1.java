package sampleApp;

import goods.IceCream;

/**
 * 桥接模式sample0
 * @author Sun
 * @version 0.0.1
 */
public class BridgeSample1 {
	public static void main(String[] args) {
		IceCream a = new IceCream("Vanilla", "Small");
		a.printOut();
	}
}