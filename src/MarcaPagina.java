public class MarcaPagina {
    private int page;

    public MarcaPagina(){
        page = 1;
    }

    public void increasePage(){
        page += 1;
    }

    public int getPage(){
        return page;
    }

    public void resetBook(){
        page = 1;
    }
}
