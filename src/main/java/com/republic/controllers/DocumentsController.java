package com.republic.controllers;

import com.republic.gateway.DocumentsService;
import com.republic.models.Document;
import com.republic.models.HelloResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/documents", produces = "application/json;charset=UTF-8")
public class DocumentsController {

    @Autowired
    private DocumentsService docService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Document> process() {
        return docService.getsAllDocuments();
    }


}
