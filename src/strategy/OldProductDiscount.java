package strategy;

public class OldProductDiscount implements DiscountStrategy{

	@Override
	public double getDiscountPrice(double oldPrice) {		
		return oldPrice*0.5;
	}

}
