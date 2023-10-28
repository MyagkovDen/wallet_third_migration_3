package com.denismiagkov.walletservice.application.dto;

import com.denismiagkov.walletservice.application.service.serviceImpl.Entry;
import com.denismiagkov.walletservice.domain.model.Player;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-28T23:53:47+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class PlayerMapperImpl implements PlayerMapper {

    @Override
    public PlayerDto toPlayerDto(Player player, Entry entry) {
        if ( player == null && entry == null ) {
            return null;
        }

        PlayerDto playerDto = new PlayerDto();

        if ( player != null ) {
            playerDto.setName( player.getFirstName() );
            playerDto.setSurname( player.getLastName() );
            playerDto.setEmail( player.getEmail() );
        }
        if ( entry != null ) {
            playerDto.setLogin( entry.getLogin() );
            playerDto.setPassword( entry.getPassword() );
        }

        return playerDto;
    }
}
