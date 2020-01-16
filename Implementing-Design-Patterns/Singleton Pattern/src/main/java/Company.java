public class Company {
    private String name;
    private String description;
    private KeyGenerator assignedGenerator;

    public Company(String name, String description){
        this.name = name;
        this.description = description;
        this.assignedGenerator = null;
    }

    public Company(String name, String description, KeyGenerator assigned){
        this.name = name;
        this.description = description;
        this.assignedGenerator = assigned;
    }

    public void provisionRequestsWithCompanyGenerator(int requests){
        for(int i=1;i<=requests;i++){
            try {
                System.out.println("Request " + i + ": " + this.name + " submitting request for key... recieved '" + this.assignedGenerator.getKey() + "'");
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public void provisionRequestsWithoutCompanyGenerator(int requests){
        try {
            KeyGenerator requestedGenerator = KeyGenerator.getInstance();
            for(int i=1;i<=requests;i++){
                System.out.println("Request " + i + ": " + this.name + " submitting request for key... recieved '" + requestedGenerator.getKey() + "'");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}
