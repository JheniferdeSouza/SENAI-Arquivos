 


class MenuPrincipal:
    
    def __init__(self):
        self.opcoes = ["Mostrar Lista",]

    def aciona_opção_escolhida(entrada_opcoes, Lista):
        if entrada_opcoes == 1 :
            Lista.mostrarLista()
        else:
            return -1
    def obter_menu_principal(self):
        return self.opcoes
    
    def seta_opcoes_disponiveis(self,entrada_opcoes):
        for opcao in entrada_opcoes:
            self.opcoes.append(opcao)

