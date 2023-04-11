package app

import "log"

func FindMissingNum(arr []int) int {
	i := 0
	for i < len(arr)-1 {
		if arr[i] != len(arr)+1 && arr[i] != i+1 { // 1 3 5 2
			temp := arr[i] - 1
			SwapTwo(arr, temp, i)
			log.Println(arr)
		} else {
			i++
		}
	}
	j := 0
	for j < len(arr) {
		if arr[j] != j+1 {
			return j + 1
		}
		j++
	}
	return j + 1
}
