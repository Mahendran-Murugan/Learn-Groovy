// Closure Without Arguments

//Closure greetMahi = {
//    -> println("Hello, Mahendran")
//}
//
//greetMahi()

// Temperature to Celsius - [20, 25, 15, 30, 18]
// Convert it into Fahrenheit using .each() and .collect()
// Formula F = C×(9/5)+32

// Using Each
//def celsius = [20, 25, 15, 30, 18]
//def fahrenheit = []
//celsius.each {
//    fahrenheit << it * (9/5) + 32
//}
//println(fahrenheit)
//
//fahrenheit.clear()

// Using Collect
//fahrenheit = celsius.collect{
//    it * (9/5) + 32
//}
//println(fahrenheit)

// Find All number in numbers = [10, 25, 8, 14, 30]
// Which are greater than 20

//def numbers = [10, 25, 8, 14, 30]
//def greaterThan20 = numbers.findAll{
//    it > 20
//}
//println(greaterThan20)

// Fruit fruits = ['apple', 'banana', 'grape', 'orange', 'kiwi']
// Find the Largest word count fruits

//List fruits = ['apple', 'grape', 'orange', 'kiwi','banana']
//List maxFruits = []
//int maxLength = 0
//int len = 0
//fruits.each {
//    len = it.length()
//    if(maxLength < len){
//        maxFruits = [it]
//        maxLength = len
//    }else if(maxLength == len){
//        maxFruits << it
//    }
//}
//println(maxFruits)


//Map m = ["apple": 15, "banana": 30, "grape": 10, "orange": 25, "kiwi": 20]
//int total = 0
//
//m.each {
//    total += it.value
//}
//
//println(total)

// Print the Fruit along with it's Price using Each With Index

//List fruits = ['apple', 'grape', 'orange', 'kiwi','banana']
//List price = [15, 8, 20, 12, 10]
//
//fruits.eachWithIndex{ String value, int index ->
//    println("The Fruit is ${value} and the price is ${price[index]}")
//}

// Print the Fruit along with it's Price using Each

//List fruits = ['apple', 'grape', 'orange', 'kiwi','banana']
//List price = [15, 8, 20, 12, 10]
//
//fruits.each{ String value ->
//    println("The Fruit is ${value} and the price is ${price[fruits.indexOf(value)]}")
//}
//
//List products = [
//        [
//                "name":"Iphone 15",
//                "category":"Mobile",
//                "price": 21
//        ],
//        [
//                "name":"MacBook Air",
//                "category":"Laptop",
//                "price": 52
//        ],
//        [
//                "name":"Air Tag",
//                "category":"Accessories",
//                "price": 5
//        ],
//        [
//                "name":"Iphone 14",
//                "category":"Mobile",
//                "price": 23
//        ],
//        [
//                "name":"MacBook Air 2019",
//                "category":"Laptop",
//                "price": 52
//        ],
//        [
//                "name":"Type c Cable",
//                "category":"Accessories",
//                "price": 3
//        ],
//]
//
//String category = "Laptop"
//int price = 50
//
//products.each { prod ->
//    if(prod["category"] == category && prod["price"] > price){
//        println(prod["name"])
//    }
//}
//
//List sortedProducts = products.findAll { prod ->
//    (prod["category"] == category && prod["price"] > price)
//}
//
//sortedProducts.each { prod ->
//    println(prod["name"])
//}

// Reverse List and Element

//List countries = ['india', 'usa', 'uae']
//countries = ['india', 'usa', 'uae'].reverse().collect{ country ->
//    country.reverse()
//}
//
//println(countries)

//List words = ['a', 'b', 'c', 'd']
//List additionalWords = ['e', 'f', 'g', 'h']
//words.addAll(additionalWords)
//println("Check for 'e' in List: "+ words.contains('e'))
//println("Check for 'e' in List: "+ words.contains('z'))
//println("The element in Index 5 is: "+ words[5])
//println("List is Empty?: "+ words.isEmpty())
//println("List is Empty?: "+ words.indexOf('d'))
//println("Removing Element d")
//words = words - 'd'
//println(words)
//println("Removing Element h")
//words = words - 'h'
//println(words)
//println("Removing f, g")
//List removables = ['f', 'g']
//removables.each {
//    words = words - it
//}
//println(words)
//println("Changing to Uppercase")
//words = words.collect{
//    it.toUpperCase()
//}
//println(words)
//println("Size of the List is: ${words.size()}")

//List initial = [1,2,3,4,5]
//List destination = []
//
//initial.each { no ->
//    destination << no
//    initial = initial - no
//}
//
//println(initial)
//println(destination)

// Calculate the Price of items

//List items = ['a', 'b', 'c', 'd','e']
//List price = [1, 2, 3, 4, 5]
//List gst = [5, 4, 3, 2, 1]
//
//items.eachWithIndex{ String value, int index ->
//    println("The Price of ${value} is ${price[index] + gst[index]}")
//}

