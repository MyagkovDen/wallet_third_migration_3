package com.denismiagkov.walletservice.application.dto;

import com.denismiagkov.walletservice.domain.model.Operation;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-28T23:53:47+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Oracle Corporation)"
)
public class OperationMapperImpl implements OperationMapper {

    @Override
    public OperationDto toOperationDto(Operation operation) {
        if ( operation == null ) {
            return null;
        }

        OperationDto operationDto = new OperationDto();

        operationDto.setTime( operation.getTime() );
        operationDto.setType( operation.getType() );
        operationDto.setStatus( operation.getStatus() );
        operationDto.setPlayerId( operation.getPlayerId() );

        return operationDto;
    }

    @Override
    public List<OperationDto> toOperationDtoList(List<Operation> operations) {
        if ( operations == null ) {
            return null;
        }

        List<OperationDto> list = new ArrayList<OperationDto>( operations.size() );
        for ( Operation operation : operations ) {
            list.add( toOperationDto( operation ) );
        }

        return list;
    }
}
