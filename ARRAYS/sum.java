public class sum {
    public static void main(String[] args){
        double[] nums={10.1,9.2,6.8,5.4,8.2};//10.1+9.2+6.8+5.4+.8.2=39.7
        //sum of array = 39.7;                nums[0]+nums[1]+nums[2]+num[3]+nums[4]+nums[5]=> nums[i]
        double sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.print("Sum =" + sum);
    }
}
