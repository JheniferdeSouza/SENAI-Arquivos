"""
ATIVIDADE feita com professor
Modificação do código anterior utilizando funções
DATA:30/04

"""

from os import system
system("cls")#system comando do sistema/terminal
ch = '\u2588'

def barra(tam_frase):
    ch = '\u2588'
    for i in range(0,tam_frase+4):
        print(f'{ch}', end='')
def entrada():
    frase = input('Digite uma frase:')
    return frase

# regex
if __name__ == '__main__':
    barra(len(entrada()))
    print(f'\n {ch} {entrada()} {ch}')
    barra(len(entrada()))