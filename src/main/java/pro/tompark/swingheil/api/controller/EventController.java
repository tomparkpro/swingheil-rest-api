package pro.tompark.swingheil.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.tompark.swingheil.model.Event;
import pro.tompark.swingheil.service.EventService;

import java.util.List;

@RestController
@RequestMapping("swingheil/v1")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping("/events")
    public List<Event> events() {
        List<Event> events = eventService.getEvents();
        return events;
    }

}