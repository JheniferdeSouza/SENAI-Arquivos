"""
Atividade de Unicode
Crie um programa que ao digitar uma frase, será criado uma moldura ao redor da frase.
DATA
09/04
AUTOR
Jhenifer
"""

bar = '\u2588'
frase = input("Digite uma bela frase! \n")
tafrase = len(frase)


for l in range(0,3):
    if l == 1:
        for c in range (0, tafrase):
            if c == 0 or c == 2 :
                print(bar, end='')
            elif c == 1:
                print(frase , end='')
        print("\n")
    else:
        for c in range(0,tafrase+4):
            print(bar, end = '')    
        print("\n")