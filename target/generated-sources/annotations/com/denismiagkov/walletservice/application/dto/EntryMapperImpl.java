package com.denismiagkov.walletservice.application.dto;

import com.denismiagkov.walletservice.application.service.serviceImpl.Entry;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-28T23:53:47+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class EntryMapperImpl implements EntryMapper {

    @Override
    public EntryDto toEntryDto(Entry entry) {
        if ( entry == null ) {
            return null;
        }

        EntryDto entryDto = new EntryDto();

        entryDto.setLogin( entry.getLogin() );
        entryDto.setPassword( entry.getPassword() );

        return entryDto;
    }

    @Override
    public List<EntryDto> toEntryDtoList(List<Entry> entries) {
        if ( entries == null ) {
            return null;
        }

        List<EntryDto> list = new ArrayList<EntryDto>( entries.size() );
        for ( Entry entry : entries ) {
            list.add( toEntryDto( entry ) );
        }

        return list;
    }
}
