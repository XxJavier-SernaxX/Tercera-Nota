package Unidad01.Actividad05.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 8.5);
        Student student2 = new Student("Jane", 9.0);
        Student student3 = new Student("Jim", 7.5);

        // Estructura de control para evaluar calificaciones
        Student[] students = {student1, student2, student3};
        
        for (Student student : students) {
            System.out.print(student.name + " (" + student.grade + "): ");
            
            if (student.grade >= 9.0) {
                System.out.println("Excelente - Sobresaliente");
            } else if (student.grade >= 8.0) {
                System.out.println("Muy Bueno - Buen rendimiento");
            } else if (student.grade >= 7.0) {
                System.out.println("Bueno - Rendimiento aceptable");
            } else if (student.grade >= 6.0) {
                System.out.println("Regular - Necesita mejorar");
            } else {
                System.out.println("Reprobado - Requiere atención");
            }
        }
        
        // Estructura de control para encontrar el mejor estudiante
        Student bestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].grade > bestStudent.grade) {
                bestStudent = students[i];
            }
        }
        
        System.out.println("\nEl mejor estudiante es: " + bestStudent.name + 
                          " con una calificación de " + bestStudent.grade);


    }
}
