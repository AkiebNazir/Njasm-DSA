package app

import (
	"fmt"
	"unicode"
)

func CharCount(arr string) {
	mapd := make(map[string]int)
	for _, ch := range arr {
		if unicode.IsDigit(ch) || unicode.IsLetter(ch) {
			mapd[string(ch)]++
		}
	}
	fmt.Println(mapd)

}
