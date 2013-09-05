
public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        } else {
            int min = prices[0], max = prices[0];
            int maxDiff = 0;
            for(int i=1; i<prices.length; i++){
            	if(prices[i] < min){
                    min = max = prices[i];
                }
                max = Math.max(max, prices[i]);
                maxDiff = Math.max(max-min, maxDiff);
            }
            return maxDiff;
        }
    }
}
