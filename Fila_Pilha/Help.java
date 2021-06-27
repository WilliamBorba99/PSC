package Fila_Pilha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Help {
	
	public static void apresenta (String prTexto) {
		 System.out.println(prTexto);

    }

    public static String recebeString () {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }

    public static int recebeInteiro () {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }
    public static float recebeFloat () {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextFloat();
    }

    public static String ordinal (int prInteiro) {

        return switch (prInteiro) {

            case 1 -> "primeiro";

            case 2 -> "segundo";

            case 3 -> "terceiro";

            case 4 -> "quarto";

            case 5 -> "quinto";

            case 6 -> "sexto";

            case 7 -> "sétimo";

            case 8 -> "oitavo";

            case 9 -> "nono";

            case 10 -> "décimo";

            default -> "não definido";

        };

    }

    public static List<?> converteObjetoParaLista(Object prObjeto) {

        List<?> aLista = new ArrayList<>();

        if (prObjeto.getClass().isArray())

            aLista = Arrays.asList((Object[])prObjeto);

        else if (prObjeto instanceof Collection)

            aLista = new ArrayList<>((Collection<?>)prObjeto);

        return aLista;
		
	}

}
