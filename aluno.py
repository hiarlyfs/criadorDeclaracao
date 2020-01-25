
def proximaSerie(str):
    proximaSerie = {'PRÉ I': 'PRÉ II', 'PRÉ II': '1º Ano do Ensino Fundamental I', '1º Ano do Ensino Fundamental I': '2º Ano do Ensino Fundamental I',
                    '2º Ano do Ensino Fundamental I': '3º Ano do Ensino Fundamental I', '3º Ano do Ensino Fundamental I': '4º Ano do Ensino Fundamental I',
                    '4º Ano do Ensino Fundamental I': '5º Ano do Ensino Fundamental I', '5º Ano do Ensino Fundamental I': '6º Ano do Ensino Fundamental II'}

    return proximaSerie.get(str)


def serieAtual(opcao):
    serie = {1: 'PRÉ I', 2: 'PRÉ II', 3: '1º Ano do Ensino Fundamental I', 4: '2º Ano do Ensino Fundamental I',5: '3º Ano do Ensino Fundamental I', 
            6: '4º Ano do Ensino Fundamental I', 7: '5º Ano do Ensino Fundamental I'}

    return serie.get(opcao)