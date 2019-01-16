import api.GetFromApi;

public class App {

    public static void main(String[] args) {
        GetFromApi.fetchAndSaveAllDepartements();
        System.out.println("All good");
    }

}
