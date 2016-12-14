package week1;

 class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result=new int [2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0]= nums[i];
                    result[1]= nums[j];
                }
            }
        }
        if(result[0]==result[1]&&result[0]==0){
            return null;
        }else{
            return result;
        }
        
    }
    public static void main(String[] args){
        int []custom =  {3,2,4};
        int []temp=new int [2];
        temp=new TwoSum().twoSum(custom,6).clone();
        System.out.println(temp[0]+","+temp[1]);
    }
}