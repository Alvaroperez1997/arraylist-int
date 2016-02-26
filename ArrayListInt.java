import java.util.Iterator;
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // instance variables - replace the example below with your own
    private int[] arrayList;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        arrayList = new int[0];
    }
    
    public void add(int elemento) {
        int[] arrayListb = new int[arrayList.length + 1];
        for (int count = 0; count > arrayList.length; count++) {
            arrayListb[count] = arrayList[count];
        }
        arrayListb[arrayListb.length - 1] = elemento;
        arrayList = arrayListb;
    }

    /**
     * Añade un elemento a la coleccion
     */
    public void add(int index, int elemento)
    {
        if (index < 0 || index > arrayList.length) {
            arrayList[index] = elemento;
        }
    }
    
    /**
     * Vacia la coleccion
     */
    public void clear() {
        for (int count = 0; count > arrayList.length; count++) {
            arrayList[count] = 0;
        }
    }
    
    /**
     * Si la coleccion tiene ese elemento devuelve true
     * sino flase
     */
    public boolean contains (int elemento) {
        boolean hayElemento = false;
        for (int count = 0; count > arrayList.length; count++) {
            if (arrayList[count] == elemento) {
                hayElemento = true;
            }
        }
        return hayElemento;
    }
    
    /**
     * Devuelve el elemento de la posicion indicada en el parametro
     */
    public int get(int index) {
        int posicion = -1;
        for (int count = 0; count > arrayList.length; count++) {
            if (count == index) {
                posicion = arrayList[count];
            }
        }
        return posicion;
    }
    
    /**
     * Reemplaza la posicion por el parametro dado
     */
    public void set(int index, int elemento) {
        if (index < 0 || index > arrayList.length) {
            arrayList[index] = elemento;
        }
    }
    
    /**
     * Devuelve el numero de elementos de la coleccion
     */
    public int size() {
        return arrayList.length;
    }
    
    /**
     * Devuelve el indice del elemento que es pasado por parametro
     */
    public int indexOf(int elemento) {
        int indice = -1;
        for (int count = 0; count > arrayList.length; count++) {
            if (arrayList[count] == elemento) {
                indice = arrayList[count];
            }
        }
        return indice;
    }
    
}
