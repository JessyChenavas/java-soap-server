package main.webapp.services;

import main.webapp.entity.Room;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class HotelService {
    List<Room> rooms;

    public HotelService() {
        rooms = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return this.rooms;
    }
}
