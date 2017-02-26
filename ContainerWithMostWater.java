package leetcodeMarch;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int start=0,end = height.length-1;
        int maxarea = 0;
        while(start<end){
        	maxarea = Math.max(maxarea, Math.min(height[start], height[end])*(end-start));
        	if (height[start]<height[end]) {
				start++;
			}else {
				end--;
			}
        }
        return maxarea;
    }


	public static void main(String[] args) {
		int [] h1 = {1,4,4,5,2,1};
		ContainerWithMostWater c1 = new ContainerWithMostWater();
		System.out.println(c1.maxArea(h1));
	}

}
