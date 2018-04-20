import org.scalatest.{MustMatchers, WordSpec}

class ScalaProblemsSpec extends WordSpec with MustMatchers {

  "lastOfList" must {

    "when provided with a list of numbers return the last element of that list" in {
      ScalaProblems.lastOfList(List(1)) mustEqual 1
    }

    "when provided with a list of numbers return the last element of the list " in {
      ScalaProblems.lastOfList(List(1,2,3,4,5)) mustEqual 5
    }
  }

  "secondLast" must {

    "when provided with a list of numbers return the second last number of the list" in {
      ScalaProblems.secondLast(List(1,2,3,4,5)) mustEqual 4
    }

  }

}
