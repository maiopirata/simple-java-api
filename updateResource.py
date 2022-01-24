import requests
import json

noOfPokemon = { 'limit': 150 }
jsonResponse = requests.get('https://pokeapi.co/api/v2/pokemon', params=noOfPokemon).json()

with open('resources/response.json', 'w') as jsonFile:
    json.dump(jsonResponse, jsonFile)
