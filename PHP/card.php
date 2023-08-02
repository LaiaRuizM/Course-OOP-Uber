<?php
require_once("payment.php"); 
class Card extends Payment { 
    public $numberCard;
    public $CVVcode;
    public $dateCard;

    public function __construct($id, $numberCard, $CVVcode, $dateCard){
        parent::__construct($id);  
        $this->numberCard = $numberCard; 
        $this->CVVcode = $CVVcode; 
        $this->dateCard = $dateCard; 
    }
}
?>
