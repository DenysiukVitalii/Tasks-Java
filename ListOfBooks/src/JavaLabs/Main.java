package JavaLabs;

public class Main {

    public static void main(String[] args) {

        View view = new SwingView(350,300);
        view.showView();

        Model model = new Model();
        model.addArticle(340,new Book(200.50f,"Бородино", "Лермонтов",
                "Михаил", "Юрьевич", "Современник", "1837"));
        model.addArticle(5451,new Book(158.70f,"Дубровский", "Пушкин",
                "Александр", "Сергеевич", "Литература", "1841"));
        model.addArticle(652,new Book(325.20f,"Оно", "Кинг",
                "Стивен", "Э́двин", "Viking Press", "1986"));
        model.addArticle(763,new Book(90.80f,"Морской волк", "Лондон",
                "Джек", "Гри́ффит", "Джек Лондон", "1904"));
        model.addArticle(764,new Book(112.40f,"Девять рассказов", "Сэлинджер",
                "Джером", "Дэвид", "Brown Company", "1953"));

        Controller controller = new Controller(model,view);
    }
}
