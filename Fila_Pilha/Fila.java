package Fila_Pilha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fila {

	private final ArrayList<Object> aFilaPaciente = new ArrayList<>();

	public static void main(String[] args) {

		Fila fila = new Fila();

		boolean sair = false;

		do {

			Help.apresenta(fila.menu());

			switch (Help.recebeInteiro()) {

			case 1: {

				if (fila.getaFilaPaciente().size() != 20)
					fila.adicionaPacienteFila(fila.addPaciente());
				else
					Help.apresenta("Não podem ser adicionados mais pacientes à fila");

				break;

			}

			case 2: {

				fila.atenderPaciente(fila.getaFilaPaciente());

				if (fila.getaFilaPaciente().size() > 0)
					fila.removePacienteFila(0);

				break;

			}

			case 3: {

				sair = true;

			}

			default: {

				Help.apresenta("Opção não reconhecida");

			}

			}

		} while (!sair);

	}

	/**
	 * Exibe o menu principal
	  */
	public String menu() {

		String textoMenu;

		textoMenu = "Menu Principal \r\n";
		textoMenu += "1. Incluir paciente \r\n";
		textoMenu += "2. Atender paciente \r\n";
		textoMenu += "3. Sair";

		return textoMenu;

	}
	public void adicionaPacienteFila(ArrayList<Object> prDadoPaciente) {

		this.aFilaPaciente.add(prDadoPaciente);

	}

	public void removePacienteFila(int prIndex) {

		this.aFilaPaciente.remove(prIndex);

	}

	public ArrayList<Object> getaFilaPaciente() {

		return aFilaPaciente;

	}

	/**
	 * Recebe os dados inseridos de um paciente na fila de espera
	 * 
	 * Retorna um array com os dados do usuário
	 */
	public ArrayList<Object> addPaciente() {

		ArrayList<Object> DadosDoPaciente = new ArrayList<>();

		Help.apresenta("Informe o nome do paciente:");
		DadosDoPaciente.add(Help.recebeString());

		Help.apresenta("Informe a idade do paciente:");
		DadosDoPaciente.add(Help.recebeInteiro());

		Help.apresenta("Informe uma breve descrição do atendimento: ");
		DadosDoPaciente.add(Help.recebeString());

		return DadosDoPaciente;

	}

	/**
	 * Atende o próximo paciente da fila
	 */
	public void atenderPaciente(ArrayList<Object> prAFilaPaciente) {

		if (prAFilaPaciente.size() > 0) {

			ArrayList<?> aDadoPaciente = (ArrayList<?>) prAFilaPaciente.get(0);

			String textoPaciente;

			textoPaciente = "Próximo paciente \r\n";
			textoPaciente += "Nome: " + aDadoPaciente.get(0) + " \r\n";
			textoPaciente += "Idade: " + aDadoPaciente.get(1) + " \r\n";
			textoPaciente += "Descrição: " + aDadoPaciente.get(2) + " \r\n";

			Help.apresenta(textoPaciente);

		} else {

			Help.apresenta("Não há pacientes na fila");

		}

	}
	
	

}
