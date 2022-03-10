

fun main() {
    //var name=("codehive")
   // var r =name[5]
    //println(r)
    //println(name)
    var x=(division(5,3))
    println(x)
    var y=printName("Misky",21)
    println (y)
    printStatement("Abdullahi")
    var z= ("Abdullahi")
    println(z)



}
//fun name(name: String):Int{
    //var t="codehive"
    //return t




fun division(num: Int,num2: Int): Int {
    var division= num / num2
    return division
}
fun printName(p: String,z: Int): String{
    var name="Hi,my name is $p i am $z years old"
    return name


}
fun printStatement(name: String): Int {
    var x = (name.length)
    return x
}






