#LISTA DE EXERCICIO 3 - LOOPING
#DATA
#09/04/2024
#
#ALUNO
#JHENIFER

#EXERCICIO 1
"""
Para o exercício do ParImpar, adicionar código para ao final da execução do 
programa, perguntando se o usuário deseja continuar, se afirmativo, repetir o 
código.

comando = 's'
while comando == 's' :
    #Código
    numero = int(input("Digite um numero decimal: "))
    if numero % 2 == 0:
        print("O numero", numero, "é par")
    else:
        print("O numero", numero, "é impar")

    #Validação
    comando = input("Deseja continua? s-sim ou n-não \n").lower()
    if comando != 's' and comando != 'n' :
        print("Digite um comando valido!")
        comando ='s'

"""

#EXERCICIO 2        
"""
Uma tela em modo texto que simule a autenticação no sistema. Deverá ser 
solicitado login e senha. Se o usuário informar seus dados corretamente, uma 
mensagem de boas-vindas deverá ser exibida, caso contrário, este somente
poderá errar três vezes.

print("Sejam bem vindo ao sistema da lojinha do zé")
print("|-----------------------------------------|")
print("||                 MENU                  ||")
print("|-----------------------------------------|")
print("|COMANDO  ||  FUNÇÃO                     ||")
print("|1        ||Abre o menu                  ||")
print("|2        ||Cadastra um usuario          ||")
print("|3        ||Excluir um usuario           ||")
print("|4        ||Logar um usuario             ||")
print("|-----------------------------------------|")
comando = input("| Digite o comando:                       | \n")
print("|-----------------------------------------|")

if comando >= 1 or comando <= 4:
    if comando == 1 :
        
else:
    print("Error: Comando invalido ! Por favor digite um comando que esteja na lista")



usuarioAdm = "ademar"
senhaAdm = "1234"

for t in range(3,0,-1):
    usuario = input("Digite seu login : \n")
    senha = input("Digite sua senha: \n")

    if usuario == usuarioAdm :
        if senha == senhaAdm :
            print("Login feito com sucesso")
    else :
        print("Error: Credenciais invalidas")
        if t-1 == 0:
            print("Tentativa de entrada bloqueado! Sai intruso")
"""

#EXERCICIO 3
"""
Calcula a potência para uma base e expoente qualquer inteiro positivo. 
● x**0 = 1, sendo x ! 0
● 0**0 é uma indeterminação e por convenção igual a um [usar a convenção]

base = int(input("Digite a base da potência em formato de numero decimal: "))
expoente = int(input("Digite o expoente da potência em formato de numero decimal: "))

if(expoente == 0):
    if(base != 0):
        print(f"O valor da conta deu: 1")
    else:
        print(f"O valor da conta deu: 0")
else:
    conta = base ** expoente

print(conta)
"""

#DATA:16/04

#EXERCICIO 4 e 5

"""
// Avisa qual a quantidade que o numero ira ser igual ao Euler
Algoritmo que calcula e mostra o número de Euler [e = 2,71] 
a partir de um valor inicial positivo que o usuário informar.

CONSTANTE_E = 2.71
x = float(input("Digite um numero positivo: "))
if(x >= 0):
    F = 1+(1/x)**x
    print(f"Constante de euler: {CONSTANTE_E}")
    print("De acordo com a formula a seguir substituindo com o numero informado: 1+(1/x)**x")
    print(f"O resultante é: {round(F,2)}")
else:
    print("Error: O numero deve ser positvo")

Em seguida deve ser incrementado esse valor inicial que o usuário informa, e 
repetido o processo quantas vezes este indicar.

CONSTANTE_E = 2.71
iMax = float(input("Digite quantas vezes deseja executa a operação: "))
x = float(input("Digite um numero positivo: "))
 
if(x >= 0):
    x *=iMax
    print(x)
    F = 1+(1/x)**x
    print(f"Constante de euler: {CONSTANTE_E}")
    print("De acordo com a formula a seguir substituindo com o numero informado: 1+(1/x)**x")
    print(f"O resultante é: {round(F,2)}")
else:
    print("Error: O numero deve ser positvo")
"""

#EXERCICIO 6

"""
Calcula e mostra o fatorial de um número inteiro positivo. 
Obs.: Por definição o fatorial de “zero” e “um” é igual a “um”.
Ex. 
0! = 1
1! = 1
5! = 120




"""

#EXERCICIO 7

