public class Printer {

    private int pages, toner;

    public Printer(int pages, int toner) {
        this.pages = pages;
        this.toner = toner;
    }




    public int getPages() {
        return this.pages;
    }

    public int getToner() {
        return this.toner;
    }

    public boolean print(int pages, int copies) {
        int totalPages = pages * copies;

        if (this.pages > totalPages) {
            this.pages -= totalPages;
            this.toner -= totalPages;
            return true;
        }
        return false;
    }

}
