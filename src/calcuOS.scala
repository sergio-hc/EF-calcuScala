//Calculadora con funciones lambda en Scala
//Sergio Luis Huanca Cuellar
//Segundo Parcial - problema 4

object calcuOS {
   def sumar(x: Int, y: Int): Int =  x + y
  
  def restar(x: Int, y: Int): Int = x - y
  
  def multiplicar(x: Int, y: Int): Int =   x * y

  def dividir(x: Int, y: Int): Int = 
    y match {
      case 0 => -1
      case _ => x/y
  }
  
 //funcion de orden superior que utiliza las funciones sumar, restar, mul...
 def calcu(x:Int, y:Int, funcion: (Int,Int) => Int):Int={
   funcion(x,y)
} 
 
def main(args: Array[String]):Unit = {
  println("*****CALCULADORA EN SCALA CON FUNCION DE OS******")
  //valores
  val a = 10
  val b = 5
  println("Los valores a operar son: "+ a +","+ b)
  //llamamos a la funcion calcu de orden superior
  //suma
  val sum = calcu(a,b,sumar) 
  println("La suma es: " + sum)
  //resta
  val res = calcu(a,b, restar)
  println("La resta es: " + res)
  //multi
  val mul = calcu(a,b, multiplicar)
  println("La multiplicacion es: " + mul)
  //divi
  val di = calcu(a,b, dividir)
  println("La division es: " + di)
  }
}