package com.example.demo.controller;

import com.example.demo.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.contactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    contactService contactService;
   @PostMapping
   public ResponseEntity<Contact> createContact(@RequestBody Contact contact) {
    try {
        contactService.create(contact);
    }catch (Exception e){
    e.printStackTrace();
    }
       return ResponseEntity.status(HttpStatus.CREATED).body(contact);
   }

    public ResponseEntity<Contact> getContact(@RequestBody Contact contact) {
        try {
            contactService.getContact(contact);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contact);
    }

    public ResponseEntity<Contact> deleteContact(@RequestBody Contact contact) {
        try {
            contactService.deleteContact(contact);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contact);
    }

    public ResponseEntity<Contact> updateContact(@RequestBody Contact contact) {
        try {
            com.example.demo.service.contactService.updateContact(contact);
        }catch (Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(contact);
    }
}
