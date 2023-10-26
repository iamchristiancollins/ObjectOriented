package docs;


/**
 * This class will demonstrate Javadocs
 * @author christiancollins
 */
public class JavaDocsExample {
    public static void main(String[] args) {
        System.out.println(add(5, 10));
    }

    /**
     * This method adds two integers
     * @param a int
     * @param b int
     * @return an integer sum of a and b
     */
    public static int add(int a, int b){
        return a + b;
    }
}
