package app

func CyclicSortAlgo(arr []int) { // {1, 3, 4, 6, 5, 2}
	i := 0
	for i < len(arr)-1 {
		if arr[i] != i+1 {
			temp := arr[i] - 1
			SwapTwo(arr, temp, i)
		} else {
			i++
		}
	}
}

func SwapTwo(arr []int, first int, second int) {
	temp := arr[first]
	arr[first] = arr[second]
	arr[second] = temp

}
