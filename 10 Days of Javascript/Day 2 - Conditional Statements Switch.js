function getLetter(s) {
    let letter;
    // Write your code here
    switch(s[0]){
        case 'a':
            letter = 'A';
            break;
        case 'e':
            letter = 'A';
            break;
        case 'i':
            letter = 'A';
            break;
        case 'o':
            letter = 'A';
            break;
        case 'u':
            letter = 'A';
            break;
    }
    if (letter == null){
        const charValue = s.charCodeAt(0)-97;
        switch (true){
            case charValue <= 6:
                letter = 'B';
                break;
            case charValue <= 12:
                letter = 'C';
                break;
            default:
                letter = 'D';
        }
    }
    return letter;
}