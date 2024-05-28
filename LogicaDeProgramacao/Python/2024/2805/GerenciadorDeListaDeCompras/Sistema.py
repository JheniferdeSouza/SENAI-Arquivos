from InteracaoItem import *
from InteracaoLista import *

def main():

    classLista = Lista()
    classLista.itens = [2, 3, 4]
    
    item = 4;

    print("oi")
    classLista.mostrarLista()
    
    print("oi")
    classLista.itens = adicionaNaLista(item,classLista.itens)
    
    classLista.itens = removeNaLista(3,classLista.itens)

    classLista.mostrarLista()




if __name__ == '__main__':
    main()
