package com.omerkoc.tickets.mappers;

import com.omerkoc.tickets.domain.CreateEventRequest;
import com.omerkoc.tickets.domain.CreateTicketTypeRequest;
import com.omerkoc.tickets.domain.UpdateEventRequest;
import com.omerkoc.tickets.domain.UpdateTicketTypeRequest;
import com.omerkoc.tickets.domain.dtos.CreateEventRequestDto;
import com.omerkoc.tickets.domain.dtos.CreateEventResponseDto;
import com.omerkoc.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.omerkoc.tickets.domain.dtos.GetEventDetailsResponseDto;
import com.omerkoc.tickets.domain.dtos.GetEventDetailsTicketTypesResponseDto;
import com.omerkoc.tickets.domain.dtos.GetPublishedEventDetailsResponseDto;
import com.omerkoc.tickets.domain.dtos.GetPublishedEventDetailsTicketTypesResponseDto;
import com.omerkoc.tickets.domain.dtos.ListEventResponseDto;
import com.omerkoc.tickets.domain.dtos.ListEventTicketTypesResponseDto;
import com.omerkoc.tickets.domain.dtos.ListPublishedEventResponseDto;
import com.omerkoc.tickets.domain.dtos.UpdateEventRequestDto;
import com.omerkoc.tickets.domain.dtos.UpdateEventResponseDto;
import com.omerkoc.tickets.domain.dtos.UpdateTicketTypeRequestDto;
import com.omerkoc.tickets.domain.dtos.UpdateTicketTypeResponseDto;
import com.omerkoc.tickets.domain.entities.Event;
import com.omerkoc.tickets.domain.entities.TicketType;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-24T13:44:14+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.45.0.v20260101-2150, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class EventMapperImpl implements EventMapper {

    @Override
    public CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateTicketTypeRequest createTicketTypeRequest = new CreateTicketTypeRequest();

        createTicketTypeRequest.setDescription( dto.getDescription() );
        createTicketTypeRequest.setName( dto.getName() );
        createTicketTypeRequest.setPrice( dto.getPrice() );
        createTicketTypeRequest.setTotalAvailable( dto.getTotalAvailable() );

        return createTicketTypeRequest;
    }

    @Override
    public CreateEventRequest fromDto(CreateEventRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        CreateEventRequest createEventRequest = new CreateEventRequest();

        createEventRequest.setEnd( dto.getEnd() );
        createEventRequest.setName( dto.getName() );
        createEventRequest.setSalesEnd( dto.getSalesEnd() );
        createEventRequest.setSalesStart( dto.getSalesStart() );
        createEventRequest.setStart( dto.getStart() );
        createEventRequest.setStatus( dto.getStatus() );
        createEventRequest.setTicketTypes( createTicketTypeRequestDtoListToCreateTicketTypeRequestList( dto.getTicketTypes() ) );
        createEventRequest.setVenue( dto.getVenue() );

        return createEventRequest;
    }

    @Override
    public CreateEventResponseDto toDto(Event event) {
        if ( event == null ) {
            return null;
        }

        CreateEventResponseDto createEventResponseDto = new CreateEventResponseDto();

        createEventResponseDto.setCreatedAt( event.getCreatedAt() );
        createEventResponseDto.setEnd( event.getEnd() );
        createEventResponseDto.setId( event.getId() );
        createEventResponseDto.setName( event.getName() );
        createEventResponseDto.setSalesEnd( event.getSalesEnd() );
        createEventResponseDto.setSalesStart( event.getSalesStart() );
        createEventResponseDto.setStart( event.getStart() );
        createEventResponseDto.setStatus( event.getStatus() );
        createEventResponseDto.setTicketTypes( ticketTypeListToCreateTicketTypeRequestDtoList( event.getTicketTypes() ) );
        createEventResponseDto.setUpdatedAt( event.getUpdatedAt() );
        createEventResponseDto.setVenue( event.getVenue() );

        return createEventResponseDto;
    }

    @Override
    public ListEventTicketTypesResponseDto toDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        ListEventTicketTypesResponseDto listEventTicketTypesResponseDto = new ListEventTicketTypesResponseDto();

        listEventTicketTypesResponseDto.setDescription( ticketType.getDescription() );
        listEventTicketTypesResponseDto.setId( ticketType.getId() );
        listEventTicketTypesResponseDto.setName( ticketType.getName() );
        listEventTicketTypesResponseDto.setPrice( ticketType.getPrice() );
        listEventTicketTypesResponseDto.setTotalAvailable( ticketType.getTotalAvailable() );

        return listEventTicketTypesResponseDto;
    }

    @Override
    public ListEventResponseDto toListEventResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        ListEventResponseDto listEventResponseDto = new ListEventResponseDto();

        listEventResponseDto.setEnd( event.getEnd() );
        listEventResponseDto.setId( event.getId() );
        listEventResponseDto.setName( event.getName() );
        listEventResponseDto.setSalesEnd( event.getSalesEnd() );
        listEventResponseDto.setSalesStart( event.getSalesStart() );
        listEventResponseDto.setStart( event.getStart() );
        listEventResponseDto.setStatus( event.getStatus() );
        listEventResponseDto.setTicketTypes( ticketTypeListToListEventTicketTypesResponseDtoList( event.getTicketTypes() ) );
        listEventResponseDto.setVenue( event.getVenue() );

        return listEventResponseDto;
    }

    @Override
    public GetEventDetailsTicketTypesResponseDto togEventTicketTypesResponseDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        GetEventDetailsTicketTypesResponseDto getEventDetailsTicketTypesResponseDto = new GetEventDetailsTicketTypesResponseDto();

        getEventDetailsTicketTypesResponseDto.setCreatedAt( ticketType.getCreatedAt() );
        getEventDetailsTicketTypesResponseDto.setDescription( ticketType.getDescription() );
        getEventDetailsTicketTypesResponseDto.setId( ticketType.getId() );
        getEventDetailsTicketTypesResponseDto.setName( ticketType.getName() );
        getEventDetailsTicketTypesResponseDto.setPrice( ticketType.getPrice() );
        getEventDetailsTicketTypesResponseDto.setTotalAvailable( ticketType.getTotalAvailable() );
        getEventDetailsTicketTypesResponseDto.setUpdatedAt( ticketType.getUpdatedAt() );

        return getEventDetailsTicketTypesResponseDto;
    }

    @Override
    public GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        GetEventDetailsResponseDto getEventDetailsResponseDto = new GetEventDetailsResponseDto();

        getEventDetailsResponseDto.setCreatedAt( event.getCreatedAt() );
        getEventDetailsResponseDto.setEnd( event.getEnd() );
        getEventDetailsResponseDto.setId( event.getId() );
        getEventDetailsResponseDto.setName( event.getName() );
        getEventDetailsResponseDto.setSalesEnd( event.getSalesEnd() );
        getEventDetailsResponseDto.setSalesStart( event.getSalesStart() );
        getEventDetailsResponseDto.setStart( event.getStart() );
        getEventDetailsResponseDto.setStatus( event.getStatus() );
        getEventDetailsResponseDto.setTicketTypes( ticketTypeListToGetEventDetailsTicketTypesResponseDtoList( event.getTicketTypes() ) );
        getEventDetailsResponseDto.setUpdatedAt( event.getUpdatedAt() );
        getEventDetailsResponseDto.setVenue( event.getVenue() );

        return getEventDetailsResponseDto;
    }

    @Override
    public UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UpdateTicketTypeRequest updateTicketTypeRequest = new UpdateTicketTypeRequest();

        updateTicketTypeRequest.setDescription( dto.getDescription() );
        updateTicketTypeRequest.setId( dto.getId() );
        updateTicketTypeRequest.setName( dto.getName() );
        updateTicketTypeRequest.setPrice( dto.getPrice() );
        updateTicketTypeRequest.setTotalAvailable( dto.getTotalAvailable() );

        return updateTicketTypeRequest;
    }

    @Override
    public UpdateEventRequest fromDto(UpdateEventRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UpdateEventRequest updateEventRequest = new UpdateEventRequest();

        updateEventRequest.setEnd( dto.getEnd() );
        updateEventRequest.setId( dto.getId() );
        updateEventRequest.setName( dto.getName() );
        updateEventRequest.setSalesEnd( dto.getSalesEnd() );
        updateEventRequest.setSalesStart( dto.getSalesStart() );
        updateEventRequest.setStart( dto.getStart() );
        updateEventRequest.setStatus( dto.getStatus() );
        updateEventRequest.setTicketTypes( updateTicketTypeRequestDtoListToUpdateTicketTypeRequestList( dto.getTicketTypes() ) );
        updateEventRequest.setVenue( dto.getVenue() );

        return updateEventRequest;
    }

    @Override
    public UpdateTicketTypeResponseDto toUpdateTicketTypeResponseDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        UpdateTicketTypeResponseDto updateTicketTypeResponseDto = new UpdateTicketTypeResponseDto();

        updateTicketTypeResponseDto.setCreatedAt( ticketType.getCreatedAt() );
        updateTicketTypeResponseDto.setDescription( ticketType.getDescription() );
        updateTicketTypeResponseDto.setId( ticketType.getId() );
        updateTicketTypeResponseDto.setName( ticketType.getName() );
        updateTicketTypeResponseDto.setPrice( ticketType.getPrice() );
        updateTicketTypeResponseDto.setTotalAvailable( ticketType.getTotalAvailable() );
        updateTicketTypeResponseDto.setUpdatedAt( ticketType.getUpdatedAt() );

        return updateTicketTypeResponseDto;
    }

    @Override
    public UpdateEventResponseDto toUpdateEventResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        UpdateEventResponseDto updateEventResponseDto = new UpdateEventResponseDto();

        updateEventResponseDto.setCreatedAt( event.getCreatedAt() );
        updateEventResponseDto.setEnd( event.getEnd() );
        updateEventResponseDto.setId( event.getId() );
        updateEventResponseDto.setName( event.getName() );
        updateEventResponseDto.setSalesEnd( event.getSalesEnd() );
        updateEventResponseDto.setSalesStart( event.getSalesStart() );
        updateEventResponseDto.setStart( event.getStart() );
        updateEventResponseDto.setStatus( event.getStatus() );
        updateEventResponseDto.setTicketTypes( ticketTypeListToUpdateTicketTypeResponseDtoList( event.getTicketTypes() ) );
        updateEventResponseDto.setUpdatedAt( event.getUpdatedAt() );
        updateEventResponseDto.setVenue( event.getVenue() );

        return updateEventResponseDto;
    }

    @Override
    public ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        ListPublishedEventResponseDto listPublishedEventResponseDto = new ListPublishedEventResponseDto();

        listPublishedEventResponseDto.setEnd( event.getEnd() );
        listPublishedEventResponseDto.setId( event.getId() );
        listPublishedEventResponseDto.setName( event.getName() );
        listPublishedEventResponseDto.setStart( event.getStart() );
        listPublishedEventResponseDto.setVenue( event.getVenue() );

        return listPublishedEventResponseDto;
    }

    @Override
    public GetPublishedEventDetailsTicketTypesResponseDto toGetPublishedEventDetailsTicketTypesResponseDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        GetPublishedEventDetailsTicketTypesResponseDto getPublishedEventDetailsTicketTypesResponseDto = new GetPublishedEventDetailsTicketTypesResponseDto();

        getPublishedEventDetailsTicketTypesResponseDto.setDescription( ticketType.getDescription() );
        getPublishedEventDetailsTicketTypesResponseDto.setId( ticketType.getId() );
        getPublishedEventDetailsTicketTypesResponseDto.setName( ticketType.getName() );
        getPublishedEventDetailsTicketTypesResponseDto.setPrice( ticketType.getPrice() );

        return getPublishedEventDetailsTicketTypesResponseDto;
    }

    @Override
    public GetPublishedEventDetailsResponseDto toGetPublishedEventDetailsResponseDto(Event event) {
        if ( event == null ) {
            return null;
        }

        GetPublishedEventDetailsResponseDto getPublishedEventDetailsResponseDto = new GetPublishedEventDetailsResponseDto();

        getPublishedEventDetailsResponseDto.setEnd( event.getEnd() );
        getPublishedEventDetailsResponseDto.setId( event.getId() );
        getPublishedEventDetailsResponseDto.setName( event.getName() );
        getPublishedEventDetailsResponseDto.setStart( event.getStart() );
        getPublishedEventDetailsResponseDto.setTicketTypes( ticketTypeListToGetPublishedEventDetailsTicketTypesResponseDtoList( event.getTicketTypes() ) );
        getPublishedEventDetailsResponseDto.setVenue( event.getVenue() );

        return getPublishedEventDetailsResponseDto;
    }

    protected List<CreateTicketTypeRequest> createTicketTypeRequestDtoListToCreateTicketTypeRequestList(List<CreateTicketTypeRequestDto> list) {
        if ( list == null ) {
            return null;
        }

        List<CreateTicketTypeRequest> list1 = new ArrayList<CreateTicketTypeRequest>( list.size() );
        for ( CreateTicketTypeRequestDto createTicketTypeRequestDto : list ) {
            list1.add( fromDto( createTicketTypeRequestDto ) );
        }

        return list1;
    }

    protected CreateTicketTypeRequestDto ticketTypeToCreateTicketTypeRequestDto(TicketType ticketType) {
        if ( ticketType == null ) {
            return null;
        }

        CreateTicketTypeRequestDto createTicketTypeRequestDto = new CreateTicketTypeRequestDto();

        createTicketTypeRequestDto.setDescription( ticketType.getDescription() );
        createTicketTypeRequestDto.setName( ticketType.getName() );
        createTicketTypeRequestDto.setPrice( ticketType.getPrice() );
        createTicketTypeRequestDto.setTotalAvailable( ticketType.getTotalAvailable() );

        return createTicketTypeRequestDto;
    }

    protected List<CreateTicketTypeRequestDto> ticketTypeListToCreateTicketTypeRequestDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<CreateTicketTypeRequestDto> list1 = new ArrayList<CreateTicketTypeRequestDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( ticketTypeToCreateTicketTypeRequestDto( ticketType ) );
        }

        return list1;
    }

    protected List<ListEventTicketTypesResponseDto> ticketTypeListToListEventTicketTypesResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<ListEventTicketTypesResponseDto> list1 = new ArrayList<ListEventTicketTypesResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( toDto( ticketType ) );
        }

        return list1;
    }

    protected List<GetEventDetailsTicketTypesResponseDto> ticketTypeListToGetEventDetailsTicketTypesResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<GetEventDetailsTicketTypesResponseDto> list1 = new ArrayList<GetEventDetailsTicketTypesResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( togEventTicketTypesResponseDto( ticketType ) );
        }

        return list1;
    }

    protected List<UpdateTicketTypeRequest> updateTicketTypeRequestDtoListToUpdateTicketTypeRequestList(List<UpdateTicketTypeRequestDto> list) {
        if ( list == null ) {
            return null;
        }

        List<UpdateTicketTypeRequest> list1 = new ArrayList<UpdateTicketTypeRequest>( list.size() );
        for ( UpdateTicketTypeRequestDto updateTicketTypeRequestDto : list ) {
            list1.add( fromDto( updateTicketTypeRequestDto ) );
        }

        return list1;
    }

    protected List<UpdateTicketTypeResponseDto> ticketTypeListToUpdateTicketTypeResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<UpdateTicketTypeResponseDto> list1 = new ArrayList<UpdateTicketTypeResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( toUpdateTicketTypeResponseDto( ticketType ) );
        }

        return list1;
    }

    protected List<GetPublishedEventDetailsTicketTypesResponseDto> ticketTypeListToGetPublishedEventDetailsTicketTypesResponseDtoList(List<TicketType> list) {
        if ( list == null ) {
            return null;
        }

        List<GetPublishedEventDetailsTicketTypesResponseDto> list1 = new ArrayList<GetPublishedEventDetailsTicketTypesResponseDto>( list.size() );
        for ( TicketType ticketType : list ) {
            list1.add( toGetPublishedEventDetailsTicketTypesResponseDto( ticketType ) );
        }

        return list1;
    }
}
