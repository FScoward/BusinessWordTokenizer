package fscoward

/**
 * Created by FScoward on 2014/05/12.
 */
object Main {
  def main(args: Array[String]): Unit = {
    ExTokenizer.tokenize("ボーナス分割回数").foreach{token =>
      println(token.getSurfaceForm)
    }
  }
}
