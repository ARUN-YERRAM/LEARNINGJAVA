import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Dropout
from tensorflow.keras.optimizers import SGD, Adam, RMSprop
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import OneHotEncoder, StandardScaler
import warnings

warnings.filterwarnings("ignore")


data = load_iris()
x = data.data
y = data.target

encoder = OneHotEncoder(sparse_output=False)
y = encoder.fit_transform(y.reshape(-1, 1))


scaler = StandardScaler()
x = scaler.fit_transform(x)


x_train, x_test, y_train, y_test = train_test_split(x, y, test_size=0.2, random_state=42)


def create_model(activation_func, optimizer):
    model = Sequential([
        Dense(64, input_dim=x_train.shape[1], activation=activation_func),
        Dropout(0.5),
        Dense(32, activation=activation_func),
        Dropout(0.5),
        Dense(3, activation='softmax')
    ])
    model.compile(loss='categorical_crossentropy', optimizer=optimizer, metrics=['accuracy'])
    return model


activation_funcs = ['relu', 'sigmoid', 'tanh']
optimizers = [SGD(learning_rate=0.01), Adam(learning_rate=0.001), RMSprop(learning_rate=0.001)]



for activation_func in activation_funcs:
    for optimizer_class in [SGD, Adam, RMSprop]:  
        optimizer = optimizer_class(learning_rate=0.001)  
        model = create_model(activation_func, optimizer)
        model.fit(x_train, y_train, epochs=50, batch_size=16, verbose=0)
        loss, accuracy = model.evaluate(x_test, y_test, verbose=0)
        print(f'Activation: {activation_func}, Optimizer: {optimizer.__class__.__name__}, Loss: {loss:.3f}, Accuracy: {accuracy:.3f}')
