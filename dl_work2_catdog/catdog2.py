import numpy as np
from tensorflow.keras.utils import load_img, img_to_array
from tensorflow import keras

model = keras.models.load_model('best-cnn-model.h5')

paths=['./cats_and_dogs_filtered/validation/dogs/dog.2000.jpg',
      './cats_and_dogs_filtered/validation/cats/cat.2000.jpg' ]

for path in paths:

  img=load_img(path, target_size=(150, 150))

  x=img_to_array(img)
  x=np.expand_dims(x, axis=0)
  images = np.vstack([x])

  classes = model.predict(images, batch_size=10)

  print(classes[0])

  if classes[0]>0:
    print("path 0 is a dog")
  else:
    print("path 1 is a cat")