from InteracaoLista import *
from Utilitarios import MenuPrincipal
from GerenciaArquivos import *

def main():
    classLista = Lista()
    classLista.itens = ["2","3","4"]
    
    mostrar_menu(classLista)

    
    
    
    """
    #Teste
    
    #Mostrar lista
    print("1.a")
    classMenu.aciona_opção_escolhida(1, classLista)

    #Adiciona na lista
    print("2.a")
    classMenu.aciona_opção_escolhida(2, classLista)
    classMenu.aciona_opção_escolhida(1, classLista)

    #Remover na lista
    print("3.a")
    classMenu.aciona_opção_escolhida(3, classLista)
    classMenu.aciona_opção_escolhida(1, classLista)

    #Limpa Lista
    print("4.a")
    classMenu.aciona_opção_escolhida(4, classLista)
    classMenu.aciona_opção_escolhida(1, classLista)

    """


def mostrar_menu(lista):
        
    isOn = 1
    while isOn == 1:


        classMenu = MenuPrincipal()
        opcoes = classMenu.obter_menu_principal()
        
        #Formata o menu e mostra na tela
        for index in range(len(opcoes)):
            print(index+1,".", opcoes[index])
            
        #Coleta os dados informado ao usuario e envia para classe
        opcao_informada = int(input("Digite a opção desejada: "))
        classMenu.aciona_opção_escolhida(opcao_informada, lista)
        salvaArquivo(obter_diretoria_atual(), lista)
        #Sai do looping
        

if __name__ == '__main__':
    main()
