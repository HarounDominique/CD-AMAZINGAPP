package com.campusdual.appamazing.api;

import com.campusdual.appamazing.model.dto.ContactDto;
import com.campusdual.appamazing.model.dto.ProductDto;

import java.util.List;

public interface IContactService {

    ContactDto queryContact(ContactDto contactDto);

    List<ContactDto> queryAllContacts();

    int insertContact(ContactDto contactDto);

    int updateContact(ContactDto contactDto);

    int deleteContact(ContactDto contactDto);

}
