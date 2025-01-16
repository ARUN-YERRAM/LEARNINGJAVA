#Design and implement LSTM model with tensorflow / keras and check accuracy.

import numpy as np
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Embedding, LSTM, Dense, Dropout
from tensorflow.keras.datasets import imdb
from tensorflow.keras.preprocessing.sequence import pad_sequences
# Load the IMDB dataset
num_words = 2000
(X_train, y_train), (X_test, y_test) = imdb.load_data(num_words=num_words)
# Preprocessing: Pad sequences
max_review_length = 250
X_train = pad_sequences(X_train, maxlen=max_review_length)
X_test = pad_sequences(X_test, maxlen=max_review_length)
# Define the model
embedding_vector_length = 32
model = Sequential()
model.add(Embedding(num_words, embedding_vector_length,
input_length=max_review_length))
model.add(Dropout(0.2))
model.add(LSTM(32))
model.add(Dense(256, activation='relu'))
model.add(Dropout(0.2))
model.add(Dense(1, activation='sigmoid'))
# Compile the model
model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])
# Fit the model

model.fit(X_train, y_train, validation_data=(X_test, y_test), epochs=10, batch_size=32)
# Evaluate the model
accuracy = model.evaluate(X_test, y_test, verbose=2)[1]
print(f"Test Accuracy: {accuracy:.4f}")