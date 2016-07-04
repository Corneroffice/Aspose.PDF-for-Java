package com.aspose.pdf.examples.AsposePdf.Documents;

import com.aspose.pdf.examples.Utils;

public class GetPDFFileInfo
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetPDFFileInfo.class);
        //Open document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir+ "input.pdf");
        //Get document information
        com.aspose.pdf.DocumentInfo docInfo = pdfDocument.getInfo();
        //Show document information
        System.out.printf("Author:-" + docInfo.getAuthor());
        System.out.printf("\n Creation Date:-" + docInfo.getCreationDate());
        System.out.printf("\n Keywords:-" + docInfo.getKeywords());
        System.out.printf("\n Modify Date:-" + docInfo.getModDate());
        System.out.printf("\n Subject:-" + docInfo.getSubject());
        System.out.printf("\n Title:-" + docInfo.getTitle());
        
    }
}




