public interface CourseOperations {///specifica mai multe metode de gestionare a cursului(functii care trebuiesc implementate)
    public void UpdateProfesor(Professor p);///actualiz. date prof

    public void AddStudent(Student student);///adaugare student

    public void RemoveStudent(Student student);///stergere student

    public void UpdateStudent(Student student);///actual. date student

    void UpdateStudent(Student student, Student news);

    public void UpdateCurs(String nume, String descriere);///actualiz. date curs

    public void AfisareNote();///pt a afisa notele

    void AfiseazaCursuriLaConsola();///pt a afisa cursurile

    void ProfuNoteazaStudent(Student student);
}