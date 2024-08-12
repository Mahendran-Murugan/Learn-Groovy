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

// Binary Search

//int[] arr = new int[] {0, 1, 2, 3, 4, 5}
//int x = 1
//int low = 0
//int high = arr.length - 1
//int mid = 0
//while(low <= high){
//    mid = (low + high).intdiv(2)
//    if(arr[mid] == x){
//        println("The index of $x is $mid")
//        break
//    }else if(arr[mid] < x){
//        low = mid + 1
//    }else{
//        high = mid - 1
//    }
//}

// Convert the Phrase into Acronyms

//Closure converter = { String str ->
//    List words = str.split("[\\s-]+")
//    String res = ""
//    words.each {
//        res += it[0].toUpperCase()
//    }
//    println(res)
//}
//
//List phrases = ["as soon as possible", "Liquid-crystal display", "Thank George It's Friday!"]
//phrases.each {
//    converter(it)
//}

// Comparing DNA Strands

//String firstStrand = "GAGCCTACTAACGGGAT"
//String secondStrand = "CATCGTAATGACGGCCT"
//
//int hammingDistance = 0
//for(int i = 0; i < firstStrand.length(); i++){
//    if(firstStrand.charAt(i) != secondStrand.charAt(i)) hammingDistance++
//}
//
//println(hammingDistance)

// Pangram or Not

//int[] arr = new int[26]
//String str = "abcdefghijklmnopqrstuvwxyz"
//str = str.toLowerCase()
//str.each {
//    arr[(char)it - 97]++
//}
//boolean flag = true
//arr.each {
//    if(it == 0) {
//        flag = false
//    }
//}
//
//if(flag) println("Pangram")
//else println("Not Pangram")

// RNA Complement for DNA

//Map conversion = [
//        G: 'C',
//        C: 'G',
//        T: 'A',
//        A: 'U'
//]
//
//String DNA = "ACGT"
//String complementRNA = ""
//
//DNA.each{
//    complementRNA += conversion[it]
//}
//
//println(complementRNA)

// Check the verification Logic of 10 digit no

//String number = "3-598-21508-8"
//int result = 0
//int i = 10
//number.each {
//    if(it == '-') return
//    result += (char)it * i--
//}
//
//if(result % 11 == 0) println("Valid")
//else println("Not Valid")

// Find Words Scrabble Score
//
//String word = "CABBAGE"
//int score = 0
//
//Closure<Integer> find = { String letter ->
//    switch (letter){
//        case ['A','E','I','O','U','L','N','R','S','T']:
//            return 1
//        case ['D', 'G']:
//            return 2
//        case ['B','C','M','P']:
//            return 3
//        case ['F','H','V','W','Y']:
//            return 4
//        case 'K':
//            return 5
//        case ['J','X']:
//            return 8
//        case ['Q','Z']:
//            return 10
//    }
//    return 0
//}
//
//word.each {
//    score += find(it)
//}
//
//println(score)

// Count the No of Occurrence of Each Words

//String str = "Thats the password: 'PASSWORD 123', cried the Special Agent.\nSo I fled"
//def wordList = str.toLowerCase().split("[\\s:!\\',\\.]+")
//Map res = [:]
//wordList.each {
//    if(res.containsKey(it)) res[it]++
//    else res[it] = 1
//}
//
//println(res)

// Anagrams

//String target = "stone"
//List candidates = ["stone", "tones", "banana", "tons", "notes", "Seton"]
//
//candidates.each { candidate ->
//    if(candidate == target) return
//    if(candidate.length() != target.length()) return
//    String curr = candidate.toLowerCase()
//    target.each {
//        curr -= it
//    }
//    if(curr.length() == 0) println(candidate)
//}

// Check for Isograms

List words = ["lumberjack", "background", "downstream", "six-year-old"]
int[] arr = new int[26]
boolean flag = true
words.each {String word ->
    flag = true
    word.toLowerCase().each {
        if(it == " " || it == "-") return
        arr[(char)it - 97]++
    }
    arr.each {
        if(it > 1) flag = false
    }
    Arrays.fill(arr, 0)
    if(flag) println(word)
}