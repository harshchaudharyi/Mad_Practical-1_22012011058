fun add(a:Int, b:Int, c:Int):Int{
    return a+b+c
}
fun sub(a:Int, b:Int, c:Int):Int{
    return a-b-c
}
fun mul(a:Int, b:Int, c:Int):Int{
    return a*b*c
}
fun div(a:Int, b:Int, c:Int):Int{
    return a/b/c
}
fun main(){
    print("Enter any three number: ")
    var a=readln().toInt()
    var b=readln().toInt()
    var c=readln().toInt()
    print("Addition of $a, $b and $c is ${add(a,b,c)}")
    print("\nSubtraction of $a, $b and $c is "+sub(a, b, c))
    print("\nMultiplication of $a, $b and $c is "+mul(a, b, c))
    print("\nDivision of $a, $b and $c is "+div(a, b, c))
}
