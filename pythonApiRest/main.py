import requests
from flask import Flask, jsonify

URL = 'http://localhost:3000/parametros'
print(URL)


x = requests.get(URL)
data = x.json()
print(x.status_code)
print("***",data)
def valor_a(data):
    val = data['a']
    return val
def valor_b(data):
    val = data['b']
    return val
def valor_c(data):
    val = data['c']
    return val
def predictor(a,b,c):
    res = (0.5*a)+(0.75*b)+c
    
    return res

def main():
    print(data)
    a=valor_a(data)
    b=valor_b(data)
    c=valor_c(data)
    oper=predictor(a,b,c)
    print(oper)
main()