package com.iesam.features.pets.presentation;

import com.iesam.features.pets.data.PetDataRepository;
import com.iesam.features.pets.domain.*;


import java.util.ArrayList;

public class PetPresentation {

    public static void PrintPets() {
        GetPetsUseCase getPetsUseCase = new GetPetsUseCase(PetDataRepository.newInstance());
        ArrayList<Pet> pets = getPetsUseCase.execute();
        //Imprimir cada una de las mascotas
        System.out.println(pets.toString());
    }

    public static void printPet(String petId) {
        GetPetUseCase getPetUseCase = new GetPetUseCase(PetDataRepository.newInstance());
        Pet pet = getPetUseCase.execute(petId);
        System.out.println(pet.toString());
    }

    public static void deletePet(String petId) {
        DeletePetUseCase deletePetUseCase = new DeletePetUseCase(PetDataRepository.newInstance());
        deletePetUseCase.execute(petId);
    }

    public static void createPet(Pet pet) {
        PetDataRepository petDataRepository = PetDataRepository.newInstance();
        SavePetUseCase savePetUseCase = new SavePetUseCase(petDataRepository);
        savePetUseCase.execute(pet);
    }

    public static void updatePet(Pet pet) {
        UpdatePetUseCase updatePetUseCase = new UpdatePetUseCase(PetDataRepository.newInstance());
        updatePetUseCase.execute(pet);
        System.out.println("");

    }
}

