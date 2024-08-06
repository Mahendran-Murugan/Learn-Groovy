List fruits = ["Mango", "PineApple", "Cherry", "Berry"]
List prices = [50, 20, 45, 10]

//fruits.each { i->
//    println("The fruit is $i and the price is ${prices[fruits.indexOf(i)]}")
//}
//
//println()
//
//fruits.eachWithIndex { String fruit, int i ->
//    println("The fruit is $fruit and the price is ${prices[i]}")
//}

//Map fruitAndPrice = [:]
//println(fruitAndPrice)
//fruitAndPrice.each {
//    println("The fruit is $it.key and the price is $it.value")
//}
//
//Map fap = [:]
//fruits.each {
//    fap[it] = prices[fruits.indexOf(it)]
//}
//println(fap)
//
//List f = []
//List p = []
//
//fap.each {
//    f<<it.key
//    p<<it.value
//}
//
//println(f)
//println(p)
//
//List fruit = fap.collect{
//    it.key
//}
//List price = fap.collect {
//    it.value
//}
//
//println(fruit)
//println(price)
//


//Using For Loop

List years = []

List leap = []
List notLeap = []

for(int i = 1990; i <= 2010; i++){
    years << i
}

for(i in years){
    if(i % 4 == 0){
        leap << i
    }else{
        notLeap << i
    }
}

println "Using For Loop"
println leap
println notLeap

// Using Each

leap.clear();
notLeap.clear();

years.each { year ->
    if(year % 4 == 0)
        leap << year
    else
        notLeap << year
}

println "Using Each"
println leap
println notLeap

// Using Collect

leap.clear();
notLeap.clear();

leap = years.collect{
    it % 4 == 0
}

notLeap = years.collect{
    it % 4 != 0
}

println "Using Collect"
println leap
println notLeap

// Using Map

//Map leapAndNotLeap = ["Leap":[], "NotLeap":[]]
//List lastData = []
//years.each {year->
//    if(year % 4 == 0){
//        lastData = leapAndNotLeap.get("Leap")
//        lastData << year
//        leapAndNotLeap.put("Leap", lastData)
//    }
//    else{
//        lastData = leapAndNotLeap.get("NotLeap")
//        lastData << year
//        leapAndNotLeap.put("NotLeap", lastData)
//    }
//}
//println "Using Map"
//println leapAndNotLeap
//
//
//List y = [1990,1991,1992,1993,1994,1995,1996,1997,1998]
//Map m = [:]
//
//y.each {
//
//
//}

