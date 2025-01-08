import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Conv2D, MaxPooling2D, Flatten, Dense, Dropout
from tensorflow.keras.datasets import cifar10
from tensorflow.keras.utils import to_categorical
import matplotlib.pyplot as plt

# STEP 1: LOAD AND PREPROCESS DATA
# Load CIFAR-10 dataset
(x_train, y_train), (x_test, y_test) = cifar10.load_data()
# Normalize the pixel values to [0, 1]
x_train = x_train / 255.0
x_test = x_test / 255.0
# One-hot encode labels
y_train = to_categorical(y_train, 10)
y_test = to_categorical(y_test, 10)

# LeNet Model
def lenet_model():
    model = Sequential([
        Conv2D(6, kernel_size=(5, 5), activation='relu', input_shape=(32, 32, 3), padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(16, kernel_size=(5, 5), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Flatten(),
        Dense(120, activation='relu'),
        Dense(84, activation='relu'),
        Dense(10, activation='softmax')
    ])
    return model

lenet = lenet_model()
lenet.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
print("\nTraining LeNet...\n")
history_lenet = lenet.fit(x_train, y_train, epochs=10, batch_size=64, validation_data=(x_test, y_test), verbose=1)
lenet_acc = lenet.evaluate(x_test, y_test, verbose=0)[1]
print(f"LeNet Test Accuracy: {lenet_acc * 100:.2f}%")