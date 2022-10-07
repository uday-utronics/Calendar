package com.springBoot.calender.resource;

import com.springBoot.calender.model.Calendar;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class calenderResource {

    Calendar c1 = new Calendar("STORE001", "ALL", "13:30");
    Calendar c2 = new Calendar("STORE002", "SUNDAY", "13:30");
    Calendar c3 = new Calendar("STORE003", "MONDAY", "13:30");
    List<> calendarList = new ArrayList<>();
}
