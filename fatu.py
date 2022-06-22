import json


with open('dados.json','r') as f:
    obj = json.load(f)

    fatu = []
    for i in obj:
        fatu.append(i['faturamento'])

    print('O menor valor de faturamento ocorrido em um dia do mês min: {}'.format(min(fatu)))
    print('O maior valor de faturamento ocorrido em um dia do mês max: {}'.format(max(fatu)))
    print('Número de dias no mês em que o valor de faturamento diário foi superior à média mensal maxima: {}'.format(fatu.count(max(fatu))))
    print('Número de dias no mês em que o valor de faturamento diário foi inferior à média mensal minima: {}'.format(fatu.count(min(fatu))))
    print('Média mensal de faturamento: {}'.format(sum(fatu)/len(fatu)))
    print('Média diária de faturamento: {}'.format(sum(fatu)/len(fatu)/30))