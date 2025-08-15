package Lectures.L01WorkingWithAbstractions.StudentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsList;

    public StudentSystem()
    {
        this.studentsList = new HashMap<>();
    }


    public void parseCommand(String[] command)
    {
        String commandName = command[0];

        String name = command[1];
        if (commandName.equals("Create"))
        {
            int age = Integer.parseInt(command[2]);
            double grade =Double.parseDouble(command[3]);
            studentsList.putIfAbsent(name, new Student(name, age, grade));
        }
        else if (commandName.equals("Show"))
        {
            if (studentsList.containsKey(name))
            {
                Student student = studentsList.get(name);
                String view = String.format("%s is %s years old.",student.getName(),student.getAge());

                if (student.getGrade() >= 5.00)
                {
                    view += " Excellent student.";
                }
                else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50)
                {
                    view += " Average student.";
                }
                else
                {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }
}
