package com.example.demo.service;

import com.example.demo.entity.Contact;
import com.example.demo.repo.contactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class contactService {

    @Autowired
    private static contactRepo repo;
    public static Contact updateContact(Contact contact) {
        try {
            Optional<Contact> byId = repo.findById(contact.getId());
            if(byId.isPresent()){
                Contact save = repo.save(contact);
                return save;
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Contact create(Contact contact) {
        try {
            Contact save = repo.save(contact);
            return save;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Contact getContact(Contact contact) {
        try {
            Optional<Contact> byId = repo.findById(contact.getId());
            if(byId.isPresent()){
                return byId.get();
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void deleteContact(Contact contact) {

        try {
            repo.deleteById(contact.getId());
            return;
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
