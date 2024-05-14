"""
ATIVIDADE FEITA COM O PROFESSOR
Crie um programa que calcule a média utilizando lista
DATA:07/05
"""

notas = [7,5,4,10]
media = 0

notas.append(int(input("Digite uma nota:")))

for nota in notas:
    media += nota;

print(f"A média do aluno atual: {media/len(notas)}")