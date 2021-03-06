package book;

public class ProgrammingBook extends Book implements SearchBook{
    public static int count;
    private String language;
    private String framework;

    ProgrammingBook(){
    }
    ProgrammingBook(String language,String framework){
        this.setLanguage(language);
        this.framework = framework;
    }
    ProgrammingBook(String name,String author,int price,int bookCode,String language,String framework){
        super(name, author, price, bookCode);
        this.setLanguage(language);
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        if(language == "java"){
            count++;
        }
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    public String toString(){
        return super.toString()+ "\nLanguage : "+getLanguage()
                + "\nFramework : "+getFramework()+
                "\n-----------------------";
    }

    @Override
    public int search(String name) {
        if(this.getName()== name){
            return this.getPrice();
        }
        return getPrice();
    }
}
