public class Bite {

    private String message;

    public Bite(String test){
        this.message = test;
    }

    public String messager(){
        return "Ma bite s'appelle "+this.message;
    }

    public static void main(String[] args) {
        Bite bite = new Bite("Hugo");
        System.out.println(bite.messager());
    }
}
