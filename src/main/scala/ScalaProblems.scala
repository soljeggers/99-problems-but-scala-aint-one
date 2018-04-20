object ScalaProblems extends App {

  def lastOfList(numList: List[Int]) : Int = {
    numList
    .last
  }

  def secondLast(numList: List[Int]) : Int = {
    val reverse = numList.reverse.tail
    reverse.head
  }



}
