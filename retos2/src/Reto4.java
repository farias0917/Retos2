public class Reto4 {
    public static void main(String[] args) {
        String [][]Teclado={{"Esc",  "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Imp pnt", "Supr","bloq num","/","*","-"},
                           { "|",    "1",  "2",  "3",  "4",  "5",  "6",  "7",  "8",  "9",  "0",   "?",   "¿",   "Delete", "Inicio","7","8","9","+"}, 
                           {"TAB",   "Q",  "W",  "E",  "R",  "T",  "Y",  "U",  "I",  "O",  "P",   "´´",  "+",    "ENTER",  "Fin","4","5","6","+"},
                           {"bloq mayus", "A",  "S",  "D",  "F",  "G",  "H",  "J",  "K",  "L",  "Ñ",   "{",   "}",    "ENTER",  "RePag","1","2","3","+"},
                           {"Shift", "<",  "Z",  "X",  "C",  "V",  "B",  "N",  "M",  ",",  ".",   "-", "Shift",    "^",    "AvPag","0",".","intro",""},
                           {"Ctrl",  "Fn", "WD", "Alt","         ESPACIO       ","AltGr","Fn", "Ctrl",  "<",     "v",      ">","","","","","","","","",""}};

                        for(int i=0;i<6;i++){
                            for(int j=0;j<19;j++){
                                System.out.print(Teclado[i][j]+"\t");
                            }
                            System.out.println("");
                           }

    }   
}