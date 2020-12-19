package com.test.spring.app.springapp;

import com.test.spring.app.servicelogging.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private RoomService roomService;

    @Autowired
    public APIController(RoomService roomService) {
        super();
        this.roomService = roomService;
    }

    @GetMapping("/rooms")
    @Timed
    public List<Room> getAllRooms() {
        return this.roomService.getAllRooms();
    }
}
