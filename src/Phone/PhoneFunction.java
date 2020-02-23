package Phone;

public interface PhoneFunction {
    void insertPhone(String name, String phone);

    void removePhone (String name);

    void updatePhone (String name, String phone, int i);

    Phone searchPhone (String name);

    void sortPhone();
}
