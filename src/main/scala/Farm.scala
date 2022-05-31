import scala.io.Source

object Farm extends App{


  val lines = Source.fromFile("harvest.csv").getLines().toArray
  val prices = Source.fromFile("prices.csv").getLines().toArray

  val farmersData= lines.map( line => line.split(",") )
  val pricesData = prices.map( line => line.split(",") )

}
