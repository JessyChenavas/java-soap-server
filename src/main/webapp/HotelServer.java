package main.webapp;

import main.webapp.entity.Room;
import main.webapp.services.HotelService;

import javax.xml.ws.Endpoint;
import java.util.Date;

public class HotelServer {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        Room room = new Room(1, 140, new Date());

        hotelService.getRooms().add(room);
        hotelService.getRooms().add(new Room(2, 120, new Date()));
        hotelService.getRooms().add(new Room(3, 160, new Date()));
        Endpoint.publish("http://localhost:8080/", hotelService);
    }
}
