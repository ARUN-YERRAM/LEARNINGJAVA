#Design and implement a simple RNN model with tensorflow / keras and check accuracy.

import numpy as np
import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import SimpleRNN, Dense
from tensorflow.keras.optimizers import RMSprop
import requests
import warnings

warnings.filterwarnings("ignore")

# Step 1: Load and Preprocess the Dataset
# Download the dataset
url = "https://www.gutenberg.org/files/11/11-0.txt"
response = requests.get(url)
text = response.text

# Preprocessing: Remove non-ASCII characters
text = ''.join([char for char in text if ord(char) < 128])

# Define constants
SEQLEN = 10  # Sequence length (number of previous characters to consider)
STEP = 1  # Step size for creating sequences

# Create character-to-index and index-to-character mappings
chars = sorted(list(set(text)))
nb_chars = len(chars)
char_to_idx = {char: idx for idx, char in enumerate(chars)}
idx_to_char = {idx: char for idx, char in enumerate(chars)}

# Create input and label sequences
inputs = []
labels = []
for i in range(0, len(text) - SEQLEN, STEP):
    inputs.append(text[i:i + SEQLEN])
    labels.append(text[i + SEQLEN])

# Vectorize inputs and labels
X = np.zeros((len(inputs), SEQLEN, nb_chars), dtype=bool)
y = np.zeros((len(inputs), nb_chars), dtype=bool)
for i, seq in enumerate(inputs):
    for t, char in enumerate(seq):
        X[i, t, char_to_idx[char]] = 1
    y[i, char_to_idx[labels[i]]] = 1

# Step 2: Define and Compile the RNN Model
# Define the RNN model
model = Sequential([
    SimpleRNN(128, input_shape=(SEQLEN, nb_chars), unroll=True),
    Dense(nb_chars, activation='softmax')
])

# Compile the model
model.compile(loss='categorical_crossentropy', optimizer=RMSprop(learning_rate=0.01))
model.summary()

# Step 3: Train the Model and Test Performance
# Train the model for 100 epochs, testing output every 4 epochs
for iteration in range(1, 26):
    print(f"\nIteration {iteration}")
    model.fit(X, y, batch_size=128, epochs=1)
    
    # Generate text to test the model
    start_idx = np.random.randint(0, len(text) - SEQLEN - 1)
    test_sequence = text[start_idx: start_idx + SEQLEN]
    print(f"Seed text: {test_sequence}")
    
    # Predict the next 100 characters
    for _ in range(25):
        x_pred = np.zeros((1, SEQLEN, nb_chars))
        for t, char in enumerate(test_sequence):
            x_pred[0, t, char_to_idx[char]] = 1
        pred = model.predict(x_pred, verbose=0)
        next_char = idx_to_char[np.argmax(pred)]
        print(next_char, end='')
        test_sequence = test_sequence[1:] + next_char
    print("\n")
