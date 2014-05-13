package fscoward

/**
 * Created by FScoward on 2014/05/12.
 */
object Main {
  def main(args: Array[String]): Unit = {
    ExTokenizer.tokenize("銀聯売上要求").foreach{token =>
      println(token.getAllFeatures)
    }
  }
}
