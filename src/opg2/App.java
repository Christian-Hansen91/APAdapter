package opg2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("holme", "skåde","viby", "beder","staustrup","engdal","forældreskolen","malling"));
        SearchableList searchableList = new SearchableList(list);
        System.out.println(searchableList.search("malling"));
        SearchableBinary binary = new SearchableBinary(list);
        System.out.println(binary.search("malling444"));
    }
}
