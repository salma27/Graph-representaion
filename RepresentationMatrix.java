public class RepresentationMatrix {
    private int representionMatrix [][];
    
    private int getIndexOf( String [] vertices ,String vertex  )
    {
        
        for (int i=0 ; i<vertices.length ; i++)
        {
            if (vertices[i].equals(vertex))
                return i;
        }
        return -1;
    }
    RepresentationMatrix(String [] vertices, Edges [] edges )
    {
        representionMatrix = new int [vertices.length][vertices.length];
 
        for (int i=0 ; i<edges.length ; i++)
        {
            representionMatrix[getIndexOf(vertices,edges[i].left)][getIndexOf(vertices,edges[i].right)]++;
        }
    }
    public void printTheMatrix(String [] vertices)
    {
        System.out.println("The Representation Matrix");
        
        for(int i=0 ;i<vertices.length ; i++)
              System.out.print("    "+vertices[i]);
        
        System.out.println();
        for(int i=0 ;i<vertices.length ; i++)
        {
            System.out.print(vertices[i]+ "  ");
            for(int j=0 ;j<vertices.length ; j++)
            {
                System.out.print(representionMatrix[i][j]+ "     ");
            }
            System.out.println();
        }
    }
}
