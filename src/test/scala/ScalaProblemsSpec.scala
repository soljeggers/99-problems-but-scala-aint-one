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

  "nthNumber" must {
    "when provided with 2 and a list of numbers 1,2,3 return 2" in {
      ScalaProblems.nthNumber(List(1,2,3), 2) mustEqual 2
    }
    "when provided with 4 and a list of numbers 2,4,3,1,2 return the number at index of 4" in {
      ScalaProblems.nthNumber(List(2,4,3,1,2) ,4) mustEqual 1
    }
  }

  "numberOfElements" must {
    "when provided with a list of 1 return the number of elements 1" in {
      ScalaProblems.numberOfElements(List(1)) mustEqual 1
    }
  }

}
