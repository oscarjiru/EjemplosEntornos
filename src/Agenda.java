public class Agenda {

    String[] nombres;
    int[] telefonos;
    int siguiente = 0;

    public Agenda(int tam) {
        nombres = new String[tam];
        telefonos = new int[tam];
    }

    public boolean añadir(String nom, int tlf) {
        if (siguiente >= nombres.length || siguiente >= telefonos.length) {
            return false;
        } else {
            nombres[siguiente] = nom;
            telefonos[siguiente] = tlf;
            siguiente++;

            return true;
        }

    }

    private int buscar(String nom) {
        for (int i = 0; i < nombres.length; i++) {
            if (nom.equals(nombres[i])) {
                return i;
            }
        }
        return -1;
    }

    private int buscar(int tlf) {
        for (int i = 0; i < telefonos.length; i++) {
            if (tlf == telefonos[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getTelefono(String nom) {
        return telefonos[buscar(nom)];
    }

    public String getNombre(int tlf) {
        return nombres[buscar(tlf)];
    }
}