"""
Mostra a série de Fibonacci, sendo que o usuário determinado a quantidade 
de números desta série que deve aparecer na tela.



quanti = int(input("Digite a quantidade de sequencia em decimal: "))
aInput = int(input("Digite um numero inteiro: "))
#b = 0;


a = 1
b = 1
c = 0
for i in range(1,quanti+1):
   
#Primeiro ciclo
    if i <= 2:
        print("|",aInput,"|", end ='\t')
    elif i == 3:
        b = aInput*2
        print(b)

#Segundo ciclo
    c = a + b
    a = c
    print(c)
       
 

    """ 
    
    
#Data: 23/04

#EXERCICIO 8

"""
Altera o programa anterior para mostrar após dois números da série de 
Fibonacci o número Áureo (phi = 1,618).

"""

#EXERCICIO 9

"""
Usuário digita um número inteiro maior que ‘1’ e programa informa se este é 
ou não primo.

Lógica utilizada : crivo de Eratóstenes
* 1 não é primo
* 2 ,3,5,7,11 é primo mas seus multiplicadores não.



inputNumber = int(input("Digite um numero inteiro: "))

#inputNumber == 1
estado = 0;
#Numeros primos base
primos =  [2,3,5,7,11]

while(estado == 0):
    if(inputNumber == 1):
        estado = 1
        break
    for i in range(len(primos)):
        # se o numero for igual a algum primo é primo
        if(inputNumber == primos[i]):
            estado = 1
            break
        # se o numero for divisivel por algum primo não é primo
        elif(inputNumber % primos[i] == 0):
            estado = 2
            break
        # se o numero não for divisivel por nenhum primo é primo
        elif(inputNumber % primos[i] != 0):
            estado = 1 
            break
#Documentando o resultado
if(estado == 1):
    print(f"O numero {inputNumber} é primo")
elif(estado == 2):
    print(f"O numero {inputNumber} não é primo")

"""

#EXERCICIO 10

"""
Idêntico ao anterior, porém, se o número não for primo, indicar o primeiro 
número (exceção do número 1) que este é divisível.

inputNumber = int(input("Digite um numero inteiro: "))

#inputNumber == 1
estado = 0;
divisivel = 0;
#Numeros primos base
primos =  [2,3,5,7,11]

while(estado == 0):
    if(inputNumber == 1):
        estado = 1
        break
    for i in range(len(primos)):
        # se o numero for igual a algum primo é primo
        if(inputNumber == primos[i]):
            estado = 1
            break
        # se o numero for divisivel por algum primo não é primo
        elif(inputNumber % primos[i] == 0):
            estado = 2
            divisivel = primos[i]

            break
        # se o numero não for divisivel por nenhum primo é primo
        elif(inputNumber % primos[i] != 0):
            estado = 1 
            break
#Documentando o resultado
if(estado == 1):
    print(f"O numero {inputNumber} é primo")
elif(estado == 2):
    #Adição de laço para sustenta a condição estabelecida
    print(f"O numero {inputNumber} não é primo ", end=" ")
    if(inputNumber != 1):
        print(f"e divisivel por: {divisivel}")

 """       

#EXERCICIO 11

"""
Idêntico ao anterior, porém, se o número não for primo, indicar todos os 
números pelo qual este é divisível.

inputNumber = int(input("Digite um numero inteiro: "))

#inputNumber == 1
estado = 0;
divisivel = 0;
#Numeros primos base
primos =  [2,3,5,7,11]

while(estado == 0):
    if(inputNumber == 1):
        estado = 1
        break
    for i in range(len(primos)):
        # se o numero for igual a algum primo é primo
        if(inputNumber == primos[i]):
            estado = 1
            break
        # se o numero for divisivel por algum primo não é primo
        elif(inputNumber % primos[i] == 0):
            estado = 2
            divisivel = primos[i]

            break
        # se o numero não for divisivel por nenhum primo é primo
        elif(inputNumber % primos[i] != 0):
            estado = 1 
            break
#Documentando o resultado
if(estado == 1):
    print(f"O numero {inputNumber} é primo")
elif(estado == 2):
    #Adição de laço para sustenta a condição estabelecida
    print(f"O numero {inputNumber} não é primo ", end=" ")
    if(inputNumber != 1):
        print(f"e divisivel por: {divisivel}")

"""

#EXERCICIO 12

"""
Usuário informa um número inteiro que determina a quantidade de números 
primos que devem ser listados a partir do primeiro número primo. 
Exemplo:
Informe um nº: 20 
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71 

"""

inputQuantyNumber = int(input("Digite um numero inteiro determinando a quantidade:"))
primosBase = [2,3,5,7,11]
numeros = [2,3,5,7,11]

while len(numeros) < inputQuantyNumber:
    contador = 11;
    while True:
            contador += 2
            for i in range(len(primosBase)):

                  if(contador % primosBase[i]!= 0):
                      numeros.append(contador)
                      break
            break

print(numeros)            











