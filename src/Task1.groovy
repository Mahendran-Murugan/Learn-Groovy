////Write a Groovy program to get a date before 2 years and format the date to ‘dd-MM-yyyy’
//
//def today = new Date()
//def calendar = Calendar.getInstance()
//calendar.setTime(today)
//calendar.add(Calendar.YEAR, -2)
//def result = calendar.getTime()
//result = result.format("dd-MM-yyyy")
//println(result)

//// Calculate the difference in days between two given dates 18-01-2018 and 21-10-2024
//
//import java.text.SimpleDateFormat
//
//def format = new SimpleDateFormat("dd-MM-yyyy")
//
//def date1 = format.parse("18-01-2018")
//def date2 = format.parse("21-10-2024")
//
//println("The Difference in Days are: " + (Math.abs(date1 - date2)))

////Write a Groovy program to create a new Map
////
////List list1 = ['Beef', 'Pork', 'Fish', 'Meat', 'Carrot', 'Beetroot', 'Cucumber']
////Map map1 = ['Non-Veg': ['Beef', 'Pork', 'Fish', 'Meat'],
////            'Veg' : ['Carrot', 'Beetroot', 'Cucumber']]
////
////Result must be like this
////        {
////            "Beef" : "Non-Veg",
////            "Pork" : "Non-Veg",
////            "Fish" : "Non-Veg",
////            "Meat" : "Non-Veg",
////            "Carrot" : "Veg",
////            "Beetroot" : "Veg",
////            "Cucumber" : "Veg"
////        }
//
//
//List list1 = ['Beef', 'Pork', 'Fish', 'Meat', 'Carrot', 'Beetroot', 'Cucumber']
//Map map1 = [
//        'Non-Veg': ['Beef', 'Pork', 'Fish', 'Meat'],
//        'Veg': ['Carrot', 'Beetroot', 'Cucumber']
//]
//
//Map result = [:]
//
//list1.each {String item ->
//    map1.each { String key, List val ->
//        if(val.contains(item)) result[item] = key
//    }
//}
//
//println(result)

//Given a list of student names and their corresponding scores, create a map where the keys are the names and the values are their grades based on the score (A for score >= 90, B for 80 <= score < 90, C for 70 <= score < 80, and F for score < 70).
//
//List students = ["Alice", "Bob", "Charlie", "David"]
//List scores = [85, 92, 78, 60]
//
//
//Result must be like this
//        {
//            "Alice" : "B",
//            "Bob" : "A",
//            "Charlie" : "C",
//            "David" : "F"
//        }

//List students = ["Alice", "Bob", "Charlie", "David"]
//List scores = [85, 92, 78, 60]
//
//Closure calculateGrade = { int score ->
//    if(score >= 90) return "A"
//    else if(score >= 80) return "B"
//    else if(score >= 70) return "C"
//    else return "F"
//}
//
//Map result = [:]
//
//students.eachWithIndex { String data, int index ->
//    result[data] = calculateGrade(scores[index])
//}
//
//println(result)


////Write a Groovy program to create a new Map
////
////List fruits = ['Apple', 'Banana', 'Orange', 'Grapes', 'Kiwi']
////Map fruitCategories = [
////            'Citrus': ['Orange', 'Lemon', 'Lime'],
////            'Tropical': ['Banana', 'Pineapple', 'Mango'],
////            'Berries': ['Strawberry', 'Blueberry', 'Raspberry']
////]
////
////Result must be like this
////        {
////            "Apple" : "Other",
////            "Banana" : "Tropical",
////            "Orange" : "Citrus",
////            "Grapes" : "Other",
////            "Kiwi" : "Other"
////        }
//
//
//List fruits = ['Apple', 'Banana', 'Orange', 'Grapes', 'Kiwi']
//Map fruitCategories = [
//            'Citrus': ['Orange', 'Lemon', 'Lime'],
//            'Tropical': ['Banana', 'Pineapple', 'Mango'],
//            'Berries': ['Strawberry', 'Blueberry', 'Raspberry']
//]
//
//Map result = [:]
//boolean flag = false
//
//fruits.each {String item ->
//    flag = false
//    fruitCategories.each {String type, List fruitList ->
//        if(fruitList.contains(item)){
//            result[item] = type
//            flag = true
//        }
//    }
//    if(!flag) result[item] = "Other"
//}
//
//println(result)

//def people = [
//         [name: 'John', age: 30, city: 'New York'],
//         [name: 'Jane', age: 25, city: 'Los Angeles'],
//         [name: 'Doe', age: 35, city: 'New York']
//]
//Group people by city
//Calculate the average age for each city

def people = [
         [name: 'John', age: 30, city: 'New York'],
         [name: 'Jane', age: 25, city: 'Los Angeles'],
         [name: 'Doe', age: 35, city: 'New York']
]

Map result = people.groupBy {
    it.city
}

result.each {
    int age = 0
    it.value.each {
        age += it.age
    }
    println("The Average Age of Peoples in ${it.key} is ${age / it.value.size()}")
}