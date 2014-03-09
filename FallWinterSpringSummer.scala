import CheckAccumulator.calculate
object FallWinterSpringSummer extends Application{
	for(season <- List("fall","winter","spring"))
		println(season + ": " + calculate(season))
}
