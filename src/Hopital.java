import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class Hopital {
    public Map<Medecin,ListPatients> medecinPatiens;
    public Hopital(){
       medecinPatiens = new TreeMap<>();
    }
    public void ajouterMedecin(Medecin m){
      medecinPatiens.put(m,new ListPatients());
    }
    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){
          medecinPatiens.get(m).ajouterPatient(p);
        }else {
            ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(p);
        medecinPatiens.put(m,listPatients);}
    }
    /*Avec l'api stream */
    public void afficherMap(){
       medecinPatiens.forEach((medecin,patients) ->{
           System.out.println("Médecin:"+medecin);
           patients.afficherPatients();
       });
    }
    /* Afficher les patients d’un medecin dont le nom est "mohamed" */
    public void afficherMedcinPatients (Medecin m){
        medecinPatiens.entrySet().stream()
                .filter(entry -> entry.getKey().equals(m))
                .forEach(entry -> {
                    System.out.println("Médecin: " + entry.getKey());
                    entry.getValue().afficherPatients();
                });
    }
    /* Retourner les noms des patients dont le " numSecuriteSociale = 1" */
    public List<String> RetournerNomPatients (){
        return medecinPatiens.values().stream()
                .flatMap(listPatients -> listPatients.getListP().stream())
                .filter(patient -> patient.getNumSecuriteSociale() == 1)
                .map(Patient::getNom)
                .collect(Collectors.toList());

    }
}
