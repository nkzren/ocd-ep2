package ocd;

public class Decodificador{
    //as duas primeiras posições determinam o ciclo de instrução executado
    //as próximas três posições determinam a operação (adição subtração, etc...)
    //a sexta posição determina se a instrução é feita na porta 1 ou 2 do IR

    private int [] adicionaUPCODE(int[] cod, int instrucao, int operacao, int porta){
      if(instrucao == 0){//adicionar ao acumulador
        //adiciona nas duas primeiras posicoes 00
      }
      if(instrucao == 1){//envia para ula
        //adiciona nas duas primeiras posicoes 01
      }
      if(instrucao == 2){//retornar valor p/ memoria
        //adiciona nas duas primeiras posicoes 10
      }
      if(instrucao == 3){//envia endereco p/ uc
        //adiciona nas duas primeiras posicoes 11
      }
      if(operacao == 0){//add
        //adiciona nas proximas tres posicoes 000
      }
      if(operacao == 1){//sub
        //adiciona nas proximas tres posicoes 001
      }
      if(operacao == 2){//mul
        //adiciona nas proximas tres posicoes 010
      }
      if(operacao == 3){//div
        //adiciona nas proximas tres posicoes 011
      }
      if(operacao == 4){//inc
        //adiciona nas proximas tres posicoes 100
      }
      if(operacao == 5){//dec
        //adiciona nas proximas tres posicoes 101
      }
      if(porta == 0){//porta 1
        //adiciona na sexta posicao 0
      }
      if(porta == 1){//porta 2
        //adiciona na sexta posicao 1
      }
      
      return cod;
      
    }
    private int [] insereEnderecos(int [] cod, String instrucao){
      //pega s.substring(4,s.indexOf(',')) e transforma em codigo
    	return cod;
      //insere codigo da posicao 7 ate 12 (seis numeros)
      //pega s.substring(s.indexOf(',')+1,s.length) e transforma em codigo
      //identifica se é string("ax") ou se é int(1,2,3)
      //insere codigo da posicao 12 ate o fim (seis numeros)
    }
    private void decodifica(String s){
        if(s.substring(0,3) == "ADD"){
            int[] codigo1 = new int[18];
            int[] codigo2 = new int[18];
            int[] codigo3 = new int[18];

            //insere o opcode do primeiro item na memória
            codigo1 = adicionaUPCODE(codigo1,0,0,0);
            codigo1 = insereEnderecos(codigo1,s);

            //insere o opcoden do segundo item na memória
            codigo2 = adicionaUPCODE(codigo2,1,0,1);
            codigo2 = insereEnderecos(codigo2,s);
            
            //insere o opcode do terceiro item na memória
            codigo3 = adicionaUPCODE(codigo3,2,0,0);
            codigo3 = insereEnderecos(codigo3,s);

            memoria.add(codigo1);
            memoria.add(codigo2);
            memoria.add(codigo3);
        }
        if(s.substring(0,3) == "SUB"){
            int[] codigo1 = new int[18];
            int[] codigo2 = new int[18];
            int[] codigo3 = new int[18];

            //insere o opcode do primeiro item na memória
            codigo1 = adicionaUPCODE(codigo1,0,1,0);
            codigo1 = insereEnderecos(codigo1,s);

            //insere o opcoden do segundo item na memória
            codigo2 = adicionaUPCODE(codigo2,1,1,1);
            codigo2 = insereEnderecos(codigo2,s);
            
            //insere o opcode do terceiro item na memória
            codigo3 = adicionaUPCODE(codigo3,2,1,0);
            codigo3 = insereEnderecos(codigo3,s);

            memoria.add(codigo1);
            memoria.add(codigo2);
            memoria.add(codigo3);
        }
        if(s.substring(0,3) == "MUL"){
            int[] codigo1 = new int[18];
            int[] codigo2 = new int[18];
            int[] codigo3 = new int[18];

            //insere o opcode do primeiro item na memória
            codigo1 = adicionaUPCODE(codigo1,0,2,0);
            codigo1 = insereEnderecos(codigo1,s);

            //insere o opcoden do segundo item na memória
            codigo2 = adicionaUPCODE(codigo2,1,2,1);
            codigo2 = insereEnderecos(codigo2,s);
            
            //insere o opcode do terceiro item na memória
            codigo3 = adicionaUPCODE(codigo3,2,2,0);
            codigo3 = insereEnderecos(codigo3,s);

            memoria.add(codigo1);
            memoria.add(codigo2);
            memoria.add(codigo3);
        }
        if(s.substring(0,3) == "DIV"){
            int[] codigo1 = new int[18];
            int[] codigo2 = new int[18];
            int[] codigo3 = new int[18];

            //insere o opcode do primeiro item na memória
            codigo1 = adicionaUPCODE(codigo1,0,3,0);
            codigo1 = insereEnderecos(codigo1,s);

            //insere o opcoden do segundo item na memória
            codigo2 = adicionaUPCODE(codigo2,1,3,1);
            codigo2 = insereEnderecos(codigo2,s);
            
            //insere o opcode do terceiro item na memória
            codigo3 = adicionaUPCODE(codigo3,2,3,0);
            codigo3 = insereEnderecos(codigo3,s);

            memoria.add(codigo1);
            memoria.add(codigo2);
            memoria.add(codigo3);
        }
        if(s.substring(0,3) == "MOV"){
            int[] codigo1 = new int[18];
            int[] codigo2 = new int[18];
            int[] codigo3 = new int[18];

            //insere o opcode do primeiro item na memória
            codigo1 = adicionaUPCODE(codigo1,0,0,0);
            codigo1 = insereEnderecos(codigo1,s);

            //insere o opcoden do segundo item na memória
            codigo2 = adicionaUPCODE(codigo2,2,0,0);
            codigo2 = insereEnderecos(codigo2,s);
            
            //insere o opcode do terceiro item na memória
            codigo3 = adicionaUPCODE(codigo3,0,0,0);
            codigo3 = insereEnderecos(codigo3,s);

            memoria.add(codigo1);
            memoria.add(codigo2);
            memoria.add(codigo3);
        }
        if(s.substring(0,3) == "INC"){
        
        }
        if(s.substring(0,3) == "DEC"){
        
        }
        if(s.substring(0,3) == "CMP"){
        
        }
        if(s.substring(0,3) == "JMP"){
        
        }
        if(s.substring(0,3) == "JPE"){
        
        }
        if(s.substring(0,3) == "JPG"){
        
        }
        if(s.substring(0,3) == "JGE"){
        
        }
        if(s.substring(0,3) == "JPL"){
        
        }
        if(s.substring(0,3) == "JLE"){
        
        }
        if(s.substring(0,3) == "JNE"){
        
        }
    }
}