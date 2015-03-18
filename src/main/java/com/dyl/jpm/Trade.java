package com.dyl.jpm;
public class Trade {
	
	//plain java object to represent a trade 
	private String instrument_type;
	private String name;
	private int quantity;
	private double buy_price;
	private double sell_price;
	private double coupon;
	private double profit; 
		
	public Trade()
	{
	
	}

	/* getters and setter*/
	public String getInstrument_type()
	{
		return instrument_type;
	}
	public String getName()
	{
		return name;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public double getBuy_price()
	{
		return buy_price;
	}
	public double getSell_price()
	{
		return sell_price;
	}
	public double getCoupon()
	{
		return coupon;
	}
	public void setInstrument_type(String instrument_type)
	{
		this.instrument_type=instrument_type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	public void setBuy_price(double buy_price)
	{
		this.buy_price=buy_price;
	}
	public void setSell_price(double sell_price)
	{
		this.sell_price=sell_price;
	}
	public void setCoupon(double coupon)
	{
		this.coupon=coupon;
	}
	public double getProfit()
	{
		return profit;
	}
	public void setProfit(double profit)
	{
		this.profit=profit;
	}
	public void calcBondProfit()
	{
		this.profit = (this.quantity * this.coupon);//calcualtes the profit for all bond types 
	}
	public void calcEquityProfit()
	{
		this.profit = ((this.sell_price - this.buy_price * this.quantity)); // calculates the profit for equity 
	}
	

}



