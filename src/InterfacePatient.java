public interface InterfacePatient {
    public void ajouterPatient(Patient p);
    public void supprimerPatient(Patient p);
    public boolean rechercherPatient(Patient p);
    public boolean rechercherPatient(int cin);
    public void afficherPatients();
    public void trierPatientsParNom();
}