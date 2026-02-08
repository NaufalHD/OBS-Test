//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> sourceA = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> sourceB = new ArrayList<Map<String, Object>>();

        addDatabase(sourceA,sourceB);

        //Merge
        List<Map<String, Object>> merged = mergeData(sourceA, sourceB,"id");

        for (Map<String, Object> row : merged) {
            System.out.println(row);
        }

    }

    static void addDatabase(List<Map<String, Object>> sourceA, List<Map<String, Object>> sourceB){
//        sourceA
//        Map<String, Object> a1 = new HashMap<String, Object>();
//        a1.put("id",1);
//        a1.put("name","Apple");
//        a1.put("price",5200);
//        sourceA.add(a1);
//
//        Map<String, Object> a2 = new HashMap<String, Object>();
//        a2.put("id",2);
//        a2.put("name","Jeruk");
//        a2.put("price",3200);
//        sourceA.add(a2);

        //sourceB
//        Map<String, Object> b1 = new HashMap<String, Object>();
//        b1.put("id",3);
//        b1.put("stock",32);
//        b1.put("warehouse","WH1");
//        sourceB.add(b1);
//
//        Map<String, Object> b2 = new HashMap<String, Object>();
//        b2.put("id",1);
//        b2.put("stock",44);
//        b2.put("warehouse","WH9");
//        sourceB.add(b2);
    }

    static List<Map<String, Object>> mergeData(
            List<Map<String, Object>> sourceA,
            List<Map<String, Object>> sourceB,
            String key
    ) {
        //intinya, yang kita cek satu persatu itu adalah sourceA

        Map<Object, Map<String, Object>> lookup = new HashMap<>();

        //naruh semua dari sourceB ke lookup-map
        for (Map<String, Object> rowB : sourceB) {
            Object keyValue = rowB.get(key);
            lookup.put(keyValue, rowB);
        }

        List<Map<String, Object>> result = new ArrayList<>(); //list akhir hasil merged utk di return

        //merge row berdasarkan id. Looping through each one inside sourceA
        for (Map<String, Object> rowA : sourceA) {
            Object keyValue = rowA.get(key); //ambil key dari sourceA
            Map<String, Object> rowB = lookup.get(keyValue); //ambil value dari keyValue di lookUp

            Map<String, Object> merged = new HashMap<String, Object>(rowA); //result 1 row untuk nanti ditambahkan ke list

            if (rowB != null) { //kalau rowB ada isinya (berdasarkan hasil cek pakai key sourceA
                for (Map.Entry<String, Object> entry : rowB.entrySet()) {
                    Object valueB = entry.getValue();

                    if (valueB != null && !"".equals(valueB)) {
                        merged.put(entry.getKey(), valueB);
                    }
                }
            }


            //kalau hanya ada key di sourceA, add rowA secara UTUH ke result
            //kalau ada key juga di sourceB
            result.add(merged);
        }

        return result;
    }

}