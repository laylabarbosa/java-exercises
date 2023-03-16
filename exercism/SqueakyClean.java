class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder str= new StringBuilder();
        for (int i=0; i < identifier.length(); i++){
            if (Character.isSpaceChar(identifier.charAt(i))){
                str.append('_');
            }
            else if(Character.isISOControl(identifier.charAt(i))){
                str.append("CTRL");
            }   
            else if(identifier.charAt(i) == '-'){
                i++;
                if(Character.isDigit(identifier.charAt(i))){
                    i++;
                    str.append(Character.toUpperCase(identifier.charAt(i)));
                }
                else{
                    str.append(Character.toUpperCase(identifier.charAt(i)));
                } 
            }   
            else if(!Character.isLetter(identifier.charAt(i)) || (identifier.charAt(i) >= 'α' &&                             identifier.charAt(i) <= 'ω')){
                str.append("");
            } 
            else{
                str.append(identifier.charAt(i));
            }
        }
    return str.toString();
    }
}
