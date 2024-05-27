"""
ATIVIDADES
DATA:07/05
AUTOR:JHENIFER

Elabore um programa em Python que gere uma lista com dez números inteiros e aleatórios e 
exiba na tela o maior e menor número desta lista.

"""

from random import randint

def geradorDeListaAleatorios(quantidadeDeNumeros):
    auxLista = []
    print("Lista gerada [", end="")
    for i in range(1,quantidadeDeNumeros+1):
        auxLista.append(randint(0,quantidadeDeNumeros))
        print( "," , auxLista[i-1], end="")
    print("]")
    return auxLista

def obterMaiorOuMenorNumeroDaLista(listaDesejada,opcao):
    listaDesejada.sort()
    if opcao == 0: 
        return listaDesejada[-1]
    elif opcao == 1:
        return listaDesejada[0]

def obterOMenorNumeroDaLista(listaDesejada):
    auxLista = listaDesejada.reverse()
    return auxLista[0]
if __name__ == '__main__' :
    lista = geradorDeListaAleatorios(10)
    maiornumero = obterMaiorOuMenorNumeroDaLista(lista,0)
    menornumero = obterMaiorOuMenorNumeroDaLista(lista,1)
    print(f"O menor numero da lista: {menornumero} e o maior numero da lista: {maiornumero}")

