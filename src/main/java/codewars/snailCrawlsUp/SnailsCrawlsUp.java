package snailCrawlsUp;
import java.math.BigDecimal;
import java.util.ArrayList;

public class SnailsCrawlsUp {
    
    public static void main(String[] args) {
        
  		snail(3,2,1);
    }
    
    public static int snail(int column, int day, int night) {
    	
    	int dailyStartingPosition = 0;
    	int numberDaysTop = 0;
    	
    	while((dailyStartingPosition+day) < column) {
    		
    		dailyStartingPosition += (day - night);
    		
    		numberDaysTop++;
    	}
    	
    	numberDaysTop++;
  
    	return numberDaysTop;
    }
   
}
