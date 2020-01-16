import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        KeyGenerator globalKeyGenerator = KeyGenerator.getInstance();
        Company tax = new Company("TaxPlus", "We do personal taxes to make our customer life financially richer!", globalKeyGenerator);
        Company construction = new Company("BMHT", "Build My House Today", globalKeyGenerator);

        Random random = new Random();
        tax.provisionRequestsWithCompanyGenerator(random.nextInt(20) + 1);
        construction.provisionRequestsWithCompanyGenerator(random.nextInt(5) + 1);

        globalKeyGenerator.printAllKeys();

        //this should throw an error
        tax.provisionRequestsWithoutCompanyGenerator(random.nextInt(20) + 1);
    }
}