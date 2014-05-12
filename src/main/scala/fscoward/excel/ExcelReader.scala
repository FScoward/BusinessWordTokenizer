package fscoward.excel
/**
 * Created by FScoward on 2014/05/12.
 */
import org.apache.poi.ss.usermodel.{Sheet, WorkbookFactory, Workbook}
import java.io.FileInputStream

object ExcelReader {
  var _workbook: Option[Workbook] = None
  def readExcel(filename: String): this.type = {
    _workbook = Option(WorkbookFactory.create(new FileInputStream(filename)))
    this
  }

  def readSheet(sheetName: String): Option[Sheet] = {
    _workbook.map{_.getSheet(sheetName)}
  }
}
