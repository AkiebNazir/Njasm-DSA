package app


func UniqueArray(arr []int) []int{
	if len(arr) == 0{
		return arr
	}
	i := 0;
	for j := 1; j < len(arr); j++{
		if arr[i] != arr[j]{
			i += 1
			arr[i] = arr[j]
		}
	}
	return arr[:i+1]
}