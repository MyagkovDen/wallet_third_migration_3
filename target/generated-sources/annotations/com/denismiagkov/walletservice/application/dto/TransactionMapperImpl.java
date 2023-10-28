package com.denismiagkov.walletservice.application.dto;

import com.denismiagkov.walletservice.domain.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-28T23:53:47+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDto toTransactionDto(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDto transactionDto = new TransactionDto();

        transactionDto.setTime( transaction.getTime() );
        transactionDto.setType( transaction.getType() );
        transactionDto.setAmount( transaction.getAmount() );

        return transactionDto;
    }

    @Override
    public List<TransactionDto> toTransactionDtoList(List<Transaction> transactions) {
        if ( transactions == null ) {
            return null;
        }

        List<TransactionDto> list = new ArrayList<TransactionDto>( transactions.size() );
        for ( Transaction transaction : transactions ) {
            list.add( toTransactionDto( transaction ) );
        }

        return list;
    }
}
