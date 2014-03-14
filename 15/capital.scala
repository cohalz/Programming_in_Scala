val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
capitals get "France"
capitals get "North Pole"

def show(x: Option[String]) = x match {
  case Some(s) => s
  case None => "?"
}

show(capitals get "Japan")
show(capitals get "France")
show(capitals get "North Pole")

for((country, city) <- capitals) println("The capital of" + country + " is " + city)
