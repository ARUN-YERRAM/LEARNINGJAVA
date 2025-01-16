import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler

# Load the Iris dataset
iris = load_iris()
# Use the first 100 samples and only the first two features for binary classification
X = iris.data[:100, :2]
y = iris.target[:100]

# Convert labels: 0 -> -1, 1 -> 1 (binary classification)
y = np.where(y == 0, -1, 1)

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# Initialize perceptron parameters
weights = np.zeros(X_train.shape[1])  # Initialize weights to zero
bias = 0                             # Initialize bias to zero
learning_rate = 0.1                  # Learning rate
epochs = 10                          # Number of epochs

# Training the perceptron
for epoch in range(epochs):
    for i in range(X_train.shape[0]):
        # Compute the linear output
        linear_output = np.dot(X_train[i], weights) + bias
        # Apply the step function
        y_pred = np.where(linear_output > 0, 1, -1)
        # Update weights and bias if there is a misclassification
        if y_train[i] != y_pred:
            weights += learning_rate * y_train[i] * X_train[i]
            bias += learning_rate * y_train[i]

# Testing the perceptron
correct_predictions = 0
for i in range(X_test.shape[0]):
    # Compute the linear output
    linear_output = np.dot(X_test[i], weights) + bias
    # Apply the step function
    y_pred = np.where(linear_output > 0, 1, -1)
    # Check if prediction matches the true label
    if y_pred == y_test[i]:
        correct_predictions += 1

# Calculate and print accuracy
accuracy = correct_predictions / X_test.shape[0]
print(f"Accuracy: {accuracy * 100:.2f}%")
