import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphRepresentation {

    public static void main(String[] args) {
        graph g = new graph();
        Scanner sc = new Scanner(System.in);
        String v1 = "", v2 = "";
        System.out.println("Enter number of vertices: ");
        g.vNum = sc.nextInt();
        System.out.println("Enter number of edges: ");
        g.eNum = sc.nextInt();
        for (int i = 0; i < g.vNum; i++) {
            System.out.println("Enter vertex name: ");
            v1 = sc.next();
            g.addVertex(i, v1);
        }
        for (int i = 0; i < g.eNum; i++) {
            System.out.println("Enter source node: ");            
            v1 = sc.next();
            System.out.println("Enter distination node: ");
            v2 = sc.next();
            g.addEdge(v1, v2);   
        }
        sc.close();
    }
    


}

class vertex{
    int ID;
    String name;
    ArrayList<Integer> adj = new ArrayList<Integer>();
    vertex(){}
    vertex(int x, String n) {
        ID = x;
        name = n;
    }
    public int getID(){return ID;} 
    public String getName(){return name;} 
}
class edge{
    int src;
    int dst;
    edge(int s, int d){
        src = s;
        dst = d;
    }
}
class graph{
    public vertex[] vertices = new vertex[1000];
    public int vNum = 0, eNum = 0;
    public int getVertexIndex(String name){
        for(int i = 0; i < vNum; ++i){
            String n = vertices[i].getName();
            if(n.equals(name))
                return vertices[i].ID;
        }
        return -1;
    }
    public void addEdge(String v1, String v2){
        int index1 = getVertexIndex(v1);
        int index2 = getVertexIndex(v2); 
        if(index1 == -1 || index2 == -1)
            return;
        vertex v = vertices[index1];
        v.adj.add(index2); 
    }
    public void addVertex(int ID, String name){
        vertices[ID] = new vertex(ID, name);
    }
    public vertex[] adjList(){
        return vertices;
    }
    public int[][] adjMatrix(){
        int[][] mat = new int[this.vNum][this.vNum]
        return
    }

}