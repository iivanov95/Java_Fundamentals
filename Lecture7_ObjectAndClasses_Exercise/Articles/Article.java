package Lecture7_ObjectAndClasses_Exercise.Articles;

public class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    //1. метод edit - променя съдържанието
    public void edit (String newContent) {
        this.content = newContent;
    }

    //2. метод changeAuthor - променя автора
    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    //3. метод rename - променя заглавието
    public void rename (String newTitle) {
        this.title = newTitle;
    }

    //вграден метод toString - показва как изглежда обекта по формата на текст
    //default: {package}.{class}@{address}
    // а ние искаме: {title}.{content}: {author}
    @Override //Пренаписване на вградения метод toString по следния начин:
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}