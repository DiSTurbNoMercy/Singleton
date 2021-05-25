public class SingletonP {
    public static final SingletonP instance = new SingletonP();
    //объявил статический конечный экземпляр для возврата экземпляра
    private SingletonP()  {}
    public static SingletonP getInstance() {
        return instance;
    }
}
    class testClass {
        public static void main(String[] args) {
            SingletonP singletonP = SingletonP.getInstance();
            SingletonP singletonP1 = SingletonP.getInstance();
        }
    }
