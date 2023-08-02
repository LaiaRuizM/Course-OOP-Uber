<?php
class Account {
    public $id;    
    public $name;
    public $document;
    public $email;
    public $password;

    function __construct($name, $document, $email, $password){
    $this->name = $name;
    $this->document = $document;
    $this->email = $email;
    $this->password = $password;
    }

     public function printDataCar(){
        echo "Name: ".$this->name
        " Document: ".$this->document
    }
}
?>