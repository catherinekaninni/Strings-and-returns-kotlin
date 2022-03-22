fun main(){
     Name("Codehive")
    var y = modulus(25,2)
    println(y)
    var z = nameage("Catherine",20)
    println(z)
    var t = length("Zimbambwe")
    println(t)

}
fun Name(name:String){
    var y= name[4].toString()+name[5]+name[6]+name[7]
    println(y)

}
fun modulus(a:Int,b:Int):Int{
    var x = a%b
    return x
}
fun nameage(name:String,age:Int):String{
    var stmt = "Hi my name is $name and i am $age years old"
    return stmt

}
fun length(name:String):Int{
    var size = name.length
    return size

}