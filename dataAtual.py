from datetime import datetime

now = datetime.now()
mes  = {1: 'Janeiro', 2: 'Feveiro', 3: 'Março', 4: 'Abril', 5: 'Maio', 6: 'Junho', 7: 'Julho', 8: 'Agosto',
        9: 'Setemrbo', 10: 'Outubro', 11: 'Novembro', 12: 'Dezembro'}

def dataAtual():
    string = ""
    string += str(now.day) + " de "
    string += mes.get(now.month) + " de "
    string += str(now.year)
    return string
