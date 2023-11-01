import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Course implements CourseOperations {
    String nume;///atribute pt a stoca inf despre studenti
    String descriere;
    Professor profu;
    Set<Student> studenti=new HashSet<>();

    public Course(String pclp, String oop) {
    }

    public Course(String pclp, String oop, Professor prof, Student[] studenti) {
    }

    @Override
    public boolean equals(Object o) {///functie pt afisare
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course curs = (Course) o;
        return nume.equals(curs.nume) && descriere.equals(curs.descriere) && profu.equals(curs.profu) && studenti.equals(curs.studenti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, descriere, profu, studenti);
    }

    @Override
    public void RemoveStudent(Student student) {///fct pt a verifica daca studentul apartine cursului
        if(!this.studenti.remove(student))
        {
            System.out.println("Stundentul nu aparatine");
        }
    }

    @Override
    public void UpdateStudent(Student student, Student news) {

        if(this.studenti.remove(student))
        {
            this.studenti.add(new Student());

        }

    }

    @Override
    public void UpdateCurs(String nume, String descriere) {///fct pt a actualiza datele despre curs
        this.descriere = descriere;
        this.nume = nume;

    }

    public void Course(String nume, String descriere, Professor profu, Student[] studenti) {
        this.nume = nume;
        this.descriere = descriere;
        this.profu = profu;
    }

    public void UpdateProfesor(Professor profu) {
        this.profu = profu;
    }

    public void AddStudent(Student student) {
        this.studenti.add(student);
    }

    @Override
    public String toString() {
        String str = "Curs: " + "nume=" + nume + ", descriere=" + descriere + ",\nprofu=" + profu + ",\nstudenti:\n";
        for (Student s : studenti) {
            str += s + "\n";
        }
        return str;
    }

    public abstract void AfisareNoteStudenti();
}