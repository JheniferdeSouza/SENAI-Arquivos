#Conjunto de funções que interagir com cada item da lista

def adicionaNaLista(item,lista):
    lista.append(item)
    return lista

def buscaNaLista(item,lista):
    i = lista.index(item)
    return i

def removeNaLista(item,lista):
    index = buscaNaLista(item,lista)
    del(lista[index])
    return lista