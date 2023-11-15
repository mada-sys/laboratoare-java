public interface CourseManagerOP {
    public void AddCurs(Course curs);///fct pt adaugare curs

    public void UpdateCurs(Course curs);///fct pt a actualiza datele cursului

    public void DeleteCurs();///fct pt stergere curs

    public void MediaNotelorStudentilorLaCurs();///fct pt media studentilor

    void ProfuNoteazaStudent(Student student);///fct pt notele studentilor
}
