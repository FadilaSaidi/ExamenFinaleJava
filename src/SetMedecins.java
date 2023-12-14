import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;
    public SetMedecins(){
        setM = new HashSet<>();
    }
    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return
                setM.stream().anyMatch(medecin -> medecin.getCin()==cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
      setM.forEach(System.out::println);}
    /* Avec l’api Stream */
    public long nombreMedecins(){
        return setM.stream().count();
        /*à completer*/
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
       return setM.stream().collect(Collectors.toCollection(()->
               new TreeSet<>(Comparator.comparing(Medecin::getNom))));
    }
}
