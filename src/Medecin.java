import java.util.Objects;

public class Medecin {
        private int cin;
        private String nom;
        private String prenom;
        private int numOrdre;
        public Medecin(int cin, String nom, String prenom, int numOrdre) {
            this.cin = cin;
            this.nom = nom;
            this.prenom = prenom;
            this.numOrdre = numOrdre;
        }
        public int getCin() {
            return cin;
        }
        public void setCin(int cin) {
            this.cin = cin;
        }
        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public int getNumOrdre() {
            return numOrdre;
        }

        @Override
        public String toString() {
            return "Medecin{" +
                    "cin=" + cin +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", numOrdre=" + numOrdre +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Medecin medecin = (Medecin) o;
            return cin == medecin.cin && numOrdre == medecin.numOrdre;
        }

        @Override
        public int hashCode() {
            return Objects.hash(cin, numOrdre);
        }
}
