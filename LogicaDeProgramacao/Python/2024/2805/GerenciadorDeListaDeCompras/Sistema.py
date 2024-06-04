from InteracaoLista import *
from InteracaoItem import *
from Utilitarios import MenuPrincipal

def main():


    classLista = Lista()
    classLista.itens = [2,3,4]

    classMenu = MenuPrincipal()

    opcoes = classMenu.obter_menu_principal()

    for index in range(len(opcoes)):
        print(index+1,".", opcoes[index])
    
    classMenu.aciona_opção_escolhida(1, classLista)

    #classLista.itens = [2, 3, 4]
    
    #item = 4;

    #print("oi")
    #classLista.mostrarLista()
    
    #print("oi")
    #classLista.itens = adicionaNaLista(item,classLista.itens)
    
    #classLista.itens = removeNaLista(3,classLista.itens)

    #classLista.mostrarLista()


if __name__ == '__main__':
    main()
