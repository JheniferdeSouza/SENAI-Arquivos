"""Exercicio feito com ajuda do professor
Faça uma requisição em uma API de CEP chamada VIACEP

*necessario instalar a biblioteca request

"""

import requests 
cep = input("Digite seu cep(só os numeros): ") # pedir o cep ao usuario
req = requests.get(f"https://viacep.com.br/ws/{cep}/json/") # faz a requisição na API
result = req.json() # converter a resposta recebida em json
print(f'estado da resposta:{req} \nresposta adquirida:{result}') # Printa o resultado
for chave in result: # mostrar o resultado de forma mais organizada
    print(f'{chave} : {result[chave]}')
