package com.sln.warmup.main;

import com.sln.warmup.collections.PayingGuest;
import com.sln.warmup.collections.SLNHostel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionDemo {
    public static void main(String args[]) {

        SLNHostel slnHostel = new SLNHostel();
        ArrayList<PayingGuest> payingGuests = new ArrayList<PayingGuest>();
        PayingGuest payingGuest = new PayingGuest();
        payingGuest.setName("Kishore");
        payingGuest.setSurName("Mandalapu");
        payingGuest.setPhoneNumber("9701186737");
        PayingGuest payingGuest1 = new PayingGuest();
        payingGuest1.setName("Srividya");
        payingGuest1.setSurName("Dasari");
        payingGuest1.setPhoneNumber("9701186737");
        PayingGuest payingGuest2 = new PayingGuest();
        payingGuest2.setName("Subbarao");
        payingGuest2.setSurName("Dasari");
        payingGuest2.setPhoneNumber("9701186737");

        payingGuests.add(payingGuest);
        payingGuests.add(payingGuest1);
        payingGuests.add(payingGuest2);

        slnHostel.setPayingGUest(payingGuests);

        Optional<PayingGuest> payingGuestOptional = slnHostel.getPayingGUest().stream().findFirst();
        if(payingGuestOptional.isPresent()) {
            System.out.println("Paying guest is present");
            System.out.println("Paying guest count" +slnHostel.getPayingGUest().stream().count());
            slnHostel.getPayingGUest().stream().forEach( guest ->
                    System.out.println("guest ## " +guest));
            List<PayingGuest> dasariList = slnHostel.getPayingGUest().stream().
            filter(guest ->
                    guest.getSurName().equals("Dasari")).collect(Collectors.toList());

            dasariList.stream().forEach(obj ->
                    System.out.println("dasari ## " +obj));

        }






    }
}
