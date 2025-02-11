fun main(){
print("escreva um numero:")
var num1 = readLine()!!.toInt()  /*!!.toInt() para transformar o readLine em int*/
print("escreva outro numero:")
var num2 = readLine()!!.toInt()
print("escreva outro numero:")
var num3 = readLine()!!.toInt()
print("escreva outro numero:")
var num4 = readLine()!!.toInt()


var total = (num1 + num2 + num3 + num4) / 4
print("o seu numero é: $total")
}