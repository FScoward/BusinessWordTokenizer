package fscoward.excel

import org.apache.poi.ss.usermodel.{WorkbookFactory, Sheet, Workbook}

/**
 * Created by tie028767 on 2014/05/14.
 */
object ExcelWriter {
  def write(workBook: Workbook, sheetName: String, text: String) = {

    WorkbookFactory.create()
    workBook.getSheet(sheetName).createRow(0).createCell(1).setCellValue(text)

  }
}
