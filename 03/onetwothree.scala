val oneTwo = List(1,2)
val threeFour = List(3,4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " wore not mutated.")
println("Thus, "+ oneTwoThreeFour  + " is a now list")

val twoThree = List(2,3)
val oneTwoThree = 1 :: twoThree
println(oneTwoThree)

val oneTwoThree_ = 1 :: 2 :: 3 :: Nil

println(oneTwoThree)
