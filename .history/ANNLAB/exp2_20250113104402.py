import tensorflow as tf
import numpy as np

# Generate random tensors
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

# Generate another random tensor for splitting
x = tf.random.normal([10, 35, 8])

# Split tensor x into 2 parts along axis 0
split_result_1 = tf.split(x, num_or_size_splits=2, axis=0)
print(split_result_1)

# Split tensor x into 4 parts with specified sizes along axis 0
split_result_2 = tf.split(x, num_or_size_splits=[4, 2, 2, 2], axis=0)
print(split_result_2)
print(len(split_result_2))

# Tensor norm computations
a = tf.ones([2, 2])

# Compute the L1 norm of tensor x
norm_l1 = tf.norm(x, ord=1)
print(norm_l1)

# Compute the L2 norm of tensor x
norm_l2 = tf.norm(x, ord=2)
print(norm_l2)

# Compute the infinity norm of tensor x
norm_inf = tf.norm(x, ord=np.inf)
print(norm_inf)

# Reduce max and min values along axis 0 and axis 1
reduce_max_axis_0 = tf.reduce_max(x, axis=0)
print(reduce_max_axis_0)

reduce_max_axis_1 = tf.reduce_max(x, axis=1)
print(reduce_max_axis_1)

reduce_min_axis_0 = tf.reduce_min(x, axis=0)
print(reduce_min_axis_0)

reduce_min_axis_1 = tf.reduce_min(x, axis=1)
print(reduce_min_axis_1)
