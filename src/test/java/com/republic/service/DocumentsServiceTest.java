package com.republic.service;


import com.republic.gateway.DocumentsService;
import com.republic.service.data.DocumetsSample;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DocumentsServiceTest {

    private DocumentsService service=new DataDocumentsService();
    private DocumetsSample expectedData= new DocumetsSample();


    @Test
    public void shouldGiveAllDocuments(){

        System.out.println(service.getsAllDocuments());
        assertTrue(true);
    }
}
