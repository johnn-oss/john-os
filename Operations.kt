
/*
Math Calulator
 */
fun main(args:Array<String>){
    println("---JALPH Math Calulator---")
    println("What operation 'd you like to perform? ")
    println(" I can sum, subtract, multiply,& divide")
    var operation=readLine()
    if( operation=="sum"){
        //block of code 4 sum
        println("Enter numbers to sum here: ")
        var n1:Float=readLine()!!.toFloat()
        var n2:Float=readLine()!!.toFloat()
        var sum:Float?
        sum=n1 + n2

        println("Sum: " + sum)
    }else if (operation=="subtract"){
        //block of code for subtraction
        println("Enter numbers to subtract here: ")
        var n1:Float=readLine()!!.toFloat()
        var n2:Float=readLine()!!.toFloat()
        var subtract:Float?
        subtract=n1 -n2
        println("subtract:   $subtract ")
    }else if (operation=="multiply"){
        //block of code for multiplicaction
        println("Enter numbers to multiply here: ")
        var n1:Float=readLine()!!.toFloat()
        var n2:Float=readLine()!!.toFloat()
        var multiply:Float?
        multiply=n1 *n2
        println("product: $multiply")
    }else if (operation=="divde"){
        //block of code for division
        println("Enter numbers to divide here: ")
        var n1:Float=readLine()!!.toFloat()
        var n2:Float=readLine()!!.toFloat()
        var divide:Float?
        divide=n1 /n2
        println("divide: $divide ")

    }else{
        println(" You have entered an invalid command.")
    }








}