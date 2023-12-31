package com.hoangtien2k3.ticketbookingapi.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseSeatEmpty {
    @Column(name = "seat_id")
    private int seatId;
    @Column(name = "seat_type")
    private String seatType;
    @Column(name = "seat_row")
    private String seatRow;
    @Column(name = "seat_number")
    private int seatNumber;
    @Column(name = "seat_status")
    private String seatStatus;
}
