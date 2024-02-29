package com.iesam.features.pets.data;

import com.iesam.features.pets.domain.Pet;
import com.iesam.features.pets.domain.PetRepository;

import java.util.ArrayList;

public class PetDataRepository implements PetRepository {

    //Linea para el patron singleton
    private static PetDataRepository instance= null;

    //De donde va a sacar los datos la capa de datos
    private ArrayList<Pet> localPets = new ArrayList<>();

    //Metodos de la interfaz

    @Override
    public ArrayList<Pet> obtainPets() {
        return localPets;
    }

    @Override
    public Pet obtainPet(String petId) {
        for(Pet pet : localPets){
            if(pet.getId().equals(petId)){
                return pet;
            }
        }
        return null;
    }

    @Override
    public void deletePet(String petId) {
        for(int i=0; i< localPets.size();i++){
            if(localPets.get(i).getId().equals(petId)){
                localPets.remove(i);
            }
        }
    }

    @Override
    public void savePet(Pet pet) {
        localPets.add(pet);

    }

    @Override
    public void updatePet(Pet pet) {
        deletePet(pet.getId());
        savePet(pet);
    }

    //Patrón singleton
    public static PetDataRepository newInstance(){
        if(instance==null){
            instance = new PetDataRepository();
        }
        return instance;
    }

}
