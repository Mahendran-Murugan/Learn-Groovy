// Today I try to Recall All the Closure Related Concepts in Groovy Like normal Closure, each, eachWithIndex, collect and findAll


// Closure

// Before Get into Closure I like to Mimic A Function into a Closure

static boolean isEligibleToVote(int age){
    return age >= 18
}

println(isEligibleToVote(10))

Closure<Boolean> isEligibleToVoteClosure = { int age ->
    return age >= 18
}

println(isEligibleToVoteClosure(20))

// Closure Without Parameters

Closure greet = { -> println("Hello")}

greet()
//greet("mahi") // Won't Work

// Closure with variable Args ...

Closure sumAll = { int... nums ->
    int sum = 0
    nums.each { int num ->
        sum += num
    }
    return sum
}

println(sumAll(1, 2, 3, 4, 5))

// Currying

// Left

Closure greetings = { String greets, String name ->
    return "$greets $name"
}

Closure greetingsWithLeftCurry = greetings.curry("Hello")

println(greetingsWithLeftCurry("Mahi"))


// Right

Closure greetingsWithRightCurry = greetings.rcurry("Mahi")

println(greetingsWithRightCurry("Good Morning"))


// nCurry or IndexBasedCurry

Closure greetingsWithNCurry = greetings.ncurry(0, "Hello")

println(greetingsWithNCurry("Mahi"))
