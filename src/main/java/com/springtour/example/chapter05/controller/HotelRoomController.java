package com.springtour.example.chapter05.controller;

import com.springtour.example.chapter05.domain.HotelRoomType;
import com.springtour.example.chapter05.domain.dto.DeleteResultResponse;
import com.springtour.example.chapter05.domain.dto.HotelRoomResponse;
import com.springtour.example.chapter05.utils.IdGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@RestController
public class HotelRoomController {

    @GetMapping(path = "/hotels/{hotelId}/rooms/{roomNumber}")
    public HotelRoomResponse getHotelRoomByPeriod(
            @PathVariable Long hotelId,
            @PathVariable String roomNumber,
            @RequestParam(value = "fromDate", required = false) @DateTimeFormat(pattern = "yyyyMMdd") LocalDate fromDate,
            @RequestParam(value = "toDate", required = false) @DateTimeFormat(pattern = "yyyyMMdd") LocalDate toDate) {

        Long hotelRoomId = IdGenerator.create();
        BigDecimal originalPrice = new BigDecimal("130.00");

        HotelRoomResponse response = HotelRoomResponse.of(hotelRoomId, roomNumber, HotelRoomType.DOUBLE, originalPrice);
        if (Objects.nonNull(fromDate) && Objects.nonNull(toDate))
            fromDate.datesUntil(toDate.plusDays(1)).forEach(date -> response.reservedAt(date));

        return response;
    }

    @DeleteMapping(path = "/hotels/{hotelId}/rooms/{roomNumber}")
    public DeleteResultResponse deleteHotelRoom(
            @PathVariable Long hotelId,
            @PathVariable String roomNumber) {
        System.out.println("Delete Request. hotelId=" + hotelId + ", roomNumber=" + roomNumber);
        return new DeleteResultResponse(Boolean.TRUE, "success");
    }

}
