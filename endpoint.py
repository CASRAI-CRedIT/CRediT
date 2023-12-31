import requests

# Data to be sent
data = {'text': 'Your text here'}

# POST request
response = requests.post('https://tools.casrai.org/generate-metadata', json=data)
print(response.text)
