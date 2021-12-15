

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class test
{
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;
    private ClaseDam claseDam1;

    /**
     * Default constructor for test class test
     */
    public test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        alumno1 = new Alumno("Adrian", "0001", 21);
        alumno2 = new Alumno("Sabina", "0002", 26);
        alumno3 = new Alumno("treceño", "0003", 20);
        alumno4 = new Alumno("Aaron perez", "0004", 19);
        alumno5 = new Alumno("Andrea", "0005", 20);
        claseDam1 = new ClaseDam(30);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
        claseDam1.imprimeDetalles();
        claseDam1.imprimirListaNumeradaDeAlumnos();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
