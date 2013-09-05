
public class BestTimeToBuyAndSellStock2 {

	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0){
            return 0;
        }
		int state = 0;
		int min,max,pre;
		pre = min = max = prices[0];
		int sum = 0;
		for(int i=1; i<prices.length; i++){
			switch(state){
			case 0 :
				if(prices[i] >= pre){
					state = 1;
					max = pre = prices[i];
				} else {
					state = -1;
					max = min = pre = prices[i];
				}
				break;
			case 1 :
				if(prices[i] >= pre){
					max = pre = prices[i];
				} else {
					state = -1;
					sum += max-min;
					max = min = pre = prices[i];
				}
				break;
			case -1 :
				if(prices[i] < pre){
					max = min = pre = prices[i];
				} else {
					state = 1;
					max = pre = prices[i];
				}
				break;
			}
		}
		sum += max-min;
		return sum;
	}
}
