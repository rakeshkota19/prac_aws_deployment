package com.vikkyraki.prac_aws_deployment.api;

import com.vikkyraki.prac_aws_deployment.model.Guest;
import com.vikkyraki.prac_aws_deployment.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guests")
public class GuestServiceController {

    @Autowired
    private GuestRepository guestRepository;

    @GetMapping("/")
    public List<Guest> getAllGuests() {
        return (List<Guest>) guestRepository.findAll();
    }

    @GetMapping("/{id}")
    public Guest getGuestById(@PathVariable("id") long guestId) {
        return guestRepository.findById(guestId).get();
    }
}
