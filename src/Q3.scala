

object Q3 {
  
  def main (args:Array[String]){
   
    println("Toatal salary is=" + sal(40,30))
  }
  
  def sal(hr1:Double,hr2:Double):Double=(hr1*250+hr2*85)-(hr1*250+hr2*85)*0.12
  
  //def work(hr1:Int):Int=hr1*250
  
  //def OT(hr2:Int):Int=hr2*85
 
  //def income(in1:Int,in2:Int):Int=work(in1)+OT(in2)
  
  //def tax(income:Int):Double=income(tx)*0.12
  
  
}