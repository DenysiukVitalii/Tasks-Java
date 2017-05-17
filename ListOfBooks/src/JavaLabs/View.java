package JavaLabs;


public interface View {

    String EMPTY_FIELD = "";
    String ISBN_BOOK = "ISBN книги";
    String BOOK_NAME = "Наименования книги";
    String AUTHOR_SURNAME = "Фамилия автора";
    String AUTHOR_NAME = "Имя автора";
    String AUTHOR_LASTNAME = "Отчество автора";
    String PUBLISHING_HOUSE= "Издательство";
    String YEAR_PUBLISHING= "Год издания";
    String PRICE = "Цена";
    String ISBN_BOOK_DELETE = "ISBN книги(удалить)";

    String FIRST_NAME_BUTTON = "Просмотр";
    String SECOND_NAME_BUTTON = "->";
    String THIRD_NAME_BUTTON = "-<";
    String LAST_NAME_BUTTON = "Удалить книгу";

    String INPUT_ERROR = "Введите значение типа float";

    void setBook(String art);

    String getISBN ();

    void showInputError (String message);

    void setNameBook (String name);
    void setAuthorSurname (String name);
    void setAuthorName (String name);
    void setAuthorLastname (String name);
    void setPublishingHouse (String name);
    void setYearPublishing (String name);

    void setCost (String cost);

    void setCurr (String curr);

    void clickButton1 (Controller controller);

    void clickButton2 (Controller controller);

    void clickButton3 (Controller controller);

    void clickButton4 (Controller controller);

    void showView ();
}
