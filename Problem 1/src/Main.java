//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
class Category{
    Integer id;
    String name;
    Integer parentId;
    List<Category> children;


    public Category(Integer id, String name, Integer parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.children = new ArrayList<>();
    }
}

public class Main {

    public static void printCategory(Category category, int level) {
        // indentation for hierarchy
        String indent = getIndent(level);
        System.out.println(indent + "- " + category.name + " (id=" + category.id + ")");
        for (Category child : category.children) {
            printCategory(child, level + 1); // recursion for subcategories
        }
    }

    public static String getIndent(int level) {
        String indent = "";
        for (int i = 0; i < level; i++) {
            indent += "  "; // two spaces per level
        }
        return indent;
    }

    static void detectCycle(Category start, Map<Integer, Category> map) {
        Set<Integer> visited = new HashSet<>();
        Category current = start;

        while (current.parentId != null) {
            if (visited.contains(current.id)) {
                throw new IllegalStateException(
                        "Circular dependency detected at category id: " + current.id
                );
            }

            visited.add(current.id);
            current = map.get(current.parentId);

            if (current == null) {
                return; // parent not found → treat as leaf, no cycle
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Category> flatData = new LinkedList<Category>();
//        Category a = new Category(1,"Electronics",null);
//        flatData.add(a);

        Map<Integer, Category> treeData = new HashMap<Integer, Category>();

        Iterator<Category> it = flatData.iterator();
        while (it.hasNext()){
            Category cat = it.next();
            //percobaan tambahan anti dobel id, ambil data pertama and shows notif on CLI display
            if(treeData.containsKey(cat.id)){
                System.out.println("Duplicated ID warning!! ID: " + cat.id + " already existed.");
                System.out.println("This data row bypassed and deleted.");
                it.remove();
                continue;
            }
            treeData.put(cat.id,cat);
        }

        for (Category temp1 : flatData) {
            detectCycle(temp1, treeData);
        }

        //below is process to assign parent-children
        List<Category> roots = new ArrayList<>();
        for (Category kb : flatData) {
            if (kb.parentId == null) {
                roots.add(kb); // root category, hanya root saja yang masuk arrayList
            } else {
                Category parent = treeData.get(kb.parentId);
                if (parent != null) {
                    parent.children.add(kb);
                }
            }
        }

        // print
        for (Category root : roots) {
            printCategory(root, 0);
        }
    }

}
