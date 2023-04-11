package app

func CheckEven1(num int) int {
	if num%2 == 0 {
		return num
	}
	return 0
}

func Worker(jobs chan int, result chan int) {
	for job := range jobs {
		result <- CheckEven1(job)
	}
}
