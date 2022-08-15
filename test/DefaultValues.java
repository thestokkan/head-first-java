class DefaultValues {
    int size;
    String name;
    char character = 'a';
    boolean boo;

    public static void main(String[] args) {

        DefaultValues d = new DefaultValues();

        System.out.println("size: " + d.size);
        System.out.println("Name: " + d.name);
        System.out.println("Character: " + d.character);
        System.out.println("boo; " + d.boo);
    }
}
