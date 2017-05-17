package JavaLabs;


public class Controller {

    Model model;

    View view;

    Integer currentBook;

    public Controller (Model m, View v) {
        this.model = m;
        this.view = v;

        view.clickButton1(this);
        view.clickButton2(this);
        view.clickButton3(this);
        view.clickButton4(this);

        currentBook = 0;
    }


    private void showCurrentArticle(){
        Integer art = model.getBook(currentBook);
        Book arto = model.getArticleObj(art);
        Integer helpcurr = currentBook +1;

        view.setBook(art.toString());
        view.setNameBook(arto.getBookName());
        view.setAuthorSurname(arto.getAuthorSurname());
        view.setAuthorName(arto.getAuthorName());
        view.setAuthorLastname(arto.getAuthorLastname());
        view.setPublishingHouse(arto.getPublishingHouse());
        view.setYearPublishing(arto.getYearPublishing());
        view.setCost(arto.toString());
        view.setCurr(helpcurr.toString()+ "/" + model.bookList.size());
    }


    public void showFirstArticle(){
        currentBook = 0;
        showCurrentArticle();
    }


    public void nextArticle (){
        currentBook++;
        if (currentBook == model.getListSize())
            currentBook = 0;
        showCurrentArticle();
    }


    public void prevArticle(){
        currentBook--;
        if (currentBook <0)
            currentBook = model.getListSize()-1;
        showCurrentArticle();
    }

    public void deleteBook(){
        model.removeBook(Integer.parseInt(view.getISBN()));
    }
}
