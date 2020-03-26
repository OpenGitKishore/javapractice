package com.sln.warmup.collections;

import java.util.List;

public class SLNHostel {
    private List<PayingGuest> payingGUest;
    private List<Room> roomList;

    public SLNHostel() {
    }

    public SLNHostel(List<PayingGuest> payingGUest, List<Room> roomList) {
        this.payingGUest = payingGUest;
        this.roomList = roomList;
    }

    public List<PayingGuest> getPayingGUest() {
        return payingGUest;
    }

    public void setPayingGUest(List<PayingGuest> payingGUest) {
        this.payingGUest = payingGUest;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "{\"SLNHostel\":{"
                + "\"payingGUest\":" + payingGUest
                + ", \"roomsList\":" + roomList
                + "}}";
    }
}
