package services;

import models.Pavillon;
import models.Etudiant;
import models.Chambre;
public interface IService {

    public void ajouterPavillon(Pavillon pavillon);
    public void ajouterEtudiant(Etudiant etudiant);
    public void ajouterChambre(Chambre Chambre);
    // public void supprimerPavillon(int id);
    public int getPositionPavillon(int id);
    public void listerChambre();
    public void supprimerPavillon(Pavillon pavillon);
    public void listerPavillon();
    public void listerChambreDunPavillon(Pavillon pavillon);

}
