
package mx.com.gm.grafos;

public class Grafos {

    private boolean A[][];
    
    public Grafos(int vertices){
        
        A=new boolean[vertices][vertices];      
    }
    
    public void agregarArista(int i, int j){
        
        verificacion(i);
        lopps(i, j); 
        
        A[i][j]=true;
        A[j][i]=true;
    }

    public void eliminarArista(int i, int j){
        
        A[i][j]=false;
        A[j][i]=false;       
    }
    
    public boolean verificarArista(int i , int j){
          
        return A[i][j];
    }
    
    public int tamano(){
        
        
        return A.length;
    }
    
    public int[] verificaVecinos(int i){
        
        int vecinos[]=new int[tamano()];
        
        for(int j=0; j<tamano();i++){
            
            if(A[i][j]==true){
                
                vecinos[j]=j;
            }
        }
        
        return vecinos;
    }
    
      public void verificacion(int i) throws IllegalArgumentException {
        if(i >= A.length)
            
            throw new IllegalArgumentException("El tam no puede ser mayor que el tam del Grafo");
        if(i < 0)
            
            throw new IllegalArgumentException("El vertice no puede ser negativo");
    }
      
     public void lopps(int i, int j) throws IllegalArgumentException {
        if(i==j)
            
            throw new IllegalArgumentException("Mo puede exister loops");
    }


}
