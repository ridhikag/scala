import util.control.Breaks._
def search(arr:Array[Int], x : Int):(Int)=
{
  var index=0
  breakable
  {
    for(i <- 0 to arr.length-1)
    {
     if(arr(i)==x) // search element 1 by 1
     {
         //res= arr(i)
         index=i // if find put the values of element and index in variables
         break
     }
    }
  }
  index
   
}

  
var arr=Array(1,2,3,4,1,5,7,9)
var a=search(arr, 2) // call linear search function
//println("element" + a._1 +  "found at index” + a._2) // print the result of linear search function
println(a);
