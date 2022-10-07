package com.springBoot.calender.model;

import lombok.*;

import java.time.LocalTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Calendar {
    private String locationID;
    private String Day;
    private LocalTime cutOffTime;


}
