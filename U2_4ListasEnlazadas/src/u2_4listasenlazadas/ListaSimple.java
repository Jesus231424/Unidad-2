
package u2_4listasenlazadas;


public class ListaSimple {
    
    private Nodo inicio;
    private Nodo fin;
    int cont = 0;
    
    
    public ListaSimple(){
        inicio = null;
        fin = null;
    }
    
    
    public void agregar(int Valor){
        cont++;
        Nodo nuevo = new Nodo(Valor);
        
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            fin.setSig(nuevo);
            fin = nuevo;
        }
    }
    
    public void imprimir(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSig();
        }
        System.out.println("");
    }
    
    public int length(){
        System.out.println("Números nodos = " + "[" + cont + "]");
        return cont;
    }
    
    public boolean listaVacia(){
        boolean resu = true;
        if (inicio != null){
            resu = false;
        }
        return resu;
    }
    
    public Nodo vaciarLista(){
        inicio = null;
        fin = null;
        return null;
    }
    
    public void agregarEn(int valor, int posi) throws Exception{
        int noNodo = length();
        Nodo nuevo = new Nodo(valor);
        if((posi >= 0)&&(posi < noNodo)){
            if(posi == 0){
                nuevo.setSig(inicio);
                inicio = nuevo;
            }
        }else{
            Nodo temp = inicio;
            int cont = 0;
            while(cont < (posi - 1)){
                temp = temp.getSig();
                cont++;
            }
            
            nuevo.setSig(temp);
            temp.setSig(nuevo);
            
            throw new Exception (posi + " No es una posicion valida");
        }
    }
    
    public void borrarEn(int posi) throws Exception{
        int noNodo = length();
        
        if((posi >= 0)&&(posi < noNodo)){
            if(noNodo == 1){
                vaciarLista();
            }else if(posi == 0){
                inicio = inicio.getSig();
                cont--;
            }else{
            //Uh?
        }
        Nodo temp = inicio;
        int cont = 0;
        while(cont < (posi - 1)){
            temp = temp.getSig();
            cont++;
            Nodo sig = temp.getSig();
            temp.setSig(sig.getSig());
            if(temp.getSig() == null){
                fin = temp;
            }
        }
        Nodo nuevo = new Nodo(posi);
        }else{
        throw new Exception (posi + " No es una posicion valida");
        }
    }
    
    public int buscarVal(int valor){
        int posi = 0;
        int cont = 0;
        
        Nodo temp = inicio;
        while(temp != null){
            if(temp.getValor() == valor){
                posi = cont;
                break;
            }
            temp = temp.getSig();
        }
        return posi;
    }
    
    public int leerValor(int posi) throws Exception{
        int noNodo = length();
        
        if((posi >= 0)&&(posi < noNodo)){
            Nodo temp = inicio;
            int cont = 0;
            while(cont < posi){
                temp = temp.getSig();
                cont++;
            }
            return temp.getValor();
        }else{
            throw new Exception (posi + ": No hay valor en esa posición");
        }
    }
    
    public void imprimirInv(){
        Nodo temp = inicio;
        String valores = "";
        
        while(temp != null){
            String val = "[" + temp.getValor() + "]";
            valores = val + valores;
            temp = temp.getSig();
        }
        System.out.println(valores);
    }
}
