import java.util.Arrays;

public abstract class ManagerCursuri implements CourseManagerOP, CourseOperations {
    Course[] cursuri;

    public ManagerCursuri() {
        cursuri = new Course[0];
    }

    @Override
    public void AddCurs(Course curs) {///se adauga un curs
        int noualungime = cursuri.length + 1;
        Course[] aux = new Course[noualungime];
        int index = 0;
        for (Course c : cursuri) {
            aux[index++] = c;
        }
        // la final adaugam noul curs pe ultimul index
        aux[index] = curs;
        // si realocam lista de curs cu aux;
        this.cursuri = new Course[noualungime];
        System.arraycopy(aux, 0, cursuri, 0, noualungime);
    }

    @Override
    public void AfiseazaCursuriLaConsola() {///pt afisare
        for (Course c : cursuri)
            System.out.println(c);
    }

    @Override
    public void UpdateCurs(Course curs) {///pt a actualiz. date despre un curs

        for (Course c : cursuri) {
            if (c.nume == curs.nume) {
                c.descriere = curs.descriere;
                c.nume = curs.nume;
                c.profu = curs.profu;

            }
        }

    }

    @Override
    public void DeleteCurs() {///pt a sterge curs

        cursuri = Arrays.copyOf(cursuri, cursuri.length-1);

    }

    @Override
    public void MediaNotelorStudentilorLaCurs() {

    }

    @Override
    public void ProfuNoteazaStudent(Student student) {

    }
}