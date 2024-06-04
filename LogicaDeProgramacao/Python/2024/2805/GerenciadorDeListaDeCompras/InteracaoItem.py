#Conjunto de funções que interagir com cada item da lista

def adiciona_na_lista(item,lista):
    #Adiciona o item injetado no final da lista passada
    lista.append(item)
    return lista

def busca_na_lista(item,lista):
    i = lista.index(item)
    return i

def remove_na_lista(item,lista):
    #Primeiro é feito a busca na lista com método próprio, caso seja achado é removido o item.
    index = busca_na_lista(item,lista)
    del(lista[index])
    return lista