package com.vikkyraki.prac_aws_deployment.repository;

import com.vikkyraki.prac_aws_deployment.model.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
    public List<Guest> findByLastNameAndAddress(String lastName, String address);

    public List<Guest> findDistinctByLastName (String firstName);
}
