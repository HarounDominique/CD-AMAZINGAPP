package com.campusdual.appamazing.controller;

import com.campusdual.appamazing.api.IContactService;
import com.campusdual.appamazing.model.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private IContactService contactService;

    @PostMapping("/get")
    public ContactDto queryContact(@RequestBody ContactDto contactDto){
        return this.contactService.queryContact(contactDto);
    }

    @GetMapping("/get/{id}")
    public ContactDto queryContact(@PathVariable int id){
        ContactDto contactDto = new ContactDto();
        contactDto.setId(id);
        return this.contactService.queryContact(contactDto);
    }

    @GetMapping("/getall")
    public List<ContactDto> queryAllContacts(){
        return this.contactService.queryAllContacts();
    }

    @PostMapping("/add")
    public int addContact(@RequestBody ContactDto contactDto){
        return this.contactService.insertContact(contactDto);
    }

    @PutMapping("/update")
    public int updateContact(@RequestBody ContactDto contactDto){
        return this.contactService.updateContact(contactDto);
    }

    @DeleteMapping("/delete")
    public int deleteContact(@RequestBody ContactDto contactDto){
        return this.contactService.deleteContact(contactDto);
    }
}
