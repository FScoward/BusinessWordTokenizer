package fscoward

/**
 * Created by FScoward on 2014/05/12.
 */

import org.atilika.kuromoji.{Token, Tokenizer}
import scala.collection.JavaConversions._
import org.atilika.kuromoji.Tokenizer.Mode

object ExTokenizer {
  
  def tokenize(text: String): Iterator[Token] = {
    
    Tokenizer.builder()
      .userDictionary(".\\src\\main\\resources\\userdict.txt")
      .build().tokenize(text).iterator().toIterator
  }
  
  def translate(word: String) = {
    
  }
  
}
