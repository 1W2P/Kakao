
lateinit var cardList:List<Int>
fun main(args:Array<String>){
    println("example 1")
    for(i in solution(10, 1, intArrayOf(2)).take(5))
        println(i)
    println("example 2")
    for(i in solution(10, 2, intArrayOf(2, 3)).take(5))
        println(i)
}

fun solution(c:Int, p:Int, n:IntArray):List<Int>{ // c: 총 카드 갯수,  p : 카드 섞기 횟수, n : 위, 아래 제외 카드 수
    cardList = (1..c).toList()
    for(i in 0 until p)
        cardList =  shuffle(n[i], cardList)
    return cardList
}
fun shuffle(n:Int, arr:List<Int>) : List<Int>{
    var newList = arr.subList(n, arr.size - n)
    if(newList.size > 2 * n)
        newList = shuffle(n, newList)
    return newList.toTypedArray().plus(arr.subList(0,n)).plus(arr.subList(arr.size-n, arr.size)).toList()
}
