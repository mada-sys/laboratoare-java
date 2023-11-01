public class Classes {

    public static void main(String[] args) {

        // definire studenti
        Student[] studenti = new Student[] { new Student("Andrei", "Negoita", 2231),
                new Student("Ion", "Mateescu", 4221),
                new Student("Maria", "Popescu", 4221)///se stocheaza toate elementele de tip student intr-o lista

        };
        // definire profesor
        Professor prof = new Professor("Anton", "Panaitescu", studenti);
        // definire curs nou
        Course curs = new Course("Material Resistance","Calculation of reactions,\n"+"effort diagrams, calculations od geometric characteristics of \n"
                +"flat surfaces and calculations of resistance elements to simple  stresses\n",
                prof, studenti) {
            @Override
            public void UpdateStudent(Student student) {

            }

            @Override
            public void AfisareNote() {

            }

            @Override
            public void AfiseazaCursuriLaConsola() {

            }

            @Override
            public void ProfuNoteazaStudent(Student student) {

            }

            @Override
            public void AfisareNoteStudenti() {

            }
        };
        studenti(new Student("Ana","Petre",2));///se adauga un student nou
        Course curs1= new Course("PCLP", "OOP") {///se adauga un curs nou
            @Override
            public void UpdateStudent(Student student) {

            }

            @Override
            public void AfisareNote() {

            }

            @Override
            public void AfiseazaCursuriLaConsola() {

            }

            @Override
            public void ProfuNoteazaStudent(Student student) {

            }

            @Override
            public void AfisareNoteStudenti() {

            }
        };
        new Professor("Vasile", "Madalina", studenti);
        curs1.RemoveStudent(new Student());

        // adaugare curs in lista de cursuri
        ManagerCursuri cursuri = new ManagerCursuri() {
            @Override
            public void UpdateProfesor(Professor p) {

            }

            @Override
            public void AddStudent(Student student) {

            }

            @Override
            public void RemoveStudent(Student student) {

            }

            @Override
            public void UpdateStudent(Student student) {

            }

            @Override
            public void UpdateStudent(Student student, Student news) {

            }

            @Override
            public void UpdateCurs(String nume, String descriere) {

            }

            @Override
            public void AfisareNote() {

            }
        };
        // curs.UpdateCurs("nume", "descriere");
        cursuri.AddCurs(curs);
        curs.RemoveStudent(new Student("Andrei", "Negoita", 2231));///eliminarea unui student din curs
        curs.UpdateStudent(new Student("Ion", "Mateescu", 4221));///se actualizeaza datele despre un student
        cursuri.UpdateCurs(curs);
        curs.UpdateCurs("Material Resistance", "Bine ati venit, rau ati nimerit");///pt a actualiza descrierea cursului

        cursuri.AfiseazaCursuriLaConsola();///pentru a afisa cursul
    }

    private static void studenti(Student student) {
    }

}



