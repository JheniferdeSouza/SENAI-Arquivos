class GerenciadorDeUsuarios:


    def __init__(self):
        self.usuarios = []
        self.erro = -1

    def busca_usuario(self, entrada_opcao, entrada_valor_buscado):
        index = 0
        for informacoes in self.usuarios:
            if(informacoes[entrada_opcao] == entrada_valor_buscado):
                return index
            index += 1
        return self.erro
    
    def incluir_usuario(self, entrada_nome, entrada_telefone, entrada_email):
        entrada_informacoes = {"nome": entrada_nome, "telefone": entrada_telefone, "email": entrada_email }
        for informacoes in self.usuarios:
            if informacoes == entrada_informacoes:
                return self.erro
        self.usuarios.append(entrada_informacoes)
    
    def modifica_usuario(self, entrada_opcao,entrada_valor_buscado, entrada_valor_modificado):
        usuario_index = self.busca_usuario(entrada_opcao, entrada_valor_buscado)
        if usuario_index != -1:
            self.usuario[usuario_index][entrada_opcao] = entrada_valor_modificado
            return 1
        return self.erro
    
    def remove_usuario(self, entrada_opcao, entrada_valor_buscado):
        if(self.busca_usuario(entrada_opcao, entrada_valor_buscado) == -1):
            return -1
        else:
            index = 0
            for informacoes in self.usuarios:
                if informacoes[entrada_opcao] == entrada_valor_buscado:
                    del(self.usuarios[index])
                index += 1

    def mostrar_usuario(self, entrada_opcao, entrada_valor_buscado):
        index = self.busca_usuario(entrada_opcao,entrada_valor_buscado)
        if(index != self.erro):
            return self.usuarios[index]
        else:
            return self.erro
