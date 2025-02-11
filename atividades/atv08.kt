fun main(){
print("ganho por hora:")
var val1 = readLine()!!.toInt()  /*!!.toInt() para transformar o readLine em int*/
print("horas trabalhadas por mes:")
var val2 = readLine()!!.toInt()


var total =(val1 * val2) 
print("o total é: $total")
}