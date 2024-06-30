public class Main {
    public static void main(String[] args) {
        GrafoColoreo grafoColoreo = new GrafoColoreo();
        grafoColoreo.agregarVertice("A");
        grafoColoreo.agregarVertice("B");
        grafoColoreo.agregarVertice("C");
        grafoColoreo.agregarVertice("D");
        grafoColoreo.agregarVertice("E");
        grafoColoreo.agregarVertice("F");
        grafoColoreo.agregarVertice("G");
        grafoColoreo.agregarVertice("H");
        grafoColoreo.agregarVertice("I");
        grafoColoreo.agregarVertice("J");

        grafoColoreo.agregarArista("A", "B");
        grafoColoreo.agregarArista("A", "F");
        grafoColoreo.agregarArista("B", "E");
        grafoColoreo.agregarArista("C", "F");
        grafoColoreo.agregarArista("C", "G");
        grafoColoreo.agregarArista("D", "E");
        grafoColoreo.agregarArista("D", "H");
        grafoColoreo.agregarArista("E", "I");
        grafoColoreo.agregarArista("F", "G");
        grafoColoreo.agregarArista("F", "J");
        grafoColoreo.agregarArista("G", "J");
        grafoColoreo.agregarArista("H", "I");
        grafoColoreo.agregarArista("I", "J");

        ResultadoColoreo welshPowellResultado = WelshPowell.welshPowell(grafoColoreo);
        System.out.println("Welsh-Powell cantidad de colores usados: " + welshPowellResultado.getNumColores());
        System.out.println("Welsh-Powell cantidad de nodos de cada color: " + welshPowellResultado.getContadorColores());
        System.out.println("Welsh-Powell vertices en cada color: " + welshPowellResultado.getVerticesPorColor());

        ResultadoColoreo matulaResultado = Matula.matula(grafoColoreo);
        System.out.println("Matula cantidad de colores usados: " + matulaResultado.getNumColores());
        System.out.println("Matula cantidad de nodos de cada color: " + matulaResultado.getContadorColores());
        System.out.println("Matula vertices en cada color: " + matulaResultado.getVerticesPorColor());
    }
}