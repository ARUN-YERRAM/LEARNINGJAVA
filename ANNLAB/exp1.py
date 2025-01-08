# Create Tensors and perform basic operations with tensors.

import tensorflow as tf
import numpy as np

# 1. Creating tensors using python lists & numpy arrays
tlist = np.array([[10, 20, 30], [40, 50, 60]])
tnumpy = np.array([[79, 89, 99], [109, 119, 129]])

# Converting numpy arrays to TensorFlow tensors
tensor = tf.convert_to_tensor(tnumpy, dtype=tf.int32)

# 2. Creating tensors filled with zeros and ones using TensorFlow
zerotensor = tf.zeros((2, 3), dtype=tf.int32)
onestensor = tf.ones((2, 3), dtype=tf.int32)

# 3. Creating two tensors and performing basic arithmetic operations
a = tf.convert_to_tensor(np.array([[10, 20, 30], [40, 50, 60]]), dtype=tf.int32)
b = tf.convert_to_tensor(np.array([[79, 89, 99], [109, 119, 129]]), dtype=tf.int32)

tensor_add_tf = tf.add(a, b)
tensor_sub_tf = tf.subtract(a, b)
tensor_mul_tf = tf.multiply(a, b)
tensor_div_tf = tf.divide(a, b)

# Display the results
print("Tensor from numpy array:\n", tensor)
print("Zero tensor:\n", zerotensor)
print("Ones tensor:\n", onestensor)
print("Addition:\n", tensor_add_tf)
print("Subtraction:\n", tensor_sub_tf)
print("Multiplication:\n", tensor_mul_tf)
print("Division:\n", tensor_div_tf)
