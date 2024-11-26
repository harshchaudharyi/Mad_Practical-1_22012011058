fun main(){
    print("Enter size of array: ")
    val a= readln().toInt()
    var x=Array(a){0}
    print("Enter $a elements of array: ")
    for(i in 0..a-1){
        x[i]= readln().toInt()
    }
    var g=0
    for(i in 0..a-1){
        if(g<x[i]){
            g=x[i]
        }
    }
    print("\nGreatest number in array is $g...")
}
