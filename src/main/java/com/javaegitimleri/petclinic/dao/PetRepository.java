package com.javaegitimleri.petclinic.dao;

import com.javaegitimleri.petclinic.model.Pet;

import java.util.List;

public interface PetRepository {

    Pet findById(Long id);
    List<Pet> findByOwner(Long ownerId);
    void create(Pet pet);
    Pet update(Pet pet);
    void delete(Long id);
    void deleteByOwnerId(Long ownerId);

}
