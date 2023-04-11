package app


func CheckAnagram(s1, s2 string) bool{
	if len(s1) != len(s2){
		return false
	}
	m1 := make(map[string]int)
	m2 := make(map[string]int)

	for _, v := range s1{
		m1[string(v)]++
	}
	for _, v := range s2{
		m2[string(v)]++
	}
	for k := range m1{
		if m1[k] != m2[k]{
			return false
		}
	}
	return true

}