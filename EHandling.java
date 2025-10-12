class EHandling{

    public static void main(String[] args) {

        try{
            hey();
        }
        catch(Exception e){
            System.out.println(e);

        }
        finally{
            System.out.println("Execution complete");
        }
        
    }

    static void hey() throws Exception{
        int a = 5/0;
    }

}