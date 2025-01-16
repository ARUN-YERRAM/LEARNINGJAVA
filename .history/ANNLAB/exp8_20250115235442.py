-- # Implement a CNN architectures (LeNet, Alexnet, VGG, etc) model to classify multi category Satellite images with tensorflow / keras and check the accuracy. Check whether your model is overfit / underfit / perfect fit and apply the techniques to avoid overfit and underfit.

-- import tensorflow as tf
-- from tensorflow.keras.models import Sequential
-- from tensorflow.keras.layers import Conv2D, MaxPooling2D, Flatten, Dense, Dropout
-- from tensorflow.keras.datasets import cifar10
-- from tensorflow.keras.utils import to_categorical
-- import matplotlib.pyplot as plt
-- # STEP 1: LOAD AND PREPROCESS DATA
-- # Load CIFAR-10 dataset
-- (x_train, y_train), (x_test, y_test) = cifar10.load_data()
-- # Normalize the pixel values to [0, 1]
-- x_train = x_train / 255.0
-- x_test = x_test / 255.0
-- # One-hot encode labels
-- y_train = to_categorical(y_train, 10)
-- y_test = to_categorical(y_test, 10)
-- # STEP 2: DEFINE CNN MODELS
-- # LeNet-5 Model
-- def lenet_model():
-- model = Sequential([
-- Conv2D(6, kernel_size=(5,5), activation='relu', input_shape=(32, 32, 3), padding='same'),
-- lxii
-- MaxPooling2D(pool_size=(2,2)),
-- Conv2D(16, kernel_size=(5,5), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Flatten(),
-- Dense(120, activation='relu'),
-- Dense(84, activation='relu'),
-- Dense(10, activation='softmax') # 10 classes
-- ])
-- return model
-- # AlexNet-like Model
-- def alexnet_model():
-- model = Sequential([
-- Conv2D(96, kernel_size=(3,3), strides=(1,1), activation='relu', input_shape=(32, 32, 3),
-- padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Conv2D(256, kernel_size=(3,3), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Conv2D(384, kernel_size=(3,3), activation='relu', padding='same'),
-- Conv2D(384, kernel_size=(3,3), activation='relu', padding='same'),
-- Conv2D(256, kernel_size=(3,3), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Flatten(),
-- Dense(512, activation='relu'),
-- Dropout(0.5),
-- lxii
-- Dense(512, activation='relu'),
-- Dropout(0.5),
-- Dense(10, activation='softmax')
-- ])
-- return model
-- # VGG-like Model
-- def vgg_model():
-- model = Sequential([
-- Conv2D(64, kernel_size=(3,3), activation='relu', padding='same', input_shape=(32, 32, 3)),
-- Conv2D(64, kernel_size=(3,3), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Conv2D(128, kernel_size=(3,3), activation='relu', padding='same'),
-- Conv2D(128, kernel_size=(3,3), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Conv2D(256, kernel_size=(3,3), activation='relu', padding='same'),
-- Conv2D(256, kernel_size=(3,3), activation='relu', padding='same'),
-- MaxPooling2D(pool_size=(2,2)),
-- Flatten(),
-- Dense(512, activation='relu'),
-- Dropout(0.5),
-- Dense(512, activation='relu'),
-- Dropout(0.5),
-- Dense(10, activation='softmax')
-- ])

-- return model
-- # STEP 3: TRAIN AND EVALUATE MODELS
-- def train_and_evaluate(model, model_name, epochs=10, batch_size=64):
-- print(f"\nTraining {model_name}...\n")
-- model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
-- history = model.fit(x_train, y_train, epochs=epochs, batch_size=batch_size,
-- validation_data=(x_test, y_test), verbose=1)
-- test_loss, test_acc = model.evaluate(x_test, y_test, verbose=0)
-- print(f"{model_name} Test Accuracy: {test_acc * 100:.2f}%")
-- return history, test_acc
-- # Train LeNet
-- lenet = lenet_model()
-- lenet_history, lenet_acc = train_and_evaluate(lenet, "LeNet")
-- # Train AlexNet
-- alexnet = alexnet_model()
-- alexnet_history, alexnet_acc = train_and_evaluate(alexnet, "AlexNet")
-- # Train VGG
-- vgg = vgg_model()
-- vgg_history, vgg_acc = train_and_evaluate(vgg, "VGG")
-- # Plot Training and Validation Accuracy
-- def plot_history(histories, labels):
-- plt.figure(figsize=(10, 6))
-- for history, label in zip(histories, labels):
-- plt.plot(history.history['val_accuracy'], label=f'{label} Validation Accuracy')
-- lxv
-- plt.title('Model Comparison - Validation Accuracy')
-- plt.xlabel('Epochs')
-- plt.ylabel('Accuracy')
-- plt.legend()
-- plt.show()
-- # Compare All Models
-- plot_history(
-- histories=[lenet_history, alexnet_history, vgg_history],
-- labels=['LeNet', 'AlexNet', 'VGG']
-- )
-- # Print Summary of Results
-- print("\nSummary of Results:")
-- print(f"LeNet Accuracy: {lenet_acc * 100:.2f}%")
-- print(f"AlexNet Accuracy: {alexnet_acc * 100:.2f}%")
-- print(f"VGG Accuracy: {vgg_acc * 100:.2f}%")
-- # Check which model performs best
-- best_model = max([("LeNet", lenet_acc), ("AlexNet", alexnet_acc), ("VGG", vgg_acc)],
-- key=lambda x: x[1])
-- print(f"\nThe best performing model is {best_model[0]} with an accuracy of {best_model[1] *
-- 100:.2f}%.")

















# Implement CNN architectures (LeNet, AlexNet, VGG, etc.) to classify multi-category satellite images 
# using TensorFlow/Keras and evaluate the models for overfitting/underfitting.

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

# STEP 2: DEFINE CNN MODELS
# LeNet-5 Model
def lenet_model():
    model = Sequential([
        Conv2D(6, kernel_size=(5, 5), activation='relu', input_shape=(32, 32, 3), padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(16, kernel_size=(5, 5), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Flatten(),
        Dense(120, activation='relu'),
        Dense(84, activation='relu'),
        Dense(10, activation='softmax')  # 10 classes
    ])
    return model

# AlexNet-like Model
def alexnet_model():
    model = Sequential([
        Conv2D(96, kernel_size=(3, 3), strides=(1, 1), activation='relu', input_shape=(32, 32, 3), padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(256, kernel_size=(3, 3), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(384, kernel_size=(3, 3), activation='relu', padding='same'),
        Conv2D(384, kernel_size=(3, 3), activation='relu', padding='same'),
        Conv2D(256, kernel_size=(3, 3), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Flatten(),
        Dense(512, activation='relu'),
        Dropout(0.5),
        Dense(512, activation='relu'),
        Dropout(0.5),
        Dense(10, activation='softmax')
    ])
    return model

# VGG-like Model
def vgg_model():
    model = Sequential([
        Conv2D(64, kernel_size=(3, 3), activation='relu', padding='same', input_shape=(32, 32, 3)),
        Conv2D(64, kernel_size=(3, 3), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(128, kernel_size=(3, 3), activation='relu', padding='same'),
        Conv2D(128, kernel_size=(3, 3), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Conv2D(256, kernel_size=(3, 3), activation='relu', padding='same'),
        Conv2D(256, kernel_size=(3, 3), activation='relu', padding='same'),
        MaxPooling2D(pool_size=(2, 2)),
        Flatten(),
        Dense(512, activation='relu'),
        Dropout(0.5),
        Dense(512, activation='relu'),
        Dropout(0.5),
        Dense(10, activation='softmax')
    ])
    return model


# STEP 3: TRAIN AND EVALUATE MODELS
def train_and_evaluate(model, model_name, epochs=10, batch_size=64):
    print(f"\nTraining {model_name}...\n")
    model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
    history = model.fit(x_train, y_train, epochs=epochs, batch_size=batch_size,
                        validation_data=(x_test, y_test), verbose=1)
    test_loss, test_acc = model.evaluate(x_test, y_test, verbose=0)
    print(f"{model_name} Test Accuracy: {test_acc * 100:.2f}%")
    return history, test_acc

# Train LeNet
lenet = lenet_model()
lenet_history, lenet_acc = train_and_evaluate(lenet, "LeNet")

# Train AlexNet
alexnet = alexnet_model()
alexnet_history, alexnet_acc = train_and_evaluate(alexnet, "AlexNet")

# Train VGG
vgg = vgg_model()
vgg_history, vgg_acc = train_and_evaluate(vgg, "VGG")

# Plot Training and Validation Accuracy
def plot_history(histories, labels):
    plt.figure(figsize=(10, 6))
    for history, label in zip(histories, labels):
        plt.plot(history.history['val_accuracy'], label=f'{label} Validation Accuracy')
    plt.title('Model Comparison - Validation Accuracy')
    plt.xlabel('Epochs')
    plt.ylabel('Accuracy')
    plt.legend()
    plt.show()

# Compare All Models
plot_history(
    histories=[lenet_history, alexnet_history, vgg_history],
    labels=['LeNet', 'AlexNet', 'VGG']
)

# Print Summary of Results
print("\nSummary of Results:")
print(f"LeNet Accuracy: {lenet_acc * 100:.2f}%")
print(f"AlexNet Accuracy: {alexnet_acc * 100:.2f}%")
print(f"VGG Accuracy: {vgg_acc * 100:.2f}%")

# Check which model performs best
best_model = max([("LeNet", lenet_acc), ("AlexNet", alexnet_acc), ("VGG", vgg_acc)],
                 key=lambda x: x[1])
print(f"\nThe best performing model is {best_model[0]} with an accuracy of {best_model[1] * 100:.2f}%.")














