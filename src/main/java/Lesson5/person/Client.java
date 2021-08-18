package Lesson5.person;

public class Client extends Person {

    private int clientId;

    public Client(){
    }

    public Client(int age, String name, int clientId){
        super(age, name);
        this.clientId = clientId;
    }

    public int getClientId(){
        return clientId;
    }

    public void setClientId(int id){
        clientId = id;
    }
}
