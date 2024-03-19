package restspringbootjava.com.br.gabriel;

public class Greeting {

    private final long ig;
    private final String content;


    public Greeting(long ig, String content) {
        this.ig = ig;
        this.content = content;
    }

    public long getIg() {
        return ig;
    }



    public String getContent() {
        return content;
    }
}