// Highest Priced Fruit

//List fruits = ['a', 'b', 'c', 'd','e']
//List prices = [1, 2, 3, 4, 5]
//
//int maxPrice = 0
//int maxIndex = 0
//
//prices.eachWithIndex { int price, int index ->
//    if(maxPrice < price){
//        maxPrice = price
//        maxIndex = index
//    }
//}
//
//println("Max Priced Fruit is ${fruits[maxIndex]} and the Price is ${maxPrice}")

//List family = [
//        [
//                name: "Mahi",
//                age: 20
//        ],
//        [
//                name: "Manoj",
//                age: 21
//        ],
//        [
//                name: "Raju",
//                age: 24
//        ],
//        [
//                name: "Guru",
//                age: 16
//        ],
//]

//for(int i = 0; i < family.size(); i++){
//    for(int j = 0; j < family.size(); j++){
//        if(family[i]["age"] > family[j]["age"]){
//            def age = family[i]
//            family[i] = family[j]
//            family[j] = age
//        }
//    }
//}

//family = family.sort { a, b ->
//    a.age <=> b.age
//}
//
//println(family)
//
//Map years = [Leap:[], notLeap:[]]
//(1990..2010).each { year ->
//    if(year % 4 == 0){
//        years["Leap"] << year
//    }else{
//        years["notLeap"] << year
//    }
//}

//println(years)


//Map numbers = [prime:[], composite:[]]
//boolean flag;
//(2..20).each { no ->
//    flag = true
//    for(int i = 2; i * i <= no; i++){
//        if(no % 2 == 0){
//            flag = false;
//            break;
//        }
//    }
//    if(flag) numbers["prime"] << no
//    else numbers["composite"] << no
//}
//
//println(numbers)

//You're working on a school management system. You're tasked with developing a Groovy program to manage student grades for various subjects.
//        Requirements:
//Student Class: Define a Student class with properties for name and grades (a map where the key is the subject name and the value is the grade for that subject).
//calculateAverageGrade Closure: Within the Student class, implement a closure named calculateAverageGrade that calculates the average grade by summing all grades and dividing by the number of subjects (handle division by zero).
//Student List: Create a list named students to store student objects.
//User Interaction (Optional): Enhance the program by allowing users to:
//Add new students with names and subject grades.
//View existing student information with average grade.
//Bonus:
//Implement a method to calculate letter grades based on numerical grades (e.g., A for grades above 90, B for 80-89, etc.).
//Allow users to search for students by name or subject.
//Evaluation:
//Your code will be evaluated based on:
//Functionality and adherence to requirements.
//Code clarity, readability, and proper use of Groovy features (lists, maps, closures).
//Error handling and robust implementation for user interactions (if applicable).
//Efficiency and potential for extension (bonus features).

//class Student{
//    String name
//    Map grades = [Tamil: 0, English: 0, Maths: 0, Science: 0]
//    String letterGrade = " "
//
//    Student(String name, Map grades){
//        this.name = name
//        this.grades = grades
//    }
//
//    Closure calculateAverageGrade = {
//        int sum = 0
//        grades.each { grade ->
//            sum += grade.value
//        }
//        try{
//            def value = sum / grades.size()
//            if(value > 90){
//                letterGrade = "O"
//            }else if(value > 80){
//                letterGrade = "A+"
//            }else if(value > 70){
//                letterGrade = "A"
//            }else if(value > 60){
//                letterGrade = "B+"
//            }else if(value > 50){
//                letterGrade = "B"
//            }else if(value > 40){
//                letterGrade = "C"
//            }else if(value > 30){
//                letterGrade = "D"
//            }else{
//                letterGrade = "E"
//            }
//            return value
//        }catch (ArithmeticException e){
//            return 0;
//        }
//    }
//
//    Closure display = {
//        println("Name is: ${name}\nMarks are:\nTamil:${grades['Tamil']}\nEnglish:${grades['English']}\nMaths:${grades['Maths']}\nScience:${grades['Science']}\nAverge Numeric Grade is:${calculateAverageGrade()}\nGrade is:${letterGrade}")
//    }
//}
//
//List students = []
//
//println("Enter the No of Students: ")
//
//int n = System.in.newReader().readLine().toInteger()
//Student[] st = new Student[n]
//
//(0..n-1).each {
//    println("Enter the name of Student ${it+1}:")
//    String name = System.in.newReader().readLine()
//    println("Enter the Marks of Student ${it+1}(Tamil, English, Maths, Science):")
//    int Tamil = System.in.newReader().readLine().toInteger()
//    int English = System.in.newReader().readLine().toInteger()
//    int Maths = System.in.newReader().readLine().toInteger()
//    int Science = System.in.newReader().readLine().toInteger()
//    st[it] = new Student(name, [Tamil: Tamil, English: English, Maths: Maths, Science: Science])
//    students << st[it]
//}
//
//for(int i = 0; i < n; i++){
//    st[i].display()
//}