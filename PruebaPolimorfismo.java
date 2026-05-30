public class PruebaPolimorfismo {
    public static void main(String[] args) {
        // Usando polimorfismo: el tipo de la variable es la clase base (Persona)
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();
        Persona p3 = new Profesor();

        // Se invoca el mismo método, pero cada objeto responde a su manera
        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}