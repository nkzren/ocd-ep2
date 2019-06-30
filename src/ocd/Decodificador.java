package ocd;

public class Decodificador {

	private int[] adicionaUPCODE(int[] cod, int instrucao, int operacao, int porta) {
		if (instrucao == 0) {// adicionar ao acumulador
			// adiciona nas duas primeiras posicoes 00
			setInstrucao(cod, 0, 0);
		}
		if (instrucao == 1) {// envia para ula
			// adiciona nas duas primeiras posicoes 01
			setInstrucao(cod, 0, 1);
		}
		if (instrucao == 2) {// retornar valor p/ memoria
			// adiciona nas duas primeiras posicoes 10
			setInstrucao(cod, 1, 0);
		}
		if (instrucao == 3) {// envia endereco p/ pc
			// adiciona nas duas primeiras posicoes 11
			setInstrucao(cod, 1, 1);
		}
		
		if (operacao == 0) {// add
			// adiciona nas proximas tres posicoes 000
			setOperacao(cod, 0, 0, 0);
		}
		if (operacao == 1) {// sub
			// adiciona nas proximas tres posicoes 001
			setOperacao(cod, 0, 0, 1);
		}
		if (operacao == 2) {// mul
			// adiciona nas proximas tres posicoes 010
			setOperacao(cod, 0, 1, 0);
		}
		if (operacao == 3) {// div
			// adiciona nas proximas tres posicoes 011
			setOperacao(cod, 0, 1, 1);
		}
		if (operacao == 4) {// inc
			// adiciona nas proximas tres posicoes 100
			setOperacao(cod, 1, 0, 0);
		}
		if (operacao == 5) {// dec
			// adiciona nas proximas tres posicoes 101
			setOperacao(cod, 1, 0, 1);
		}
		if (porta == 0) {// porta 1
			// adiciona na sexta posicao 0
			setPorta(cod, 0);
		}
		if (porta == 1) {// porta 2
			// adiciona na sexta posicao 1
			setPorta(cod, 1);
		}

		return cod;
	}
	
	private void setInstrucao(int[] cod, int pos1, int pos2) {
		cod[0] = pos1;
		cod[1] = pos2;
	}
	
	private void setOperacao(int[] cod, int pos1, int pos2, int pos3) {
		cod[2] = pos1;
		cod[3] = pos2;
		cod[4] = pos3;
	}
	
	private void setPorta(int[] cod, int pos1) {
		cod[5] = pos1;
	}

	private int[] insereEnderecos(int[] cod, String instrucao) {
		// insere s.substring(4,s.indexOf(',')) da posicao
		return null;
	}

}
