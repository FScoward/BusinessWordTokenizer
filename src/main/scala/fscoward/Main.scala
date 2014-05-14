package fscoward

import fscoward.excel.ExcelReader
import collection.JavaConversions._

/**
 * Created by FScoward on 2014/05/12.
 */
object Main {
  def main(args: Array[String]): Unit = {
   /*
    ExTokenizer.tokenize("銀聯売上").foreach{token =>
      println(token.getSurfaceForm)
    }
*/

    ExcelReader.readExcel("sample.xlsx").readSheet("sample").map(_.rowIterator().foreach{ row =>
      println(row.getCell(0))
    })

  }
}
