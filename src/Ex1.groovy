//class Person{
//    String name
//    String surName
//    int age
//    String email
//}
//
//Person p = new Person(name: "Mahendran", surName: "Murugan")
//p.setAge(20)
//println "The name is ${p.name} ${p.surName}"
//println "Age is ${p.getAge()}"
//
//def (String a, int b, double c) = ["Mahi", 15, 14.0]
//println(a)
//println(b)
//println(c)
//
////Data types
//byte by = 10
//println(by.class.getName())
//
//short s = 1000
//println(s.class)
//
//println(11111111111111111111111111111111111111111111.class)
//println(9999999999.class)
//println(Short.MIN_VALUE)
//println(Short.MAX_VALUE)
//println 3.intdiv(4)
//println((boolean)'')
//
//String name = "";
//
//def displayName = name ?: "Anonymous"
//
//println(displayName)
//
//List names = ["Mahi", null, "Raju", null]
//names.each {
//    println it?.toUpperCase()
//}
//
//List num = [1, 2, 3, 4]
//
//List squareNum = num *.multiply(2)
//
//println(squareNum)

// Print Zodiac Sign by the Month Using If else

//String month = "Apr"
//int date = 20
//
//if(month == "Mar"){
//    if(date >= 21){
//        println "Aries"
//    }else{
//        println "Pisces"
//    }
//}else if(month == "Apr"){
//    if(date <= 19){
//        println "Aries"
//    }else{
//        println "Taurus"
//    }
//}


// Print Zodiac Sign by the Month Using Switch Case

//String month = "Apr"
//
//switch(month){
//    case "Mar":
//        println "Aries"
//        break
//    case "Apr":
//        println "Taurus"
//        break
//    case "May":
//        print("Gemini")
//        break
//}

// Print the prime no from 1 to 50

//flag = true
//(1..50).each { n ->
//    flag = true
//    if (n <= 1) flag = false
//    for (int i = 2; i * i <= n; i++) {
//        if (n % i == 0) {
//            flag = false
//            break
//        }
//    }
//    if (flag) print("$n ")
//}
//println()

// Sliding Window Approach with Constant Window Size
// 1,1,1,3,5,9,17 k = 3, n = 7

//int k = 3
//int n = 7
//List l = [1]*3
//int start = 0
//int end = k
//int sum = k
//for(int i in 1..n-k){
//    l << sum
//    sum-=l[start++]
//    sum+=l[end++]
//}
//println(l)

// Getting Input from User

//println("Enter Your Name:")
//String yourName = System.in.newReader().readLine()
//println("Enter Your Age:")
//int yourAge = System.in.newReader().readLine().toInteger()
//println("Your Name is: $yourName")
//println("Your Age is: $yourAge")

// Write a Groovy Script that takes a string input and Converts it to an integer
// Handle NumberFormatException
//
//try{
//    println("Enter a Number:")
//    String str = System.in.newReader().readLine()
//    int no = Integer.parseInt(str);
//    println no
//}catch (e){
//    print("Exception Occurred...")
//}
//
//def numbers = []
//try{
//    def sum = numbers.sum()
//    def avg = (sum / numbers.size())
//    print avg
//}catch (e){
//    print("Error Occurred...")
//}
//
//def name1 = 'Mahi'
//def sName1  = 'M'
//println("My name is "+name1+" "+sName1)
//
//def name2 = "Mahi"
//def sName2  = "M"
//println("My name is "+name2+" "+sName2)
//
//println("My name is $name1 $sName1")
//println('My name is $name1 $sName1')
//println("My name is ${name1} ${sName1}")
//
//println('''Hello,
//           I\'m Mahendran ''')
//
//println("""Hello,
//           I\'m Mahendran """)
//
//println(/Hello
//         I'm Mahendran/)
//
//println($/Hello
//         I'm \Mahendran/$)


//// You are given with a paragraph of text
//
//String para = """
//Lorem Ipsum is simply dummy text of the printing and typesetting industry.
//Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
// It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
//It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
//"""
//
//println("The Length of the String is ${para.length()}")
//println("Substring from 10 to 30 ${para[10..30]}")
//println("List of Words ${para.split()}")
//println("In Uppercase ${para.toUpperCase()}")
//println("In Lowercase ${para.toLowerCase()}")

//def regex = ~/[abcde]/
//def text = "Hello, World!"
//
//println text.find(regex)
//
//def regex1 = ~/Hello/
//def text1 = "Hello, World!"
//assert text1 =~ regex1
//
//def regex2 = ~/Hello, World!/
//def text2 = "Hello, World!"
//assert text2 ==~ regex2

//def text = "90809481050"
//def pattern = ~/[89]+[0-9]{8}+0$/
//assert text =~ pattern

//def pattern1 = ~/[A-za-z ]+\?/
//def text = "Mahi?"
//println text.matches(pattern1)
//
//def pattern2 = ~/[A-Z ]+/
//def text1 = "MAHI"
//println text1.matches(pattern2)
//
//def pattern3 = ~/[A-Z ]+\?/
//def text2 = "MAHI?"
//println text2.matches(pattern3)
//
//def pattern4 = ~/\s+/
//def text3 = "MahiM"
//println text3.matches(pattern4)

//int[] numbers = [1,2,3,4]
//
//def sum = { int... args ->
//    args.sum()
//}
//
//assert sum(numbers) == 10
//
//def square = { int i -> i*i}
//
//for(i in 1..5) println(square(i))

// Curry

//def log = {String greet, String name ->
//    println("$greet $name")
//}
//
//def logCurry = log.curry("Hello")
//
//logCurry("Mahendran")
//logCurry("Murugan")
//
//def hi = { greet, age, name ->
//    println("$greet $age $name")
//}
//
//def logHi = hi.curry("Hello", 5)
//
//logHi("Mahi")
//logHi("Murugan")