import tensorflow as tf
import numpy as np

t1 = np.array([[1,2,3],[4,5,6]])

tensor1 = tf.convert_to_tensor(t1,dtype=tf.int32)

a = tf.zeros((2,3),dtype=tf.int32)
b = tf.ones((2,3),dtype=tf.int32)

t2 = np.array([[4,5,6],[1,2,3]])
tensor2 = tf.convert_to_tensor(t2,dtype=tf.int32)

tadd = tf.add(tensor1,tensor2)
tsub = tf.subtract(tensor1,tensor2)
tmult = tf.multilpe(tensor1,tensor2)
tdivid = tf.divide(tensor1,tensor2)
print(tadd)
print(tsub)
print(tmul)
print(tdivid)
