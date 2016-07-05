package com.aspose.pdf.examples.AsposePdf.Text;

import com.aspose.pdf.examples.Utils;

public class ExtractTextAllPages
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtractTextAllPages.class);
      
        //open document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir + "input.pdf");
        //create TextAbsorber object to extract text
        com.aspose.pdf.TextAbsorber textAbsorber = new com.aspose.pdf.TextAbsorber();
        
        //accept the absorber for all the pages
        pdfDocument.getPages().accept(textAbsorber);
        
        //In order to extract text from specific page of document, we need to specify the particular page using its index against accept(..) method.
        //accept the absorber for particular PDF page
        //pdfDocument.getPages().get_Item(1).accept(textAbsorber);
        
        //get the extracted text
        String extractedText = textAbsorber.getText();

        // create a writer and open the file
        java.io.FileWriter writer = new java.io.FileWriter(new java.io.File(dataDir + "extracted_text.out.txt"));
        writer.write(extractedText);
        // write a line of text to the file
        //tw.WriteLine(extractedText);
        // close the stream
        writer.close();
        
        //Print message
        System.out.println("Text extracted successfully. Check output file.");
    }
}
