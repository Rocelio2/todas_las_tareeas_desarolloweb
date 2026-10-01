import java.util.HashSet;
import java.util.Set;

public class PlaygroundSets {

    public Set<String> createEmptySet() {
        return new HashSet<>();
    }

    public Set<String> addElement(Set<String> set, String element) {
        set.add(element);
        return set;
    }

    public boolean checkElementExists(Set<String> set, String element) {
        return set.contains(element);
    }

    public Set<String> removeElement(Set<String> set, String element) {
        set.remove(element);
        return set;
    }
}