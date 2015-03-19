package com.dyl.jpm;
import com.dyl.jpm.Trade;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;
public class TradeFieldSetMapper implements FieldSetMapper<Trade>
{
	public Trade mapFieldSet(FieldSet fieldSet) throws BindException
	{

	

		Trade trade = new Trade();
	
	// reads the values from the csv file and sets it as an object 	
		trade.setInstrument_type(fieldSet.readString("instrument_type"));
		System.out.println(trade.getInstrument_type());
		trade.setName(fieldSet.readString("name"));
		trade.setQuantity(fieldSet.readInt("quantity"));
		//checks if buy is empty and sets it to 0 if it is 
		if( fieldSet.readString("buy_price").isEmpty())
		{
			trade.setBuy_price(0);
			
		
		}
		else 
		{
			trade.setBuy_price(fieldSet.readDouble("buy_price"));
			
		}
		//checks if sell is empty and sets it to 0 if it is 
		if( fieldSet.readString("sell_price").isEmpty())
		{
			trade.setSell_price(0);
			
		
		}
		else 
		{
			trade.setSell_price(fieldSet.readDouble("sell_price"));
			
		}
		
		//checks if coupon is empty and sets it to 0 if it is 
		if(fieldSet.readString("coupon").isEmpty())
		{
			trade.setCoupon(0);
		}
		else 
		{
			trade.setCoupon(fieldSet.readDouble("coupon"));	
		}


		return trade;
		
	}
}
o