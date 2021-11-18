from urllib.request import urlopen
import json;

with open('requestf.json') as fd:
    data = json.load(fd)

entier = data['entier']
chaine = data['chaine']
nb = 0

for c in ['a','e','i','o','u','y']:
    if c in chaine:
        nb += 1

dicta = {'return': nb==entier}

with open('answerf.json', 'w') as fa:
    json.dump(dicta, fa, indent=2)