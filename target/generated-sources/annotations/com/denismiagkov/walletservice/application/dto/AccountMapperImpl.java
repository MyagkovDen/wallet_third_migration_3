package com.denismiagkov.walletservice.application.dto;

import com.denismiagkov.walletservice.domain.model.Account;
import com.denismiagkov.walletservice.domain.model.Player;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-28T23:53:47+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class AccountMapperImpl implements AccountMapper {

    @Override
    public AccountDto toAccountDto(Player player, Account account) {
        if ( player == null && account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        if ( player != null ) {
            accountDto.setName( player.getFirstName() );
            accountDto.setSurname( player.getLastName() );
        }
        if ( account != null ) {
            accountDto.setNumber( account.getNumber() );
            accountDto.balance = account.getBalance();
        }

        return accountDto;
    }

    @Override
    public Set<PlayerDto> toPlayerDtoList(List<Player> players) {
        if ( players == null ) {
            return null;
        }

        Set<PlayerDto> set = new LinkedHashSet<PlayerDto>( Math.max( (int) ( players.size() / .75f ) + 1, 16 ) );
        for ( Player player : players ) {
            set.add( playerToPlayerDto( player ) );
        }

        return set;
    }

    protected PlayerDto playerToPlayerDto(Player player) {
        if ( player == null ) {
            return null;
        }

        PlayerDto playerDto = new PlayerDto();

        playerDto.setEmail( player.getEmail() );

        return playerDto;
    }
}
