"""
DESAFIO
DATA:14/05
AUTOR:Jhenifer
Crie um dicionário com os seguintes parâmetros: nome, peso, casado, idade, tipo sanguíneo.


from os import system

#Obtem os dados do usuario e inserir no dicionario
dados = { }

dados["nome"] = input("Digite seu nome: ")
dados["idade"] = int(input("Digite sua idade: "))
dados["peso"] = float(input("Digite seu peso: "))
dados["tipo_sanguineo"] = input("Digite seu tipo sanguineo")
dados["casado"] = bool(input("Digite se voce é casado( True - sim  e False - não)"))

system('cls')

print(f"Dados disponiveis") 

#Mostrar os dados coletados
for k in dados.keys():
    
    print(f'{k} = {dados[k]}')
"""

"""
Exercicio feito com professor
Crei as notas de geografia e matematica de dois alunos: juca e jeca

notas = { 'Juca': {'mat' : 10, 'geo' : 8 },
          'Jeca' : {'mat' : 10, 'geo' : 10} 
        }

print(f'notas de Juca: {notas["Juca"]} ')

print(f'notas de Jeca: {notas["Jeca"]}')

#Exercicio
#Crie a media de cada matéria.

media_mat = (notas["Jeca"]["mat"] + notas["Juca"]["mat"]) / 2
media_geo = (notas["Jeca"]["geo"] + notas["Juca"]["geo"]) / 2

print(f'{media_mat}')
print(f'{media_geo}')

"""


