import tensorflow as tf;
from tensorflow.keras.models import Sequential 
from tensorflow.keras.layers import Dense,Dropout,Embedding,LSTM 
from tensorflow.keras.dataset import imdb 
from tensorflow.keras.preprocessing.sequence import pad_sequences

num_words = 2000
x_train,y_train,x_test,y_test = imdb.load_data(num_words = num_words)

a = 32
x_train = pad_sequence(x_train,maxlen = 32);
x_test = pad_sequence(x_test,maxlen = 32);

leng = 250 
model = Sequential();
model.add(Embedding(num_words,a,input_length=leng))
model.add(Dropout(0.2))
model.add(LSTM(32))
model.add(Dense(256,activation='relu'))
model.add(Dropout(0.2))
model.add(Dense(1,activation='sigmoid'))

model.compile(loss='binary_crossentropy',optimizer='adam',metrics=['accuracy'])

model.fit(x_train,y_train,validation_data= [x_test,y_test],epochs=10,batch_size=32)

loss , accuracy =  model.evaluate(x_test,y_test,verbose=2)[0]

print("Test Accuracy :"loss:.4f)






