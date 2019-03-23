/**
 * @author: Maria Isabel Ortiz 18176
 * @author: Diego Estrada 18540
 * Main
 */
public class Node<E> {

    private Asociacion<String, String> valor;
    private Node<E> padre;
    private Node<E> izquierda, derecha;

    public Node(String palabraI, String palabraE){

        valor = new Asociacion<>(palabraI, palabraE);
        padre = null;
        izquierda = null;
        derecha = null;

    }
    public Asociacion<String, String> getValor() {
        return valor;
    }

    public Node(){}

    //Retorna la llave del nodo
    public String getKey(){
        return valor.key;
    }
    //Retorna el valor del nodo
    public String getValue(){
        return valor.valor;
    }
    //Funcion que retorna la referencia al padre del nodo
    public Node<E> getPadre() {
        return padre;
    }
    //Retorna referencia al lado izquierdo del nodo
    public Node<E> getIzquierda() {
        return izquierda;
    }
    //Retorna referencia al lado dercho del nodo
    public Node<E> getDerecha() {
        return derecha;
    }

    //Crea una referencia al padre del nodo
    public void setPadre(Node padre) {
        this.padre = padre;
    }

    //Crea ref al lado derecho
    public void setDerecha(Node derecha) {
        this.derecha = derecha;
    }
    //crea ref al lado izquierdo
    public void setIzquierda(Node izquierda) {
        this.izquierda = izquierda;
    }

    //Busca nodo que contenga una palabra especifica
    public String buscar(String palabra) {

        String palabraIngles = this.valor.getKey();
        String palabraEspanol = this.valor.getValue();

        if (palabra.equals(palabraIngles)) {
            return palabraEspanol;

        } else if (palabra.compareTo(palabraIngles) < 0) {

            if (izquierda == null){
                return "*" + palabra + "*";

            }else{
                return izquierda.buscar(palabra);

            }

        } else if(palabra.compareTo(palabraIngles) > 0) {

            if (derecha == null){

                return "*" + palabra + "*";

            } else {

                return derecha.buscar(palabra);

            }
        }
        return "*" + palabra + "*";
    }

}