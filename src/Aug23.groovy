// Continuation of Closures

// Fibonacci Using Closures and memoize

Closure fibonacci

fibonacci= { long  n ->
    return n < 2 ? n : fibonacci(n-1) + fibonacci(n-2)
}.memoize()

println(fibonacci(15))

// each

// Find the highest length Fruits in the given List

List fruits = ["banana", "mango", "apple", "orange", "grapes"]

List result = []

int maxLength = 0
int len = 0

fruits.each{String fruit ->
    len = fruit.length()
    if(len > maxLength){
        maxLength = len
        result = [fruit]
    }else if(len == maxLength){
        result << fruit
    }
}

println("The highest length fruits are: ")

result.each { String fruit ->
    println("$fruit length is ${fruit.length()}")
}

// eachWithIndex

// Print the List Items Along with their Indices

List names = ["Mahi", "Kumar", "Raj", "Ramesh"]

names.eachWithIndex { String name, int index ->
    println("$name index is $index")
}

// Collect

// Multiply All the No in List By 2

int[] nums = new int[]{1, 2, 3, 4, 5}

nums = nums.collect{int num ->
    return num * 2
} as int[]

println(nums)

// findAll

// Find All the Ages that are greater than 18

int[] ages = new int[]{1, 2, 3, 4, 5, 41, 23, 14}

ages = ages.findAll{int age ->
    return age > 18
} as int[]

println(ages)