<?php
class Account {
    //Atributtes
    public $id;    
    public $name;
    public $document;
    public $email;
    public $password;

    //Constructor method with two parameters
    function __construct($name, $document){
    $this->name = $name;
    $this->document = $document;
    }
}

