package Repository;

import Entity.Student;
public interface StudentRepository {
    public void save(Student student);

    public Student findById(int id);

    public Student update(Student student);

    public void delete(int id);
}
