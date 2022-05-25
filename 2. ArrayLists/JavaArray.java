import java.util.AreayList;

public class JavaArray {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    
    arrayList.add("Hello");
    arrayList.add("World,");  
    arrayList.add("This");  
    arrayList.add("Is"); 
    arrayList.add("Kotlin!");
    for (String str : arrayList) {  
        System.out.println(str);  
    }  
  }
}
