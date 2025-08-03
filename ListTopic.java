import java.util.ArrayList;
import java.util.List;

public class ListTopic {


    public void arrayListTopic(){

        List<Object> al = new ArrayList<>(List.of("Lewis hamilton","Max verstapen", "Charls"));
        al.add("Alonso");
        System.out.println(al);

        int listSize = al.size();
        System.out.println(listSize);

        boolean hasLewis = al.contains("Lewis hamilton");
        System.out.println(hasLewis);



    }

    public static void main(String[] args) {
        ListTopic lp = new ListTopic();
        lp.arrayListTopic();
    }
}
