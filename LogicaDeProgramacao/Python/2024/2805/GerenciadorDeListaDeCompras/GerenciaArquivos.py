import os

def carregarArquivo():
    print("oi")
def salvaArquivo(caminho_do_arquivo,Lista):
    isFree = 0
    count = 0
    #while isFree == 0:
    nome_da_pasta = 'Listas'
    nome_do_arquivo = 'Lista'
    formato = '.txt'
    caminho_da_pasta = caminho_do_arquivo +'/'+ nome_da_pasta #+ "Lista" + str(count) +  ".txt"
    #print(caminho_da_pasta)

    #consulta se a pasta existe
    if os.path.exists(caminho_da_pasta):
        #print("existe")
        #consulta se o arquivo existe pela numeração
        isExis = 0
        cont = 0
        while isExis == 0:
            if os.path.exists(caminho_da_pasta + '/'+ nome_do_arquivo + str(cont)+ formato):
                print("existe")
                cont += 1
            else:
            #Se não criar arquivo
            #print("Não existe")
                #with open(caminho_da_pasta + '/'+ nome_do_arquivo + str(cont) +formato, "w") as arquivoBuff:
                    #arquivoBuff.write("")
                arquivoBuff = open(caminho_da_pasta + '/'+ nome_do_arquivo + str(cont) +formato, "w")
                gravar_no_arquivo(arquivoBuff, Lista)
                arquivoBuff.close()
                isExis = 1

    else:
        #Se não criar uma nova na diretória passada
        print("Não existe")
        os.mkdir(caminho_da_pasta)
        """
        ArquivoBuff = open("Lista.txt", "w")
        ArquivoBuff.write("Conteúdo do arquivo")
        ArquivoBuff.close()
    
        """


def gravar_no_arquivo(arquivoBuff, Lista):
    for item in Lista.itens:
        arquivoBuff.write(item)

def obter_diretoria_atual():
    diretorio_atual = os.getcwd()
    diretorio, arquivo = os.path.split(__file__)
    return diretorio


