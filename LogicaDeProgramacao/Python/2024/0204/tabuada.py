"""
Atividade em conjunto feito com professor
Criação de um algoritmo que calcular e printar a tabuada de um numero digitado pelo usuario.


UTILITARIOS
Input()
int()
for()

DATA
02/04/2024

"""



numeroDigitado = int(input('Digite qual numero você deseja ter na tabuadas?\n'))

for i in range(11):
    print(f"{numeroDigitado} x {i} = {numeroDigitado*i}")
