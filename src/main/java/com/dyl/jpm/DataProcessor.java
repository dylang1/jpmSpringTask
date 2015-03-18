package com.dyl.jpm;
import com.dyl.jpm.Trade;
import org.springframework.batch.item.ItemProcessor;
public class DataProcessor implements ItemProcessor<Trade,Trade>
{
public Trade process(Trade trade) throws Exception{
	
	
	
	//checks if the type has a coupon attached to it as no equitys have coupons and all bonds have coupons 
	if(trade.getCoupon() == 0)
	{
		trade.calcEquityProfit(); // works out profit for any equity type trade 
		
	}
	else
	{
		trade.calcBondProfit();;// works out profit for any bond type trade
	}
	return trade;
}
	
}
