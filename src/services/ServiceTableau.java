package services;

import models.Etudiant;
import models.Pavillon;
import models.Chambre;

public class ServiceTableau implements IService {

    public final int NOMBRE = 10;

    private Chambre chambres[] = new Chambre[NOMBRE];
    private int indexChambre = 0;

    @Override
    public void ajouterEtudiant(Etudiant etudiant) {

    }

    /* @Override
    public void ajouterPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    } */

    @Override
    public int getPositionPavillon(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    /* @Override
    public void supprimerPavillon(int id) {
        // TODO Auto-generated method stub

    } */

    private final int TAILLE = 10;
    private Pavillon[] pavillons = new Pavillon[TAILLE];
    private int indexPavillon;

    @Override
    public void ajouterPavillon(Pavillon pavillon) {
        if (indexPavillon < TAILLE) {
            pavillons[indexPavillon] = pavillon;
            indexPavillon++;
        } else {
            System.out.println("le tableau est plein");
        }

    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) {
            if (p != null) {
                System.out.println(p);
            }
        }

    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void ajouterChambre(Chambre chambre) {

        if (indexChambre < NOMBRE) {
            chambres[indexChambre] = chambre;
            indexChambre++;
        } else {
            System.out.println("Le tableau est rempli");
        }

    }

    @Override
    public void listerChambre() {

        for (Chambre chambre : chambres) {
            if (chambre != null) {
                System.out.println(chambre);
            }
        }

    }

}
