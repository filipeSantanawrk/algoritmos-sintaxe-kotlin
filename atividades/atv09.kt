fun main(){
print("digite a conversao de F para C:")
var val1 = readLine()!!.toInt()  /*!!.toInt() para transformar o readLine em int*/
var total = (val1 - 32) * 5/9
print("o total é: $total")
}