public class FactoryMethodTest {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.openDocument();
        wordDoc.save();

        System.out.println();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.openDocument();
        pdfDoc.save();

        System.out.println();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.openDocument();
        excelDoc.save();
    }
}
