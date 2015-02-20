public class Test {

    public static void main(String[] args) {
        Agenda ag1 = new Agenda(8);
        
        ag1.añadir("Popeye", 78912);
        ag1.añadir("Oscar", 12345);
        ag1.añadir("Jose", 65432);
        ag1.añadir("Maria", 78945);
        //ag1.añadir("Jesus", 46512);
        
        
        System.out.println(ag1.getTelefono("Popeye"));
        System.out.println(ag1.getNombre(12345));
    }
    
}
