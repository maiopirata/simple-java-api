# Simple Pockemon API - SPA

Since this is for demostrative purpuses only the pokemon served will be scraped from 'pokeapi.co' and stored in a file.
This api has 2 endpoints:
 - GET /pokemon
 - GET /pokemon/:no

The pokemon list scraped will be composed by the first 150 pokemons returned by the https://pokeapi.co/api/v2/pokemon API.

## [Optional] Update the list of pokemons
To facilitate the automation I ship a simple py file that can update the resource file. In order to do so you will need to navigate in the root of the project and run:
```
pip install -r requirements.txt
python updateResource.py
```

This script will create a resource json file "response.json" inside the Spring Boot Resource folder.

## Run the project

In order to run this project simply navigate to the root and run:
```
./gradlew bootRun
```

you will be now able to see the pokemons at the local address:
 - GET http://localhost:8080/pokemon - get the list of pokemons
 - GET http://localhost:8080/pokemon/1 - get the pokemon with the id = 1

