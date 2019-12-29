package alexdiaz.springframework.sfgpetclinic.services;

import alexdiaz.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}