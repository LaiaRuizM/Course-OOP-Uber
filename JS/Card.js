class Card extends Payment {
  constructor(id, numberCard, CVVcode, dateCard) {
    super(id);
    this.numberCard = numberCard;
    this.CVVcode = CVVcode;
    this.dateCard = dateCard;
  }
}
