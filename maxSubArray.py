def maxSubArray(num):
	"""Given an integer array, find the 
	contiguous subarray which has the largest
	 sum and return its sum"""
	max_sum = num[0]
	c_sum= num[0]

	for i in num[1:]:
		c_sum += i

		if(i>c_sum):
			c_sum=i

		if(c_sum>max_sum):
			max_sum=c_sum

	return max_sum

if __name__ == "__main__":
	print(maxSubArray([3,-3,4,2,-10,3]))