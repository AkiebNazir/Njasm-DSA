package app

import "fmt"

func FreqCounter(l1 []int, l2 []int) bool {
	if len(l1) != len(l2) {
		return false
	}
	m1 := make(map[int]int)
	m2 := make(map[int]int)
	for _, val := range l1 {
		m1[val] += 1
	}
	for _, val2 := range l2 {
		m2[val2] += 1
	}
	fmt.Println(m1)
	fmt.Println(m2)
	for k, v := range m1{
		if m2[k*k] != v{
			return false
		}
	}
	return true
}