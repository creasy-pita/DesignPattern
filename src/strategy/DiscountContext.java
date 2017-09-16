package strategy;

public class DiscountContext {
	private DiscountStrategy disStrategy;
	public DiscountContext(DiscountStrategy disStrategy){
		this.disStrategy = disStrategy;	
	}
	
	public void setDiscountStrategy(DiscountStrategy disStrategy){
		this.disStrategy = disStrategy;	
	}
	
	public double getPrice(double oldPrice){
		if(disStrategy == null){
			return oldPrice;
		}
		else {
			return disStrategy.getDiscountPrice(oldPrice);
		}
	}
}
