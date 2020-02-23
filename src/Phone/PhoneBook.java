package Phone;

import java.util.*;

public class PhoneBook extends Phone implements PhoneFunction{
    private ArrayList<Phone> array = new ArrayList<Phone>();

    public ArrayList<Phone> getArray() {
        return array;
    }

    @Override
    public void insertPhone(String name, String phone) {
        Phone p = new Phone(name, phone);
        array.add(p);
    }

    @Override
    public void removePhone(String name) {
        for (int i=0; i<array.size();i++){
            if (array.get(i).getName()==name) {
                System.out.println("Element["+i+"], name: "+array.get(i).getName() +" has been deleted!");
                array.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String phone, int i) {
        Phone tempPhone = new Phone(name,phone);
        array.set(i,tempPhone);
        System.out.println("Element["+i+"] has been changed!");
    }

    @Override
    public Phone searchPhone(String name) {
        for (int i=0; i<array.size();i++){
            if (array.get(i).getName()==name)
                return array.get(i);
        }
        return null;
    }

    @Override
    public void sortPhone() {
        Collections.sort(array, new Comparator<Phone>() {
            @Override
            public int compare(Phone p1, Phone p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
    }

    public void traversePhoneBook() {
        for (Phone p: this.getArray()) {
            System.out.println(p.getName()+"  "+p.getPhone());
        }
    }



}
