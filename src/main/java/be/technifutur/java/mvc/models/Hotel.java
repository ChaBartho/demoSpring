package be.technifutur.java.mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {

    private int id;
    private int nbEtoile;
    private int nbChambre;
    private String nomReceptionniste;
    private String nom;
    private String adresse;



}
