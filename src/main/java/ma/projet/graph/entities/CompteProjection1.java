package ma.projet.graph.entities;

import ma.projet.graph.entities.Compte;
import ma.projet.graph.entities.TypeCompte;

@Projection(name = "solde", types = {Compte.class})
public interface CompteProjection1 {
    double getSolde();
}