package semana04.tarea3;


public class Main{
    
    public static void ChangeBox( Box newBox) {
        newBox.size = 20;
        
    }
    public static void main(String[] args) throws Exception {
        Box box = new Box(20);
        System.out.println(box.size);
        ChangeBox(box);
        System.out.println(box.size);
        
        
    
}
}
