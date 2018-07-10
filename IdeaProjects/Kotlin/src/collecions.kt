fun main(args: Array<String>) {
    val arr= arrayOf("Pune","Mumbai","Hydrebad","Noida")

    val list = listOf("Apple","orange","Mango")

   //arrayOf() & listOf() are immutable. arrayListOf() can we add or modify,it is mutable
    val arrlist= arrayListOf("a","b","c")
        arrlist.add("d")
    println(arrlist[3])

    val arr2= arrayOf("Banglore ","chennai")

    // array concatnation
    val allcities= arr + arr2

    //print size of the array
    println(allcities.size)

    // check the list of array that contains city name or not
    if (allcities.contains("Latur")){
        println("yes it present")
    }
    else
        println("not present in list")

    if (allcities.contains("Pune")){
        println("yes it present")
    }
    else
        println("not present in list")

}