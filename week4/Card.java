class Card{
    public String cardNotation;
    public String[] charTypeOfNotation = {
            "Ace",
            "Jack",
            "Queen",
            "King",
            "Spade"
    };
    public String[] numberTypeOfNotation = {
            "Two",
            "Three",
            "Four",
            "Five"
    };
    private char number;
    private char charType;
    Card(String notation){
        this.number = notation.charAt(0);
        this.charType = notation.charAt(1);
    }
    public String getDescription(){
        String charNotation;
        if(this.number == '2'){
            charNotation = numberTypeOfNotation[0];
        }else if(this.number == '3'){
            charNotation = numberTypeOfNotation[1];
        }else if(this.number == '4'){
            charNotation = numberTypeOfNotation[2];
        }else if(this.number == '5'){
            charNotation = numberTypeOfNotation[3];
        }else {
            charNotation = "Unknown";
            return  charNotation;
        }

        if(this.charType == 'A' || this.charType == 'a'){
            charNotation = charNotation + " " + charTypeOfNotation[0];
        }else if(this.charType == 'J' || this.charType == 'j'){
            charNotation = charNotation + " " + charTypeOfNotation[1];
        }else if(this.charType == 'Q' || this.charType == 'q'){
            charNotation = charNotation + " " + charTypeOfNotation[2];
        }else if(this.charType == 'K' || this.charType == 'k'){
            charNotation = charNotation + " " + charTypeOfNotation[3];
        }else if(this.charType == 'S' || this.charType == 's'){
            charNotation = charNotation + " " + charTypeOfNotation[4];
        }else{
            charNotation = "Unknown";
            return  charNotation;
        }

        return charNotation;
    }
}