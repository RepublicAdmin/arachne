package com.republic.service;


import com.republic.gateway.DocumentsService;
import com.republic.models.Document;
import com.republic.models.DocumentBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataDocumentsService implements DocumentsService {



    @Override
    public List<Document> getsAllDocuments() {
        List<Document> ret= new ArrayList<Document>();
        ret.add(DocumentBuilder.onDocumentBuilder()
                .withNazwaPliku("nazwa.txt")
                .withUrlPliku("www.plik.com")
                .withOpisPliku("Readme do projektu")
                .build());
        return ret;
    }
}
