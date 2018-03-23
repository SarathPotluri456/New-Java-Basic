package IdentityHashMap;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;





public class MulMapdemo {

	
	public static void main(String[] args) {
		MultiMap transactions = new MultiValueMap();


		transactions.put(1,345);
		transactions.put(1,456);
		transactions.put(2,678);

		System.out.println(transactions); 
		
		Set keys=transactions.keySet();
		for(Object key:keys)
		{
			System.out.println(key+":"+transactions.get(key));
		}
		

	}

}
