package fscoward

/**
 * Created by FScoward on 2014/05/12.
 */

import org.atilika.kuromoji.{Token, Tokenizer}
import scala.collection.JavaConversions._

object ExTokenizer {
  
  def tokenize(text: String): Iterator[Token] = {
    Tokenizer.builder().build().tokenize(text).iterator().toIterator
  }
  
  def translate(word: String) = {
    
  }
  
}
