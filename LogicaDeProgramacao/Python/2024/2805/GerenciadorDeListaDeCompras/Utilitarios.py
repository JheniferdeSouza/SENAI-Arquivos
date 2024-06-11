from InteracaoItem import *

class MenuPrincipal:
    
    def __init__(self):
        self.opcoes = ["Mostrar Lista", "Inserir na Lista", "Remove lista", "Limpa Lista"]

    def aciona_opção_escolhida(self, entrada_opcoes, Lista):
        #Aqui será feito um "switch" acionando a opção escolhida de acordo com a entrada desejada.
        if entrada_opcoes == 1 :
            #Chama o método na classe lista
            Lista.mostrar_lista()
        elif entrada_opcoes == 2:
            #Pergunta o item e chama a função de adicionar
            item = input("Digite o item que deseja adicionar na lista: ")
            adiciona_na_lista(item,Lista.itens)
        elif entrada_opcoes == 3:
            item = input("Digite o item que deseja remover na lista: ")
            remove_na_lista(item,Lista.itens)
        elif entrada_opcoes == 4:
             Lista.limpa_lista()
        else:
            return -1
    def obter_menu_principal(self):
        #Retorna uma lista com as opções informadas
        return self.opcoes
    
    def inserir_opcoes_disponiveis(self,entrada_opcoes):
        #É feita o inserimento da opcão desejada na lista
        for opcao in entrada_opcoes:
            self.opcoes.append(opcao)


