import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spravochnik {
    private Map<String, List<String>> spravochnik;

    public Spravochnik() {
        spravochnik = new HashMap<>();
    }
    public void add(String lastname, String sellNumber) {
        spravochnik.computeIfAbsent(lastname, k -> new ArrayList<>()).add(sellNumber);
    }
    public List<String> get(String lastname) {
        return spravochnik.getOrDefault(lastname, new ArrayList<>());
    }
    public static void main(String[] args) {
        Spravochnik справочник = new Spravochnik();

        справочник.add("Иванов", "+123456789");
        справочник.add("Петров", "+987654321");
        справочник.add("Иванов", "+112233445");

        System.out.println("Номер Иванова: " + справочник.get("Иванов"));
        System.out.println("Номер Петрова: " + справочник.get("Петров"));
    }
}