""""
Atividade - Repetição de laços
1.Elabore um programa em python que solicite ao usuário um número inteiro maior ou igual a zero,
calcule e exiba a fatorial desse número.
2.Faça uma melhoria que ao digitar numero negativo, será pedido um novo numero até digitar um numero valido.
LÓGICA
Foi feito uma divisão em partes de cada operação de multiplicação na formula de fatoração.
*Lógica utilizada: a fatoração, podemos dividi-la em parte, porque a fatoração é nada menos que, o numero anterior vezes o próximo numero da ordem ordinária.
*if utilizado para validar se o numero digitado é maior que zero
*for utiilizado seguindo a lógica que de 1 até o numero digitado, será feito a multiplicação entre o resultado anterior ou 1 caso não tenha vezes o indice atual do for.

UTILITARIOS
input()
for
if e Else
int()

DATA
02/04/2024

AUTOR 
Jhenifer

"""

numero = int(input("Digite um numero que deseja ser fatorado: \n"))

aux = 1
est = True

while est == True:
    if numero > 0 :
        print(f"!{numero} = 0 x")
        for y in range(1,numero+1):
            aux = aux * y
            print(f" x {y} " )
        print(f"=  {aux}")
        est = False 
    else:
        print("Error: Numero não aceito pois é menor que zero. Por favor Digite um numero valido!\n")
        numero = int(input("Digite um novo numero que deseja ser fatorado: \n"))



