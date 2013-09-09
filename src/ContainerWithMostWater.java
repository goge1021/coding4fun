
public class ContainerWithMostWater {

	public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        } else {
            int max = 0;
            int maxArea = 0;
            for(int i=0; i<height.length; i++){
                if(height[i] > max){
                    max = height[i];
                    int tailMax = 0;
                    for(int j=height.length-1; j>i; j--){
                        if(height[j] > tailMax){
                            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
                            tailMax = height[j];
                        }
                    }
                }
            }
            return maxArea;
        }
    }
}
