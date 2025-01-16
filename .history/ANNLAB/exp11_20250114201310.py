
# Import necessary libraries
import tensorflow as tf
from tensorflow.keras.datasets import imdb
from tensorflow.keras.preprocessing.sequence import pad_sequences
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Embedding, GRU, Dense, Dropout
# Load the dataset
num_words = 5000 # Only consider the top 5000 words
maxlen = 250 # Maximum length of a review
(x_train, y_train), (x_test, y_test) = imdb.load_data(num_words=num_words)
# Preprocess the data by padding sequences
x_train = pad_sequences(x_train, maxlen=maxlen)
x_test = pad_sequences(x_test, maxlen=maxlen)
# Define the GRU model
embedding_vector_length = 32
model = Sequential([
Embedding(input_dim=num_words, output_dim=embedding_vector_length,
input_length=maxlen),
Dropout(0.2),
GRU(32),
Dense(256, activation='relu'),
Dropout(0.2),
Dense(1, activation='sigmoid')
])

# Compile the model
model.compile(optimizer='adam', loss='binary_crossentropy', metrics=['accuracy'])


# Train the model
history = model.fit(
x_train, y_train,
validation_data=(x_test, y_test),
epochs=10, # You can increase epochs for better results
batch_size=32
)
# Evaluate the model
test_loss, test_accuracy = model.evaluate(x_test, y_test)
print(f"Test Accuracy: {test_accuracy:.4f}")