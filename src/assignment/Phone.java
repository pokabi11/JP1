package assignment;

public abstract class Phone {
        public abstract void insertName(String name, String phone);
        public abstract void removephone(String name);
        public abstract void updatePhone(String name, String oldPhone, String newPhone);
        public abstract void searchPhone(String name);
        public abstract void sort();

}

