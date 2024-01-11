fun main(){
    val x=10
    val res= x in 1..10 // checks whether x is in the range 1 to 10 (upper bound inclusive)
    val res2= x in 1 until 10 // checks whether x is in the range 1 to 10 (upper bound exclusive)
    println(res)
    println(res2)
}