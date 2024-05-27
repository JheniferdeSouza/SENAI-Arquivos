"""
Exercicios de Conhecimento - API
DATA:21/05
AUTOR:JHENIFER
"""

"""
1. Elabore um programa em Python que solicite ao usuário informar um CEP qualquer e exiba na tela informações sobre esse CEP
não no formato json. utilizando a API do ViaCEP, viacep.com e a biblioteca requests do python e modularizar.


import requests; # obter o arquivo JSON do servidor WEB 

def obtendoDados(CEP):
    #Faz uma requisição no servidor WEB e formatar em JSON
    req = requests.get(f"https://viacep.com.br/ws/{CEP}/json")
    jsonCep = req.json()
    return jsonCep


def entradaDoUsuarioCEP():
    #Obtem o CEP atrávez da entrada do teclado
    inputCEP = input("Digite o cep que deseja pesquisa(apenas numeros): ")
    return inputCEP

def ImpressãoDoResultado(CEP,jsonCEP):
    print(f'De acordo com o cep digitado: {CEP}')

    print("----------------------------------------------------------")
    print("_________________Informações Encontradas__________________")
    print("----------------------------------------------------------")

    #Busca as informações no arquivo json
    for chave in jsonCEP:
        print(f' \n {chave} = {jsonCEP[chave]} \n')

if __name__ == '__main__':
    #Gerenciamento das funções do sistema na função principal(main)
    inputCEP = entradaDoUsuarioCEP()
    jsonCEPObtained = obtendoDados(inputCEP)
    ImpressãoDoResultado(inputCEP,jsonCEPObtained)

"""


"""
2.Programa que converte dólar para real utilizando a API: AwesomeAPI, API de Cotações,  esse programa deve mostrar a taxa do
dolar e a data atual além de exibir o valor em dólar [U$] e real [R$]."

"""

from os import system
import requests

def entradaDoUsuarioValor(valueLesser) :
    #Obenha o valor em Real atrávez da entrada do teclado do usuario
    inputValue = float(input(f"Digite o valor que deseja converter( Só numeros por favor): {valueLesser}$"))
    return inputValue

def obtendoDadosExternos(valueGreater,valueLesser):
    #Faz uma requisição no servidor WEB e formatar em JSON
    req = requests.get(f"https://economia.awesomeapi.com.br/last/{valueGreater}-{valueLesser}")
    jsonConversion = req.json()
    return jsonConversion

def CalculoDeConversao(jsonConversion,valueInput,valueGreater, valueLesser):
    input(jsonConversion)
    valueObtained = float(jsonConversion[valueGreater+valueLesser]['high'])
    valueConverted = valueObtained * valueInput
    return valueConverted

def ImpressaoDoResultado(valueConvert, valueInput, valueGreater, valueLesser):
    system('cls')
    print(f'valor a ser convertido:{valueGreater}${round(valueInput,2)} \n')
    print(f'Valor convertido:{valueLesser}${round(valueConverted,2)} \n')

if __name__ == '__main__':
    inputValue = entradaDoUsuarioValor("R")
    arquiveJSON = obtendoDadosExternos("USD","BRL")
    valueConverted = CalculoDeConversao(arquiveJSON,inputValue,"USD","BRL")
    ImpressaoDoResultado(valueConverted,inputValue,"USD","R")






