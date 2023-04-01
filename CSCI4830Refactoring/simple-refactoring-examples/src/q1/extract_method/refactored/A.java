package q1.extract_method.refactored;

import java.util.List;

public class A {
   //Given that the implementation of Nodes and Edges was identical,
   // all functionality of both classes has been merged under "GraphObject"
   // though the "Node" and "Edge" classes and methods have been preserved.
   GraphObject m0(List<GraphObject> gobjlist, String p){
      printgobj(gobjlist, p);
      return null;
   }

   Node m1(List<GraphObject> nodes, String p) {
      m0(nodes, p);
      return null;
   }

   Edge m2(List<GraphObject> edgeList, String p) {
      m0(edgeList, p);
      return null;
   }

  <T extends GraphObject> void printgobj(List<T> list, String p){
      for (GraphObject gobj : list){
         if (gobj.contains(p)){
            System.out.println(gobj);
         }
      }
   }
}

class GraphObject {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Node extends GraphObject {}

class Edge extends GraphObject {}