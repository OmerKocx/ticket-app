package com.omerkoc.tickets.mappers;

import com.omerkoc.tickets.domain.dtos.GetTicketResponseDto;
import com.omerkoc.tickets.domain.dtos.ListTicketResponseDto;
import com.omerkoc.tickets.domain.dtos.ListTicketTicketTypeResponseDto;
import com.omerkoc.tickets.domain.entities.Event;
import com.omerkoc.tickets.domain.entities.Ticket;
import com.omerkoc.tickets.domain.entities.TicketType;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-24T13:44:14+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260101-2150, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public ListTicketTicketTypeResponseDto toListTicketTicketTypeResponseDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        ListTicketTicketTypeResponseDto listTicketTicketTypeResponseDto = new ListTicketTicketTypeResponseDto();

        listTicketTicketTypeResponseDto.setId( ticketType.getId() );
        listTicketTicketTypeResponseDto.setName( ticketType.getName() );
        listTicketTicketTypeResponseDto.setPrice( ticketType.getPrice() );

        return listTicketTicketTypeResponseDto;
    }

    @Override
    public ListTicketResponseDto toListTicketResponseDto(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        ListTicketResponseDto listTicketResponseDto = new ListTicketResponseDto();

        listTicketResponseDto.setId( ticket.getId() );
        listTicketResponseDto.setStatus( ticket.getStatus() );
        listTicketResponseDto.setTicketType( toListTicketTicketTypeResponseDto( ticket.getTicketType() ) );

        return listTicketResponseDto;
    }

    @Override
    public GetTicketResponseDto toGetTicketResponseDto(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        GetTicketResponseDto getTicketResponseDto = new GetTicketResponseDto();

        getTicketResponseDto.setPrice( ticketTicketTypePrice( ticket ) );
        getTicketResponseDto.setDescription( ticketTicketTypeDescription( ticket ) );
        getTicketResponseDto.setEventName( ticketTicketTypeEventName( ticket ) );
        getTicketResponseDto.setEventVenue( ticketTicketTypeEventVenue( ticket ) );
        getTicketResponseDto.setEventStart( ticketTicketTypeEventStart( ticket ) );
        getTicketResponseDto.setEventEnd( ticketTicketTypeEventEnd( ticket ) );
        getTicketResponseDto.setId( ticket.getId() );
        getTicketResponseDto.setStatus( ticket.getStatus() );

        return getTicketResponseDto;
    }

    private Double ticketTicketTypePrice(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        return ticketType.getPrice();
    }

    private String ticketTicketTypeDescription(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        return ticketType.getDescription();
    }

    private String ticketTicketTypeEventName(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        Event event = ticketType.getEvent();
        if ( event == null ) {
            return null;
        }
        return event.getName();
    }

    private String ticketTicketTypeEventVenue(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        Event event = ticketType.getEvent();
        if ( event == null ) {
            return null;
        }
        return event.getVenue();
    }

    private LocalDateTime ticketTicketTypeEventStart(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        Event event = ticketType.getEvent();
        if ( event == null ) {
            return null;
        }
        return event.getStart();
    }

    private LocalDateTime ticketTicketTypeEventEnd(Ticket ticket) {
        TicketType ticketType = ticket.getTicketType();
        if ( ticketType == null ) {
            return null;
        }
        Event event = ticketType.getEvent();
        if ( event == null ) {
            return null;
        }
        return event.getEnd();
    }
}
