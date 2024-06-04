
class Lista:
    #Metódos e atributos do objeto lista

    def __init__(self):
        self.itens = []

    def obter_lista(self):
        return self.itens

    def mostrar_lista(self):
        #É passado pelos itens da lista, enumerando baseado em sua posição
        for item in self.itens:
            cont = 0
            cont += 1
            print(cont,"  ",item)
            
    def limpa_lista(self):
        #Função nativa que limpa
        self.itens.clear()
