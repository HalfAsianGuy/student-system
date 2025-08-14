package ru.system.student.database;

import ru.system.student.model.Faculty;
import ru.system.student.model.Passport;
import ru.system.student.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

    public final static Map<Passport, Student> STUDENTS = new HashMap<>();

    public final static List<Faculty> FACULTIES =
            List.of(new Faculty("Математический", "+79163320659", "math@mail.ru"),
                    new Faculty("Физический", "+79161235659", "fiz@mail.ru"),
                    new Faculty("Экономический", "+79161241239", "econom@mail.ru"));
}
