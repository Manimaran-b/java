import java.util.ArrayList;
import java.util.List;

public class ListTopic {


    public void arrayListTopic(){

        List<Object> al = new ArrayList<>(List.of("Lewis hamilton","Max verstapen", "Charls"));
        al.add("Alonso");
        System.out.println(al);

    }

    public static void main(String[] args) {
        ListTopic lp = new ListTopic();
        lp.arrayListTopic();
    }
}
