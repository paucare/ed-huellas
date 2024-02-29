package com.iesam.features.pets.domain;

public class DeletePetUseCase {
    private PetRepository petRepository;

    public DeletePetUseCase(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public void execute(String petId){
        petRepository.deletePet(petId);
    }
}
