public class Professor extends Person {///clasa derivata

    @Override
    public String toString() {
        return "Profesor{" + "nume=" + nume + ", prenume=" + prenume + '}';
    }

    public Professor(String nume, String prenume, Student[] studenti) {
        // Profesor obj = new Profesor(nume, prenume);
        this.nume = nume;
        this.prenume = prenume;
    }

    public Professor() {

        this.nume = " ";
        this.prenume="";
    }
}