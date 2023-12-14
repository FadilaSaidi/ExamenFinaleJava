import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient{
    private List<Patient> listP;

    public List<Patient> getListP() {
        return listP;
    }

    public ListPatients(){

        /*à completer*/ //(4) (0.5 point)
    }
    public void ajouterPatient(Patient p) {
        /*à completer*/ //(5) (0.5 point)
        listP.add(p);
    }


    public void supprimerPatient(Patient p) {
        /*à completer*/ //(6) (0.5 point)
        listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().anyMatch(patient -> patient.equals(p)); //(7) (0.5 point)
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);

    }
        public void afficherPatients() {
            listP.stream().forEach(System.out::println);
            /*à completer*/ //(9) (1 point)
        }
        /* Avec l’api Stream */
        public void trierPatientsParNom () {
            listP.sort((p1, p2) -> p1.getNom().compareTo(p2.getNom()));
        }

        public void PatientSansRedondance() {
            /*à completer : Afficher la liste des patients sans redondance*/
            List<Patient> distinctPatients = listP.stream().distinct().collect(Collectors.toList());
            distinctPatients.forEach(System.out::println);
        }
    }





