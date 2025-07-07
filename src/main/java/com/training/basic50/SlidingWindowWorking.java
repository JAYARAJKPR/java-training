package com.training.basic50;

class SlidingWindowWorking{
	public static void main(String[] args) {
		int[] nums= {2,3,1,6,3,2,1,4};
		int k=3;
		int reqSum=6;
		System.out.println(countOfSubarrayHavingSum3( nums, k,reqSum));
	}

	private static int countOfSubarrayHavingSum3(int[] nums, int k,int reqSum) {
		int count=0;
		int sum=0;
		for(int i=0;i<k;i++) {// always sum of first window
			sum+=nums[i];     //prefixSum
		}
		
		for(int i=k;i<nums.length;i++) {
			//for increasing window size
			if(sum==reqSum) {
				count++;
			}
			sum=sum +nums[i];     
			sum=sum-nums[i-k];  // i-k is the size of difference of size of our required sub array
		
		
			
		
		}
		
		return count;
	}
}