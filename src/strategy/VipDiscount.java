package strategy;

public class VipDiscount implements DiscountStrategy{

	@Override
	public double getDiscountPrice(double oldPrice) {		
		return oldPrice * 0.7;
	}

}
