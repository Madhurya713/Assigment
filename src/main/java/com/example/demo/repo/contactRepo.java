package com.example.demo.repo;

import com.example.demo.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface contactRepo extends JpaRepository<Contact,Long> {
}
