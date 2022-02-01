public class Main {

    public static void main(String[] args) {

        Montres m = new Montres(4, 54);
        personnes p = new personnes("paul");
        p.porter(m);
        System.out.println("je suis:" + p.getNom());
        p.affiche().Heure();
        p.affiche().Min();
        m.avance();
        p.affiche().Heure();
        p.affiche().Min();
        p.retirer();
        Montres montre_max = new Montres(12, 30);
        personnes max = new personnes("max");
        max.porter(montre_max);
        p.demander(max);
    }
}