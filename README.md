# Simple Pockemon API - SPA

Since this is for demostrative purpuses only the pokemon served will be scraped from 'pokeapi.co' and stored in a file.
This api has 2 endpoints:
 - GET /pokemon
 - GET /pokemon/:no

The pokemon list scraped will be composed by the first 150 pokemons returned by the https://pokeapi.co/api/v2/pokemon API. To facilitate the automation I ship a simple py file that can update the resource file. In order to do so you will need to navigate in the root of the project and run:
```
pip install -r requirements.txt
python updateResource.py
```
