object ScalaProblems extends App {

  def lastOfList(numList: List[Int]) : Int = {
    numList
    .last
  }

  def secondLast(numList: List[Int]) : Int = {
    val reverse = numList.reverse.tail
    reverse.head
  }

  def nthNumber(numList : List[Int], k: Int) : Int = {
    numList(k - 1)
  }

  def numberOfElements(numList: List[Int]) : Int = {
    numList.length
  }

  def reverseList(numList: List[Int]) : List[Int] = {
    numList.reverse
  }
}
