from Gerenciador_de_usuarios import GerenciadorDeUsuarios
from os import system

"""
Data: 09/06/2024

Limitação:

->ele não suporta usuarios com algum dado igual
"""

classe_gerenciador_de_usuarios = GerenciadorDeUsuarios()

def main():
    isOn = 1
    while isOn != 0:
        menu_principal()
        print("Deseja sai do programa(0) ou volta para o menu principal(1)?")
        isOn = int(input("Só numeros: "))
        if isOn != 1 and isOn != 0 :
            print("opção fora do pedido, caso não digite uma opção correta será considerado que queira volta ao menu principal.")
            print("Deseja sai do programa(0) ou volta para o menu principal(1)?")
            isOn = int(input("Só numeros: "))
            system('cls')

    """
    print(classe_gerenciador_de_usuarios.busca_usuario("nome", "ana"))
    print(classe_gerenciador_de_usuarios.incluir_usuario("ana","45","gfggf"))
    print(classe_gerenciador_de_usuarios.busca_usuario("nome", "ana"))
    print(classe_gerenciador_de_usuarios.remove_usuario("nome","ana"))
    print(classe_gerenciador_de_usuarios.busca_usuario("nome", "ana"))
    """
        
def opcao_adiciona_contato(entrada_nome_do_contato):
    index = classe_gerenciador_de_usuarios.busca_usuario("nome", entrada_nome_do_contato)
    if index == -1:
        entrada_telefone_do_contato = input("Digite o telefone do contato:")
        entrada_email_do_contato = input("Digite o email do contato:")

        classe_gerenciador_de_usuarios.incluir_usuario(entrada_nome_do_contato, entrada_telefone_do_contato, entrada_email_do_contato)
    else:
        print("Contato já existe")
    
def opcao_remove_contato(entrada_nome_do_contato):
    classe_gerenciador_de_usuarios.remove_usuario("nome", entrada_nome_do_contato)

def opcao__busca_contato(entrada_nome_do_contato):
    informacoes = classe_gerenciador_de_usuarios.mostrar_usuario("nome", entrada_nome_do_contato)
    if informacoes != -1 :
        print("Dados do contato encontrado:")
        for chave in informacoes.keys():
            print(chave,":",informacoes[chave]); 
    else:
        print("contato não existe")

def escolher_opcao(entrada_opcao): 
    entrada_nome_do_contato = input("Digite o nome do contato:")
 
    if entrada_opcao == 1 :
        opcao__busca_contato(entrada_nome_do_contato)
    elif entrada_opcao == 2:
        opcao_adiciona_contato(entrada_nome_do_contato)
    elif entrada_opcao == 3:
        opcao_remove_contato(entrada_nome_do_contato)

def menu_principal():
    print("\n Bem vindo a sua agenda pessoal")
    print(" escolha sua opção abaixo \n")
    print(" \n Contato \n")
    print("1. Busca contato no sistema")
    print("2. Novo contato no sistema")
    print("3. Remover contato no sistema")
    print(" \n Agenda \n")
    print("4.Salvar uma nova agenda")
    print("5.Carregar um arquivo")
    print("6.escolha sua opção abaixo")

    escolher_opcao(int(input("Digite sua opção:(apenas numeros)")))

if __name__ == '__main__':
    main()
