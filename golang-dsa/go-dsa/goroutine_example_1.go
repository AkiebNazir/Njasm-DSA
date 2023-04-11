package app

import (
	"fmt"
	"time"
)

func CheckEven(num int, even chan int) {
	if num%2 == 0 {
		fmt.Println("even number = ", num)
		even <- num
	}
}

func CheckOdd(num int){
	if num %2 != 0{
		fmt.Println("odd number = " , num)
	}
}


func DivideByFour(ns chan int){
	for n := range ns{
		if n % 4 == 0{
			fmt.Println("divide by 4", n)
		}
	}
	close(ns)
}

type Chanfunc func()
func ProcessJobs(jobQueue chan Chanfunc) {
	// Process jobs from the queue
	for job := range jobQueue {
		job()
		time.Sleep(time.Millisecond * 500)
	}
	close(jobQueue)
}
