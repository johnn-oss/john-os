
fun main(args:Array<String>){
    println(" enter your grade:")
    var grade:Double=readLine()!!.toDouble()
    if (grade>=90 && grade<95){
        //Block of code
        println("You're in A- level")
        if (grade>95 && grade<=100){
            println("You're in A+ level")

            }else if (grade>100){
            println("You're not in A level")
        }

        }else if(grade<90){
        println("You're not in A level")
    }

    }


