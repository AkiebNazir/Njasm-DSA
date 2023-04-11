package app

func CeilingOfArray(arr []int, target int) int {
	start := 0
	end := len(arr) - 1

	for start <= end {
		mid := (start + end) / 2
		if target > arr[mid] {
			start = mid + 1
		} else if target < arr[mid] {
			end = mid - 1
		} else {
			return mid
		}
	}
	return start
}
