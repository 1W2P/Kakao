package main

import (
	"fmt"
	"io/ioutil"
	"log"
	"strconv"
	"strings"
)

func shuffle(arr []int, n int) []int {
	top := arr[:n]
	bottom := arr[len(arr)-n:]
	mid := arr[n:len(arr)-n]

	res := make([]int, 0)

	fmt.Print(top, mid, bottom)
	fmt.Println("")

	if len(mid) > 2 * n {
		mid = shuffle(mid, n)
	}

	res = append(res, mid...)
	res = append(res, top...)
	res = append(res, bottom...)

	return res
}

func solution(input []string) []int {
	arrCnt, _ := strconv.Atoi(input[0])
	arr := make([]int, 0)

	for i:=1; i<=arrCnt; i++ {
		arr = append(arr, i)
	}

	for _, strN := range input[2:] {
		n, _ := strconv.Atoi(strN)
		arr = shuffle(arr, n)

		fmt.Println("arr : ", arr)
	}

	return arr[:5]
}

func main() {
	data, err := ioutil.ReadFile("input.txt")
	if err != nil {
		log.Fatalln(err.Error())
	}

	str := string(data)
	inputArr := strings.Split(str, "\n")
	fmt.Println(solution(inputArr))
}