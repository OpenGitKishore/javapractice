package com.sln.warmup.collections;

public class Room {
    private int roomNumber;
    private int floor;
    private String roomType;
    private boolean acOrNonAc;

    public Room() {
    }

    public Room(int roomNumber, int floor, String roomType, boolean acOrNonAc) {
        this.roomNumber = roomNumber;
        this.floor = floor;
        this.roomType = roomType;
        this.acOrNonAc = acOrNonAc;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean getAcOrNonAc() {
        return acOrNonAc;
    }

    public void setAcOrNonAc(boolean acOrNonAc) {
        this.acOrNonAc = acOrNonAc;
    }

    @Override
    public String toString() {
        return "{\"Room\":{"
                + "\"roomNumber\":\"" + roomNumber + "\""
                + ", \"floor\":\"" + floor + "\""
                + ", \"roomType\":\"" + roomType + "\""
                + ", \"acOrNonAc\":" + acOrNonAc
                + "}}";
    }
}
