# FactoryMethodPatternExample

## Exercise 2: Implementing the Factory Method Pattern

**Scenario:**
You are developing a document management system that needs to create different types of documents (e.g., Word, PDF, Excel). Use the Factory Method Pattern to achieve this.

**Steps:**

1. **Create a New Java Project:**
   - Create a new Java project named `FactoryMethodPatternExample`.

2. **Define Document Classes:**
   - Create interfaces or abstract classes for different document types such as `WordDocument`, `PdfDocument`, and `ExcelDocument`.

3. **Create Concrete Document Classes:**
   - Implement concrete classes for each document type that implements or extends the above interfaces or abstract classes.

4. **Implement the Factory Method:**
   - Create an abstract class `DocumentFactory` with a method `createDocument()`.
   - Create concrete factory classes for each document type that extends `DocumentFactory` and implements the `createDocument()` method.

5. **Test the Factory Method Implementation:**
   - Create a test class to demonstrate the creation of different document types using the factory method.

## Files

| File | Role |
|---|---|
| `Document.java` | Common interface for all document types |
| `WordDocument.java` | Concrete Word document |
| `PdfDocument.java` | Concrete PDF document |
| `ExcelDocument.java` | Concrete Excel document |
| `DocumentFactory.java` | Abstract factory declaring the factory method `createDocument()` |
| `WordDocumentFactory.java` | Concrete factory producing `WordDocument` |
| `PdfDocumentFactory.java` | Concrete factory producing `PdfDocument` |
| `ExcelDocumentFactory.java` | Concrete factory producing `ExcelDocument` |
| `FactoryMethodTest.java` | Test class demonstrating creation of each document type |

## How to Run

```bash
javac Document.java WordDocument.java PdfDocument.java ExcelDocument.java DocumentFactory.java WordDocumentFactory.java PdfDocumentFactory.java ExcelDocumentFactory.java FactoryMethodTest.java
java FactoryMethodTest
```

## Expected Output

```
Opening Word document...
Saving Word document as .docx

Opening PDF document...
Saving PDF document as .pdf

Opening Excel document...
Saving Excel document as .xlsx
```
