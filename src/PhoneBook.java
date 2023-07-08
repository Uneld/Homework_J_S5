import java.util.*;

public class PhoneBook {
    private Map<String, List<Integer>> contacts;
    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void Add(String name, Integer phone) {
        if (contacts.containsKey(name)) {
            List<Integer> phones = contacts.get(name);
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        } else {
            List<Integer> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }

    public String Print(){
        return contacts.toString();
    }
    public String PrintSorted() {
        ArrayList<Map.Entry<String, List<Integer>>> sortContacts = new ArrayList<>();
        Map<String, List<Integer>> temp = new HashMap<>(contacts);

        Sort(temp, sortContacts);

        return sortContacts.toString();
    }

    private void Sort(Map<String, List<Integer>> map, ArrayList<Map.Entry<String, List<Integer>>> arrayList){
        if (map.isEmpty()){
            return;
        }

        Map.Entry<String, List<Integer>> max = map.entrySet().stream().findFirst().get();
        for (Map.Entry<String, List<Integer>> item : map.entrySet()) {
            if (max.getValue().size() < item.getValue().size()){
                max = item;
            }
        }
        arrayList.add(max);
        map.remove(max.getKey());
        Sort(map, arrayList);
    }
}