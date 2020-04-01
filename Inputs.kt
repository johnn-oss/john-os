fun main(args:Array<String>) {
    print("Enter Name: ")
    var name = readLine()
    print("Enter age: ")
    var age:Int = readLine()!!.toInt()
    print("Enter Department: ")
    var dep: String?
    dep = readLine()
    print("Enter GPA: ")
    var GPA: Float = readLine()!!.toFloat()
    print("Enter CGPA: ")
    var CGPA: Double = readLine()!!.toDouble()
    println("Name: " + name)
    println("Age: " + age)
    println("Department: " + dep)
    println("GPA: " + GPA)
    println("CGPA: " + CGPA)


}