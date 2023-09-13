package com.campusdual.appamazing.model.dto.dtomapper;

import com.campusdual.appamazing.model.Contact;
import com.campusdual.appamazing.model.dto.ContactDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    ContactDto toDTO(Contact contact);

    Contact toEntity(ContactDto contactDTO);

    List<ContactDto> toDTOList(List<Contact> contacts);
}
