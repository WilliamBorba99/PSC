package Fila_Pilha;

import java.util.ArrayList;

public class Pilha {

	    ArrayList<Object> aPilha = new ArrayList<>();

	    public static void main(String [] args) {

	        Pilha pilha = new Pilha();

	        boolean sair = false;

	        do {

	            Help.apresenta(pilha.menu());

	            switch (Help.recebeInteiro()) {

	                case 1 -> {

	                    if (pilha.getaPilha().size() != 10)
	                        pilha.adicionaCxPilha(pilha.adicionarCaixa());
	                    else
	                        sair = true;

	                }

	                case 2 -> pilha.removeCaixaPilha(pilha.getaPilha());

	                case 3 -> sair = true;
	            }

	        } while (!sair);

	    }
	    /**
	     * Apresenta o menu principal
	     */
	    public String menu() {

	        return """
	                Menu Principal \r
	                1. Adicione uma caixa a pilha \r
	                2. Remover a caixa da pilha \r
	                3. Sair
	                """;

	    }
	    public void adicionaCxPilha(ArrayList<Object> prADadoCaixa) {

	        this.aPilha.add(prADadoCaixa);

	    }

	    public ArrayList<Object> getaPilha() {

	        return this.aPilha;

	    }

	    public void removeCxPilha(int prIndex) {

	        this.aPilha.remove(prIndex);

	    }

	    /**
	     * Recebe as informações da caixa
	     */
	    public ArrayList<Object> adicionarCaixa() {

	        ArrayList<Object> aDadoCaixa = new ArrayList<>();

	        int identificadorCaixa = getaPilha().size() + 1;

	        aDadoCaixa.add(identificadorCaixa);

	        Help.apresenta("Informe a altura da caixa:");
	        aDadoCaixa.add(Help.recebeFloat());

	        Help.apresenta("Informe a largura da caixa:");
	        aDadoCaixa.add(Help.recebeFloat());

	        Help.apresenta("Informe a profundidade da caixa:");
	        aDadoCaixa.add(Help.recebeFloat());

	        Help.apresenta("O conteudo é frágil? (Sim/Não):");
	        aDadoCaixa.add(Help.recebeString());

	        aDadoCaixa.add("CX" + identificadorCaixa);

	        return aDadoCaixa;

	    }

	    /*
	     * Remove uma caixa da pilha
	     */
	    public void removeCaixaPilha(ArrayList<Object> prAPilha) {

	        int contador = 1;

	        Help.apresenta("Informe a caixa que deseja remover");

	        for (Object aDadoPilha: prAPilha) {

	            ArrayList<Object> aCaixa = new ArrayList<>(Help.converteObjetoParaLista(aDadoPilha));
	            Help.apresenta(contador + ". " + aCaixa.get(5));

	            contador++;

	        }

	        int escolha = Help.recebeInteiro();

	        ArrayList<?> aCaixa = (ArrayList<?>) prAPilha.get(escolha - 1);
	        removeCxPilha(escolha - 1);

	        String retorno;

	        retorno = "Dados da caixa " + aCaixa.get(4) + "\r\n";
	        retorno+= "Altura: " + aCaixa.get(1) + "\r\n";
	        retorno+= "Largura: " + aCaixa.get(2) + "\r\n";
	        retorno+= "Profundidade: " + aCaixa.get(3) + "\r\n";
	        retorno+= "É frágil: " + aCaixa.get(4) + "\r\n";

	        Help.apresenta(retorno);

	    } 

	  }

