import java.util.Arrays;
public class MedianofTwosortedArray {
	public double findMedian(int[] num){
		int l = num.length;
		if ((l%2)==0) {
			return ((double)(num[l/2]+num[(l/2)-1])/2);			 
		}else {
			return (double)(num[l/2]);
		}
	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if (l1==0&&l2!=0) {
			return findMedian(nums2);
		}else if (l1!=0&&l2==0) {
			return findMedian(nums1);
		}else if (l1==0&&l2==0) {
			return (double)0;
		} else {	
			int []num =new int[l1+l2];
			for(int i=0;i<l1;i++){
				num[i]=nums1[i];
			}
			for(int i=0;i<l2;i++){
				num[l1+i] = nums2[i];
			}			
			Arrays.sort(num);			
			return  (double)findMedian(num);			 			
		}
    }
	public static void main(String[] args) {
		MedianofTwosortedArray test = new MedianofTwosortedArray();
		int []nums1 = {5};
		System.out.println(nums1.length);
		int []nums2 = {1,3};
		System.out.println(nums2.length);
		double result = test.findMedianSortedArrays(nums1, nums2);
		System.out.println(result);
	}

}
