package app

import (
	"errors"
	"fmt"
)

func TwoPointers(arr []int) (string, error) {
	var msg string
	if len(arr) == 0 {
		s := errors.New("you have passed an empty array/slice")
		return msg, s
	}
	for i, j := 0, len(arr)-1; i < len(arr) && j < len(arr); {
		if i >= j{
			msg = "There is no such pair...!"
			return msg, nil
		} else if arr[i] + arr[j] == 0 {
			msg = fmt.Sprintf("found the pair at index (%d, %d)", i, j)
			return msg, nil
		} else if arr[i] + arr[j] < 0{
			i++
		} else {
			j--
		}
	}

	return msg, nil
}

