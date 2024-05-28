
class Lista:
    #Metódos e atributos do objeto lista

    def __init__(self):
        self.itens = []

    def obterLista(self):
        return self.itens

    def mostrarLista(self):

        for item in self.itens:
            cont = 0
            cont += 1
            print(cont,"  ",item)
            
    def limpaLista(self):
        self.itens.clear()
