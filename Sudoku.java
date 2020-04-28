package sudoku;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Agustin Taiel Peanelli
 */
public class Sudoku {
    
    /*GUARDAR CELDAS POR DEFECTO*/
    public static int[][] bloq(int[][] sudoku, int dif) {
        
        int cant = 0, fila = 0;
        
        if (dif == 1) {

            cant = 20;

        } else if (dif == 2) {

            cant = 15;

        } else if (dif == 3) {

            cant = 10;
        }
        
        int[][] bloq = new int[cant][2];
        
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                
                if (sudoku[i][j] != 0) {
                        
                    bloq[fila][0] = i;
                    bloq[fila][1] = j;
                    fila++;
                        
                    }   
                }
            }
        return bloq;
    }
    
    /*COMPROBAR QUE NUMERO NO SE REPITA*/
    public static boolean comprobar(int[][] sudoku, int num, int fil, int col) {
    
        boolean repite = false;
        int fil1 = 0, fil3 = 0, col1 = 0, col3 = 0; 
        
        /*COMPROBAR COLUMNA*/
        for (int i = 0; i < sudoku.length; i++) {
            
            if (sudoku[i][col] == num) {
                
                repite = true;
                
            }
            
        }
        
        /*COMPROBAR FILA*/
        for (int i = 0; i < sudoku[fil].length; i++) {
            
            if (sudoku[fil][i] == num) {
                
                repite = true;
                
            }
        }
        
        /*COMPROBAR CUADRICULA*/
        if (fil == 0 || fil == 3 | fil == 6) {
            
            fil1 = fil;
            fil3 = fil + 2;
            
        } else if (fil == 1 || fil == 4 || fil == 7) {
            
            fil1 = fil - 1;
            fil3 = fil + 1;
            
        } else if (fil == 2 || fil == 5 || fil == 8) {
            
            fil1 = fil - 2;
            fil3 = fil;
            
        }
        
        if (col == 0 || col == 3 || col == 6) {
            
            col1 = col;
            col3 = col + 2;
            
        } else if (col == 1 || col == 4 || col == 7) {
            
            col1 = col - 1;
            col3 = col + 1;
            
        } else if (col == 2 || col == 5 || col == 8) {
            
            col1 = col - 2;
            col3 = col;
            
        }
        
        for (int i = fil1; i <= fil3; i++) {
            for (int j = col1; j <= col3; j++) {
                
                if (num == sudoku[i][j]) {
                    
                    repite = true;
                    
                }
            }
        }
        
    
        return repite;
    }
    
    /*NUMEROS ALEATORIOS*/
    public static int[][] aleatorios(int[][] sudoku, int dif) {
    
        int cant = 0, fila = 0, columna = 0, num = 0; ;
        double random1, random2, random3;
        boolean repite = true;
        
        if (dif == 1) {

            cant = 20;

        } else if (dif == 2) {

            cant = 15;

        } else if (dif == 3) {

            cant = 10;
        }
        
        for (int i = 0; i < cant; i++) {
            
            do {
                
                random1 = Math.random() * 8;
                random2 = Math.random() * 8;
                fila = (int)random1;
                columna = (int)random2;
                
            } while (sudoku[fila][columna] != 0);
            
            repite = true;
            
            do {
                
                random3 = Math.random() * 9 + 1;
                num = (int)random3;
                repite = comprobar(sudoku, num, fila, columna);
                
                
            } while (repite == true);
            
            
            sudoku[fila][columna] = num;
            
        }
        
        return sudoku;
    }
    
    /*IMPRIMIR MATRIZ*/
    public static void print(int[][] sudoku) {
        
        for (int i = 0; i < sudoku.length; i++) {
            
            System.out.println("");
            
            if (i == 0) {
                
                System.out.println("    A  B  C   D  E  F   G  H  I");
                
            }
            
            if (i == 3 || i == 6 || i == 0 || i == 9) {
                
                System.out.println("  |-----------------------------|");
                
            }
            
            for (int j = 0; j < sudoku[i].length; j++) {
                
                if (j == 0) {
                    
                    if (sudoku[i][j] == 0) {
                        
                        System.out.print((i+1)+" | ");
                        
                    } else {
                    
                        System.out.print((i+1)+" | ");
                        
                    }
                }
                
                if (j != 2 && j != 5 & j != 8) {
                    
                    if (sudoku[i][j] == 0) {
                        
                        System.out.print(" "+"  ");
                        
                    } else {
                    
                        System.out.print(sudoku[i][j]+"  ");
                    
                    }
                } else if (j == 2 || j == 5) {
                    
                    if (sudoku[i][j] == 0) {
                        
                        System.out.print(" "+" | ");
                        
                    } else {
                    
                        System.out.print(sudoku[i][j]+" | ");
                        
                    }
                    
                    
                } else if (j == 8) {
                
                    if (sudoku[i][j] == 0) {
                        
                        System.out.print(" "+" ");
                        
                    } else {
                    
                        System.out.print(sudoku[i][j]+" ");
                    
                    }
                    
                    
                
                }
                
                if (j == 8) {
                        
                        System.out.print("|");
                        
                    }
                
                
            }
        }
        
        System.out.println("\n  |-----------------------------|");
        System.out.println("\n");
    
    }
    
    /*INICIALIZAR MATRIZ*/
    public static int[][] start() {
    
        int[][] sudoku = new int[9][9];
        
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                
                sudoku[i][j] = 0;
                
            }
        }
        
    return sudoku;
    }
    
    /*MENU CARGADO*/
    public static int menuCargado() {
        Scanner tec = new Scanner(System.in);
        
        int opcion = 0;
        
        do {
            
            compruebaLleno();
            System.out.print("\nIntroduce el guardado que quieras escoger: ");
            opcion = Integer.parseInt(tec.nextLine());
            
        } while (opcion < 1 || opcion > 3);
        
        
        return opcion;
    }
    
    /*CARGAR FICHEROS*/
    public static int[][] cargar() {
        
        int opcion = menuCargado();
        String save = "";
        
        if (opcion == 1) {
            
            save = ".\\data\\saves\\save1.txt";
            
        } else if (opcion == 2) {
            
            save = ".\\data\\saves\\save2.txt";
            
        } else if (opcion == 3) {
            
            save = ".\\data\\saves\\save3.txt";
            
        }
        
        FileReader fr;
        BufferedReader br;
        int num = 0;
        String str = "";
        char car;
        String carac;
        int[][] guardada = new int[9][9];
        
        try {
            
            fr = new FileReader(save);
            br = new BufferedReader(fr);
            
            for (int i = 0; i < guardada.length; i++) {
                
                str = br.readLine();
                
                for (int j = 0; j < guardada[i].length; j++) {
                    
                    car = str.charAt(j);
                    carac = car + "";
                    num = Integer.parseInt(carac);
                    guardada[i][j] = num;
                            
                }
            }
            
            br.close();
            
        } catch (Exception e) {
            
        }
        
    return guardada;
    }
    
    /*SELECTOR DE DIFICULTAD*/
    public static int dif() {
    
        Scanner tec = new Scanner(System.in);
        int op;
        double num;
        
        System.out.println("\n---------------");
        System.out.println("1 FACIL");
        System.out.println("2 NORMAL");
        System.out.println("3 DIFICIL");
        System.out.println("---------------");
        System.out.print("Elige la dificultad: ");
        do  {
            
            op = Integer.parseInt(tec.nextLine());
            
            if (op < 1 || op > 3) {
                
                System.out.print("Escoge una opción válida: ");
                
            }
            
        } while (op < 1 || op > 3);
        
        System.out.println("");
        return op;
    }
    
    /*MENÚ PRINCIPAL*/
    public static int menu() {
        
        Scanner tec = new Scanner(System.in);
        int opcion = 0;
                
        System.out.println("\nBIENVENIDO");
        System.out.println("------------------");
        System.out.println("1 NUEVA PARTIDA");
        System.out.println("2 CARGAR");
        System.out.println("3 DIFICULTAD");
        System.out.println("4 SALIR");
        System.out.println("------------------");
        System.out.print("Elige una opción: ");
        
        do {
            
            opcion = Integer.parseInt(tec.nextLine());
            if (opcion < 1 || opcion > 4) {
                
                System.out.print("Introduce una opcion válida: ");
                
            }
            
        } while (opcion < 1 || opcion > 4);
        
        return opcion;
    }
    
    /*COMPROBAR SI ESTÁ LLENO*/
    public static boolean comprobar(int[][] sudoku) {
        
        boolean lleno = true;
        
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                
                if (sudoku[i][j] == 0) {
                    
                    lleno = false; 
                    
                }
                
            }
        }
        return lleno;
    }
    
    /*TRADUCTOR*/
    public static int traductor(String letra) {
        
        if (letra.equalsIgnoreCase("A")) {
            
            return 0;
            
        } else if (letra.equalsIgnoreCase("B")) {
            
            return 1;
            
        } else if (letra.equalsIgnoreCase("C")) {
            
            return 2;
            
        } else if (letra.equalsIgnoreCase("D")) {
         
            return 3;
            
        } else if (letra.equalsIgnoreCase("E")) {
            
            return 4;
            
        } else if (letra.equalsIgnoreCase("F")) {
            
            return 5;
            
        } else if (letra.equalsIgnoreCase("G")) {
            
            return 6;
            
        } else if (letra.equalsIgnoreCase("H")) {
            
            return 7;
            
        } else if (letra.equalsIgnoreCase("I")) {
            
            return 8;
            
        }
        
        
        return 0;
    }
    
    /*COMPROBAR BLOQUEO*/
    public static boolean bloqueo(int[][] bloq, int fil, int col) {
        boolean bloqueado = false;
        String juntos = (fil + "") + (col + "");
        int filcol = Integer.parseInt(juntos);
        String juntarbloq;
        int juntarbloqint;
        
        for (int i = 0; i < bloq.length; i++) {
            juntarbloq = "";
            for (int j = 0; j < bloq[i].length; j++) {
                
                juntarbloq = juntarbloq + bloq[i][j];
                
            }
            juntarbloqint = Integer.parseInt(juntarbloq);
            
            if (juntarbloqint == filcol) {
                    
                    bloqueado = true;
                }
        }
        
        return bloqueado;
    }
    
    /*COMPROBAR SI FICHERO LLENO*/
    public static void compruebaLleno() {
        
        FileReader fr;
        BufferedReader br;
        String fichero;
        boolean s1 = false, s2 = false, s3 = false;
        
        try {
            
            for (int i = 1; i <= 3; i++) {
                
                fr = new FileReader(".\\data\\saves\\save"+i+".txt");
                br = new BufferedReader(fr);
                
                fichero = br.readLine();
                
                if (fichero != null && i == 1) {
                    
                    s1 = true;
                    
                } else if (fichero != null && i == 2) {
                    
                    s2 = true;
                    
                } else if (fichero != null && i == 3) {
                    
                    s3 = true;
                    
                }
                
                br.close();
            }
            
        } catch (Exception e) {
            
        }
        
        System.out.println("");
        
        if (s1 == true) {
            System.out.println("Slot 1 - En uso ");
        } else {
            System.out.println("Slot 1 - Vacío ");
        }
        
        if (s2 == true) {
            System.out.println("Slot 2 - En uso ");
        } else {
            System.out.println("Slot 2 - Vacío ");
        }
        
        if (s3 == true) {
            System.out.println("Slot 3 - En uso ");
        } else {
            System.out.println("Slot 3 - Vacío ");
            }
    } 
    
    /*MENU GUARDADO*/
    public static int menuGuardado() {
        Scanner tec = new Scanner(System.in);
        /*Si es TRUE el boolean tiene valor el fichero*/
        
        FileReader fr;
        BufferedReader br;
        String fichero;
        boolean s1 = false, s2 = false, s3 = false, salir;
        int opcion = 0, opcion2 = 0;
        
        try {
            
            for (int i = 1; i <= 3; i++) {
                
                fr = new FileReader(".\\data\\saves\\save"+i+".txt");
                br = new BufferedReader(fr);
                
                fichero = br.readLine();
                
                if (fichero != null && i == 1) {
                    
                    s1 = true;
                    
                } else if (fichero != null && i == 2) {
                    
                    s2 = true;
                    
                } else if (fichero != null && i == 3) {
                    
                    s3 = true;
                    
                }
                
                br.close();
            }
            
        } catch (Exception e) {
            
        }
        
        do {
        
        salir = false;
        System.out.println("");
        
        if (s1 == true) {
            System.out.println("Slot 1 - En uso ");
        } else {
            System.out.println("Slot 1 - Vacío ");
        }
        
        if (s2 == true) {
            System.out.println("Slot 2 - En uso ");
        } else {
            System.out.println("Slot 2 - Vacío ");
        }
        
        if (s3 == true) {
            System.out.println("Slot 3 - En uso ");
        } else {
            System.out.println("Slot 3 - Vacío ");
        }
        System.out.print("\n Elige el slot de guardado: ");
            
         do {
             
            opcion = Integer.parseInt(tec.nextLine());
            
        } while(opcion < 1 || opcion > 3);
        
         
            if (s1 == true && opcion == 1) {
                
                System.out.println("\nSe sobreescribirán los datos guardados\n");
                System.out.println("1- Sí");
                System.out.println("2- No");
                System.out.print("\n¿Deseas Continuar?: ");
                
                do {
                    opcion2 = Integer.parseInt(tec.nextLine());
                    if (opcion2 == 1) {
                    salir = true;
                }
                    
                } while (opcion2 < 1 || opcion2 > 2);
                
            } else if (s2 == true && opcion == 2) {
                
                System.out.println("\nSe sobreescribirán los datos guardados\n");
                System.out.println("1- Sí");
                System.out.println("2- No");
                System.out.print("\n¿Deseas Continuar?: ");
                
                do {
                    opcion2 = Integer.parseInt(tec.nextLine());
                    if (opcion2 == 1) {
                    salir = true;
                }
                    
                } while (opcion2 < 1 || opcion2 > 2);
            } else if (s3 == true && opcion == 3) {
                
                System.out.println("\nSe sobreescribirán los datos guardados\n");
                System.out.println("1- Sí");
                System.out.println("2- No");
                System.out.print("\n¿Deseas Continuar?: ");
                
                do {
                    opcion2 = Integer.parseInt(tec.nextLine());
                    
                    if (opcion2 == 1) {
                    salir = true;
                }
                    
                } while (opcion2 < 1 || opcion2 > 2);
            } else {
                
                salir = true;
                
            }
        } while (salir == false);
        
        return opcion;
    }
    
    /*RELLENAR CON NUM*/
    public static int[][] ponerNum(int[][] sudoku, int[][] bloq, String junto) {
        
        String letra = "";
        int col, fil;
        boolean bloqueado = false;
        boolean comprobar = false;
        int num;
            
            num = Integer.parseInt(junto.charAt(0) + "");
            letra = junto.charAt(2) + "";
            col = traductor(letra);
            fil = Integer.parseInt(junto.charAt(3) + "");
            fil = fil - 1;
            
            bloqueado = bloqueo(bloq, fil, col);
            comprobar = comprobar(sudoku, num, fil, col);
        
        if (bloqueado == false && comprobar == false) {
         
            sudoku[fil][col] = num;
            
        } else if (bloqueado == true || comprobar == true) {
            
            System.out.println("\nEse número no se puede poner ahí\n");
            
        }
        
        return sudoku;
    }
    
    /*PEDIR VALOR*/
    public static String pedirValor() {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce \"Guardar\" para guardar la partida, Introduce \"Salir\" para salir del juego, \nPara jugar, introduce el número que quieres con la dirección de celda que quieres, ejemplo: 4 A2");
        System.out.print("Nº y Celda: ");
        
        String junto = tec.nextLine();

        return junto;
    }
    
    /*GUARDAR*/
    public static void guardar(int[][] sudoku) {
        Scanner tec = new Scanner(System.in);
        
        FileWriter fw;
        BufferedWriter bw;
        String cadena;
        String fichero = "";
        int opcion;
        
        opcion = menuGuardado();
        System.out.println("");
        
        if (opcion == 1) {
            
            fichero = "save1.txt";
            
        } else if (opcion == 2) {
            
            fichero = "save2.txt";
            
        } else if (opcion == 3) {
            
            fichero = "save3.txt";
            
        }
        
        try {
            
            fw = new FileWriter(".\\data\\saves\\"+fichero);
            bw = new BufferedWriter(fw);
            
            for (int i = 0; i < sudoku.length; i++) {
                
                cadena = "";
                
                for (int j = 0; j < sudoku[i].length; j++) {
                    
                    cadena = cadena + sudoku[i][j] + " ";
                    
                }
                
                bw.write(cadena + "\n");
                
            }
            
            bw.close();
            
        } catch (Exception e) {
            
            System.out.println("Error de Escritura en el fichero");
            System.out.println(e.getMessage());
            
        }
        
    }
    
    /*JUGAR*/
    public static void jugar(int[][] sudoku, int[][] bloq) {
        
        boolean lleno;
        boolean salir = false;
        String cad;
        
         do {
            
            print(sudoku);
            lleno = comprobar(sudoku);
            cad = pedirValor();
            
                if (cad.charAt(0) == '1' || cad.charAt(0) == '2' || cad.charAt(0) == '3' || cad.charAt(0) == '4' || cad.charAt(0) == '5' || cad.charAt(0) == '6' || cad.charAt(0) == '7' || cad.charAt(0) == '8' || cad.charAt(0) == '9') {
                    
                    sudoku = ponerNum(sudoku, bloq, cad);
                    
                } else if (cad.equalsIgnoreCase("Guardar")){ 
                
                    guardar(sudoku);
                
                } else if (cad.equalsIgnoreCase("Salir")) {
                    
                    salir = true;
                    
                }
            
             if (lleno == true) {
                 
                 System.out.println("\nFELICIDADES!!");
                 
             }
            
        } while (lleno == false && salir == false);
        
    }
    
    /*PROGRAMA PRINCIPAL*/
    public static void main(String[] args) {
        
        int opcion = 0,dific = 2;
        double num;
        int[][] sudoku = new int[9][9];
        int[][] bloq;
        
        do {
        
            opcion = menu();
            
        if (opcion == 1) {
            
           sudoku = start();
           sudoku = aleatorios(sudoku,dific);
           bloq = bloq(sudoku, dific);
           jugar(sudoku, bloq);
            
        } else if (opcion == 2) {
        
            sudoku = cargar();
            bloq = bloq(sudoku, dific);
            jugar(sudoku, bloq);
        
            } else if (opcion == 3) {
        
              dific = dif();
        
                }
        } while (opcion != 4);
       
        System.out.println("\nGRACIAS POR JUGAR!!");
    }
    
}
