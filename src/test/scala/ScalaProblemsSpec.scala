import org.scalatest.{MustMatchers, WordSpec}

class ScalaProblemsSpec extends WordSpec with MustMatchers {

  "ScalaProblems" must {

    "when provided with a list of numbers return the last element of that list" in {
      ScalaProblems.lastOfList(List(1,2,3,4,5)) mustEqual 5
    }
  }

}
