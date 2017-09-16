package strategy;

import org.junit.Test;

public class StrategyTest {
	@Test
	public void Test(){
		double oldPrice = 100;
		//oldproduct discount with half off;
		DiscountContext context = new DiscountContext(new OldProductDiscount());
		System.out.println("oldproduct discount with half off "+ context.getPrice(oldPrice)
				);
		context.setDiscountStrategy(new VipDiscount());
		System.out.println("VipDiscount  "+ context.getPrice(oldPrice)
				);
	}
}
