import os 
from flask import flask

app = Flask(__name__)

@app.route("_")
def main():
  return "welcome flask user";

app.run(host="0.0.0.0",port=8080);


