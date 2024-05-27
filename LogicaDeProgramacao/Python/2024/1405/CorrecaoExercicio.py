"""Correção feita pelo professor dos exercicios feito na aula passada
DATA:14/05
"""

"""
Exercicio 

Elabore um programa em Python que gere uma lista com dez números inteiros e aleatórios e 
exiba na tela o maior e menor número desta lista.

"""

from random import randint as rnd # Importa a biblioteca randomica e nomeia com rnd
from os import system # Importa biblioteca sistema


def minimo(lista):
  # obtem o menor numero da lista
  #Escolha somente um Método tirando as aspas

  """
  Método 1
  Usando função proprias da lista
  lista.sort()
  return lista[0];
  """

  """
  Método 2
  Usando função propria da lista
  lista.reverse()
  return lista[-1];
  """

  """
  Método 3
  Criando um código mais universal(lógica compativel com uma quantidade maior de linguagem)
  
  min = lista[0]
  for i in lista:
     if(min > i):
        min = i
  return min
  """


  

def maximo(lista):
   # obtem o maior numero da lista
   #Escolha somente um Método tirando as aspas
   
   """
  Método 1
  Usando list
  lista.sort()
  return lista[-1];
  """
   
   """
  Método 2
  Usando list
  lista.reverse()
  return lista[0];
  """
   
   """
  Método 3
  Criando um código mais universal(lógica compativel com uma quantidade maior de linguagem)
  
  max = lista[0]
  for i in lista:
     if(max < i):
        max = i
  return max
  """

def exibir_na_tela(l,min,max):
   #Exibir na tela os parametros recebidos.
   system('cls') # Dar o comando no sistema de limpa o terminal
   #Conjunto de impressão de tela
   print(l)
   print(f'Menor número: {min}')
   print(f'Maior número: {max}')


if __name__ =="__main__": # Chama a função main 
   lista = [rnd(-500,1000) for i in range(10)] # criar uma lista aleatória usando  list comprehension
   menor = minimo(lista) # Chama uma função e guarda o valor retornado
   maior = maximo(lista) # Chama uma função e guarda o valor retornado
   exibir_na_tela(lista) # Chama uma função

