package app

// find the max sum of n numbers in an array
func MaxSubArraySumTarget(arr []int, rng, target int) []int {
	result := []int{-1}
	if rng > len(arr){
		return result
	}
	tempSum := 0
	for i := 0; i < rng; i++{
		tempSum += arr[i]
	}
	if tempSum == target{
		result = arr[0:rng]
		return result
	}
	for i := 0; i < len(arr)-rng; i++{   //{5,6,5,9,8,10}
		tempSum = tempSum - arr[i] + arr[rng + i]
		if tempSum == target{
			result = arr[i+1:i+rng+1]
			return result
		}
	}
	return result
}

func MaxSubArraySum(arr []int, num int) int {
	if len(arr) < num{
		return -1
	}
	tempSum := 0
	for i := 0; i < num; i++{
		tempSum += arr[i]
	}
	maxSum := tempSum
	for i := 0; i < len(arr)-num; i++{
		tempSum = tempSum - arr[i] + arr[num + i]
		if tempSum > maxSum{
			maxSum = tempSum
		}
	}
	return maxSum
}