import tensorflow as tf
import numpy as np


a = tf.random.normal([4, 3, 3])
print(a)
a = tf.random.normal([4, 35, 8])
print(a)
a = tf.random.normal([4, 3, 3])
b = tf.random.normal([4, 3, 3])

# Concatenate tensors along axis 2
concat_result = tf.concat([a, b], axis=2)
print(concat_result)

stack_result_1 = tf.stack([a, b], axis=2)
print(stack_result_1)


stack_result_2 = tf.stack([a, b], axis=0)
print(stack_result_2)

x = tf.random.normal([10, 35, 8])

split_result_1 = tf.split(x, num_or_size_splits=2, axis=0)
print(split_result_1)


split_result_2 = tf.split(x, num_or_size_splits=[4, 2, 2, 2], axis=0)
print(split_result_2)
print(len(split_result_2))


a = tf.ones([2, 2])


norm_l1 = tf.norm(x, ord=1)
print(norm_l1)


norm_l2 = tf.norm(x, ord=2)
print(norm_l2)


norm_inf = tf.norm(x, ord=np.inf)
print(norm_inf)


reduce_max_axis_0 = tf.reduce_max(x, axis=0)
print(reduce_max_axis_0)

reduce_max_axis_1 = tf.reduce_max(x, axis=1)
print(reduce_max_axis_1)

reduce_min_axis_0 = tf.reduce_min(x, axis=0)
print(reduce_min_axis_0)

reduce_min_axis_1 = tf.reduce_min(x, axis=1)
print(reduce_min_axis_1)
