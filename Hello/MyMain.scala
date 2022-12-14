// object MyMain {
//   def main(params: Array[String]) = {
//     println("Hello World")
//   }
// }
// object MyMain extends App {
//     println("Hello World")
// }
// import scalaj.http.{Http, HttpResponse}
// import scala.xml.XML
// object MyMain extends App {
//     val response: HttpResponse[String] = Http("http://feeds.bbci.co.uk/news/rss.xml").asString
//     val xml = XML.loadString(response.body)
//     val titles = xml.\\("item").\("title")
//     val titlesTexts = for { title <- titles } yield title.text
//     titlesTexts.foreach(titlesText => println(titlesText))
// }
import scalaj.http.Http
import scala.xml.XML
object MyMain extends App {
    // using complier declaration type inference -> not using : HttpResponse[String] and import HttpResponse
    val response = Http("http://feeds.bbci.co.uk/news/rss.xml").asString
    val xml = XML.loadString(response.body)
    // if method has only one parameter, you can not use . and () -> using space and remove ()
    val titles = xml \\ "item" \ "title"
    val titlesTexts = for { title <- titles } yield title.text
    // if only one parameter, you can use method name right away
    titlesTexts.foreach(println)
}
