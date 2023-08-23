package SistemaTicket;


public class AdminTicket {
    private int num;
    private String clase;

    public AdminTicket(int num, String clase) {
        this.num = num;
        this.clase = clase;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
  
}
