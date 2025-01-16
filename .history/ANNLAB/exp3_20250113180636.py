import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler


iris = load_iris()

X = iris.data[:100, :2]
y = iris.target[:100]


y = np.where(y == 0, -1, 1)


X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)


weights = np.zeros(X_train.shape[1])  
bias = 0                            
learning_rate = 0.1                  
epochs = 10                          


for epoch in range(epochs):
    for i in range(X_train.shape[0]):
        
        linear_output = np.dot(X_train[i], weights) + bias
        
        y_pred = np.where(linear_output > 0, 1, -1)
        
        if y_train[i] != y_pred:
            weights += learning_rate * y_train[i] * X_train[i]
            bias += learning_rate * y_train[i]


correct_predictions = 0
for i in range(X_test.shape[0]):

    linear_output = np.dot(X_test[i], weights) + bias
    
    y_pred = np.where(linear_output > 0, 1, -1)

    if y_pred == y_test[i]:
        correct_predictions += 1


accuracy = correct_predictions / X_test.shape[0]
print(f"Accuracy: {accuracy * 100:.2f}%")
