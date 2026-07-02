public abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();

    // Common operation that uses the factory method
    public Document openDocument() {
        Document document = createDocument();
        document.open();
        return document;
    }
}
