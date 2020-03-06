import java.util.Scanner;

public class GraphRepresentation {

    public static vertex[] vertices = new vertex[1000];
    public static int vNum = 0, eNum = 0;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String v1 = "", v2 = "";
        System.out.println("Enter number of vertices: ");
        vNum = sc.nextInt();
        System.out.println("Enter number of edges: ");
        eNum = sc.nextInt();
        for (int i = 0; i < vNum; i++) {
            System.out.println("Enter vertex name: ");
            v1 = sc.next();
            vertices[i] = new vertex(i, v1);
        }
        for (int i = 0; i < eNum; i++) {
            System.out.println("Enter source node: ");            
            v1 = sc.next();
            int index1 = getVertexIndex(v1);
            System.out.println("Enter distination node: ");
            v2 = sc.next();
            int index2 = getVertexIndex(v2); 
            if(index1 == -1 || index2 == -1)
                break;
            setEdge(index1, index2);   
        }
    }
    public static int getVertexIndex(String name){
        for(int i = 0; i < vNum; ++i){
            String n = vertices[i].getName();
            if(n.equals(name))
                return vertices[i].ID;
        }
        return -1;
    }
    public static void setEdge(int v1, int v2){
        vertex v = vertices[v1];
        v.edges[v2] += 1; 
    }


}

class vertex{
    int ID;
    String name;
    int[] edges = new int[1000]; 
    vertex(){}
    vertex(int x, String n) {
        ID = x;
        name = n;
    }
    public int getID(){return ID;} 
    public String getName(){return name;} 
}