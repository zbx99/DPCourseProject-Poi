package goods.homemade;

import goods.Goods;
import tools.Tools;

public class HomemadeGoods extends Goods {

	private Tools maker;

	public HomemadeGoods() {
	}

	public boolean isAvailable() {
		return true;
	}

	public Tools getMaker() {
		return maker;
	}

	public void setMaker(Tools maker) {
		this.maker = maker;
	}

	public void printOut() {
		System.out.println("Homemade Goods, You should not arrive here");
	}
}
