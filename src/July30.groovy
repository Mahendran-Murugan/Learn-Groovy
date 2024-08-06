//List no = [11, 12, 13, 14, 15]
//List greaterThan13 = no.findAll{
//    it >= 13
//}
//println greaterThan13

//List fruits = ["grape", "apple", "orange", "banana", "peach"]
//List res = []
//int maxLength = Integer.MIN_VALUE
//
//fruits.each { it ->
//    int len = it.length();
//    if(len > maxLength){
//        res = [it]
//        maxLength = len
//    }else if(len == maxLength){
//        res << it
//    }
//}
//
//println res

//List no = [1, 2, 3, 4, 5]
//
//Closure c = { n ->
//    n*n
//}
//
//no.each { n->
//    println(c(n))
//}

//List l1 = [1, 2, 3, 4, 5]
//List l2 = []
//
//l1.each {
//    l2 << it
//    l1 = (l1 - it)
//}
//
//println l1
//println l2

//List country = ["India", "China", "USA"]
//List country1 = country.reverse()
//country1 = country1.collect{
//    it.reverse()
//}
//
//List country2 = []
//country = country.reverse()
//country.each{
//    country2.add(it.reverse())
//}
//
//println(country2)

List no = [2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
List prime = []
List composite = [1]
boolean flag
(1..50).each { n->
    flag = true
    for(int i = 2; i * i <= n; i++){
        if(n <= 1){
            flag = false
            break
        }
        if(n % i == 0){
            flag = false
            break
        }
    }
    if(flag) prime << n
    else composite << n
}

println(prime)
println(composite)