public class Text {

    String text;
    String author;
    int length;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


class ChangeTheText extends Text{

    void allLettersToUpperCase() {
        System.out.println("changing to uppercase");
    }


    void findSubTextAndDelete(String s) {
        System.out.println("finding subtext and deleting");
    }
}


class PrintingText extends ChangeTheText{
    void printText(){
       allLettersToUpperCase();
        findSubTextAndDelete("stackroute");
        System.out.println("printing");


    }
}

class Text1{
    public static void main(String[] args) {
        PrintingText text=new PrintingText();
        text.printText();
    }
}