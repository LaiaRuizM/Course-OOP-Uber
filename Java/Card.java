package Java;

public class Card extends Payment {
    Integer numberCard;
    Integer CVVcode;
    String dateCard;

    public Card(Integer id, Integer numberCard, Integer CVVcode, String dateCard){
        super(id);
        this.numberCard = numberCard;
        this.CVVcode = CVVcode;
        this.dateCard = dateCard;
    }
}