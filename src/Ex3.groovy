// Group the Words Based on the Length

//def words = ['apple', 'banana', 'pear', 'kiwi', 'blueberry']
//
//words = words.groupBy {
//    it.length()
//}
//
//println(words)

// Group the Words Based on the First Character

//def words = ['apple', 'banana', 'pear', 'kiwi', 'blueberry']
//
//words = words.groupBy {
//    it[0]
//}
//
//println(words)

// Group the Words Based on the Remainder of Number

//def numbers = [12, 15, 22, 29, 35, 41, 48]
//
//numbers = numbers.groupBy {
//    it % 3
//}
//
//println(numbers)

// Group people by Grade in Maps

//def students = [
//        [name: 'Mahi', grade: 'A'],
//        [name: 'Raj', grade: 'B'],
//        [name: 'Kumar', grade: 'A'],
//]
//
//students = students.groupBy {
//    it["grade"]
//}
//
//Map result = [:]
//
//students.each {
//    result[it.key] = it.value.name
//}
//
//println(result)

// Group by Category of the Product

//def products = [
//        [name: 'Laptop', category: 'Electronics'],
//        [name: 'Mobile', category: 'Electronics'],
//        [name: 'Table', category: 'Furniture'],
//]
//
//products = products.groupBy {
//    it.category
//}
//
//Map result = [:]
//
//products.each {
//    result[it.key] = it.value.name
//}
//
//println(result)

// Create the Name of the People along with their Entries

//List names = ['Alice', 'Bob', 'Charlie', 'David', 'Eve']
//
//Map result = names.withIndex().collectEntries {String name, int index ->
//    [(index):name]
//}
//
//println(result)

// Convert the Map into name: grade Map format

//List students = [
//        [name: 'Alice', grade: 'A'],
//        [name: 'Bob', grade: 'A'],
//        [name: 'Charlie', grade: 'B'],
//]
//
//Map result = students.collectEntries{
//    [(it.name):it.grade]
//}
//
//println(result)

// List of Names to Map of Name Lengths

//List names = ["Mahi", "Raj", "Kumar"]
//Map result = names.collectEntries{
//    [(it): it.length()]
//}
//
//println(result)

// Swap Keys and Values

//Map studentDetails = [
//        name: "Mahi",
//        age: 19,
//        native: "Rajapalayam"
//]
//
//studentDetails = studentDetails.collectEntries {
//    [(it.value):it.key]
//}
//
//println(studentDetails)

// Name the Customers for each Unique product id

//List orders = [
//        [id: 1, product: 'Laptop', customer:[name: 'Alice', location: 'NY']],
//        [id: 2, product: 'Phone', customer:null],
//        [id: 3, product: 'Tablet', customer:[name: 'Charlie', location: 'LA']],
//]
//
//orders.each {
//    println("Product ${it.id} is Purchased by ${it.customer?.name}")
//}

// Create a Map With Name and City

//Map userDetails = [
//        'Alice': [age:30, address:[city: 'New York', zip:'10001']],
//        'Bob': [age:25, address:[city: 'New York']],
//        'Charlie': [age:30],
//]
//
//userDetails = userDetails.collectEntries {
//    [(it.key): it.value.address?.city ?: "No address"]
//}
//
//println(userDetails)

