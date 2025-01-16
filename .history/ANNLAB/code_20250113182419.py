import tensorflow as tf
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler ,OneHotEncoder

iris = load_iris()
X = iris.data
y = iris.target
x_train,x_test,y_train,y_test = train_test_split(x,y,test_size=0.2,random_state=42)

weights = x_train.shape[1]
bias = 0
learning_rate = 0.1
epochs = 10

for e in range(epochs):
    for i in range(x_train.shape[0]):
    out = np.dot(x_train[i],weights) + bias
    x_pred = np.where(x > 0 1,-1)

    if x_pred != y_train[i]:
        weights = learning_rate*weights*bias
        bias = learning_rate*bias     
cnt = 0
for i in range(x_test.shape[0]):
    out = np.dot(x_test[i],weights) +  bias 
    y_pred = np.where(u > 0 1,-1)

    if y_pred == y_test[i]:
        cnt += 1

accuracy = cnt/x_test.shape[0]
print(f"Accuracy : {accuracy*100:.2f}%")

