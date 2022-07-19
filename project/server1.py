from io import BytesIO
from tkinter import CURRENT
from flask import Flask, render_template, send_file
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression
import pymysql

app = Flask(__name__, template_folder="templates")

lr=LinearRegression()

data = pd.read_csv(
    'https://raw.githubusercontent.com/Hyunju-Cho/javaNpython/main/mldl_work/ex0718/chap3.csv')
length = data['length'].to_numpy().reshape(-1,1)
weight = data['weight'].to_numpy()

lr.fit(length,weight)

@app.route("/")
def index():
    aa = "aaa 입니다"
    return render_template("index1.html", key1=aa)

#insert 링크 클릭할 때마다 값이 DB로 전송됨
@app.route("/insert")
def insert():
    con=pymysql.connect(host="localhost",user="root",passwd="1234",database="test",charset="utf8")
    cur=con.cursor()

    cur.execute("INSERT INTO fish (name,length,weight) values ('bream',45,650);")
    con.commit()
    con.close()

    return "aa"

@app.route("/img/<int:aa>") #예시: http://127.0.0.1:5000/img/50
def imgdown(aa):
    print(aa)
    img = BytesIO() #객체 내에 저장된 bytes 정보를 불러와 이미지로 읽어줌
    plt.scatter(length, weight)
    plt.scatter(int(aa),lr.predict([[int(aa)]]))#사용자가 입력한 숫자로 선형회귀를 통해 예측값 그래프로 나타냄
    plt.savefig(img, format="png", dpi=200)
    plt.close()
    img.seek(0)
    return send_file(img, mimetype="image/png") #그래프 띄움


app.run(debug=True)
