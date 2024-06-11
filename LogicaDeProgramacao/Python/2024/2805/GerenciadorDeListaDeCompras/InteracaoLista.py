
class Lista:
    #Metódos e atributos do objeto lista

    def __init__(self):
        #Inicia com um parametro de lista vazia
        self.itens = []

    def obter_lista(self):
        #Retorna uma lista com os itens
        return self.itens

    def mostrar_lista(self):
        #É passado pelos itens da lista, numerado pelo contador
        cont = 0
        for item in self.itens:
            cont += 1
            print(cont,"  ",item)
            
    def limpa_lista(self):
        #Método nativa que limpa
        self.itens.clear()
        
    
  
