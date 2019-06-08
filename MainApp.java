package tree;

public class MainApp {

    public static void main(String[] args){
        var myTree = new BinaryTree();
        int key;
        long data;
        for(int i = 0; i < 10; i++){
            key = (int)Math.round(Math.random()*100);
            //key = i;
            data = Math.round(Math.random()*1000);
            //data = i*32;
            myTree.insert(key, data);
        }
        try{
            System.out.println(myTree.find(26).getData());
        }
        catch(NullPointerException ex){
            System.out.println("Element not found");
        }


    }
}
