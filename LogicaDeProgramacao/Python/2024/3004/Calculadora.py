"""
ATIVIDADE feita com professor
Criação de uma calculadora utilizando funções.
-Soma
-Subtração
-Multiplicação
-Divisão
DATA:30/04

import sys
from os import system


def Soma(n1,n2):
    conta = n1+n2
    return conta
def Subtração(n1,n2):
    conta = n1-n2
    return conta
def Multiplicacao(n1,n2):
    conta = n1*n2
    return conta
def Divisao(n1,n2):
    conta = n1/n2
    return conta

#"função main"
if __name__ == '__main__':

    print('Escolha: \n')

    print('+ \n')
    print('- \n')
    print('* \n')
    print('/ \n')

    op = input("Digite sua escolha: ")
    valorUm = float(input("Digite o primeiro numero: "))
    valorDois = float(input("Digite o segundo numero: "))

    system("cls")

    if op == '+':
        print("A soma de ", valorUm, " e ", valorDois, "resulta em ", Soma(valorUm,valorDois))
    elif op == '-':
        print("O subtrair de ", valorUm, " e ", valorDois, "resulta em ", Subtração(valorUm,valorDois))
    elif op == '*':
        print("A multiplicação de ", valorUm, " e ", valorDois, "resulta em ", Multiplicacao(valorUm,valorDois))
    elif op == '/':
        print("A divisão de ", valorUm, " e ", valorDois, "resulta em ", Divisao(valorUm,valorDois))
    else:
        print("\nOpção invalida\n")
        sys.exit()

"""
"""
Parte 2 - Desafio
Crie duas funções reestruturando: 
->função entrada() - função que recebe os valores 
->função menu() - função que criar um menu de operações

DATA:30/04
AUTOR:JHENIFER

"""

import sys
from os import system


def Soma(n1,n2):
    conta = n1+n2
    return conta
def Subtração(n1,n2):
    conta = n1-n2
    return conta
def Multiplicacao(n1,n2):
    conta = n1*n2
    return conta
def Divisao(n1,n2):
    conta = n1/n2
    return conta

def Menu(valores):

    op = input("Digite sua escolha: ")
    if op == '+':
        res = Soma(valores[0],valores[1])
        return "Soma",res
    elif op == '-':
        res = Subtração(valores[1],valores[2])
        return "Subtração",res
    elif op == '*':
        res = Multiplicacao(valores[1],valores[2])
        return "Multiplicação",res
    elif op == '/':
        res = Divisao(valores[1],valores[2])
        return "Divisão",res
    else:
        return 0

def Entrada():
    valorUm = float(input("Digite o primeiro numero: "))
    valorDois = float(input("Digite o segundo numero: "))
    valoresDigitados = [valorUm,valorDois]
    return valoresDigitados
    
#"função main"
if __name__ == '__main__':

    print('Escolha: \n')

    print('+ \n')
    print('- \n')
    print('* \n')
    print('/ \n')

    result = Menu(Entrada())
    system("cls")

    if(result == 0 ):
        print("\nOpção invalida\n")
        sys.exit()
    else:
        print("A(o)",result[0],"deu: ",result[1])






