from payment import Payment

class Card(Payment):
    numberCard = int
    CVVcode = int
    dateCard = str

    def __init__(self, id, numberCard, CVVcode, dateCard):
        super().__init__(id)
        self.numberCard = numberCard
        self.CVVcode = CVVcode
        self.dateCard = dateCard