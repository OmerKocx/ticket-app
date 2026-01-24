package com.omerkoc.tickets.mappers;

import com.omerkoc.tickets.domain.dtos.TicketValidationResponseDto;
import com.omerkoc.tickets.domain.entities.Ticket;
import com.omerkoc.tickets.domain.entities.TicketValidation;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-24T13:44:14+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260101-2150, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class TicketValidationMapperImpl implements TicketValidationMapper {

    @Override
    public TicketValidationResponseDto toTicketValidationResponseDto(TicketValidation ticketValidation) {
        if ( ticketValidation == null ) {
            return null;
        }

        TicketValidationResponseDto ticketValidationResponseDto = new TicketValidationResponseDto();

        ticketValidationResponseDto.setTicketId( ticketValidationTicketId( ticketValidation ) );
        ticketValidationResponseDto.setStatus( ticketValidation.getStatus() );

        return ticketValidationResponseDto;
    }

    private UUID ticketValidationTicketId(TicketValidation ticketValidation) {
        Ticket ticket = ticketValidation.getTicket();
        if ( ticket == null ) {
            return null;
        }
        return ticket.getId();
    }
}
