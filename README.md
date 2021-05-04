# BATIK CLASSIFICATION
This is the repository of Capstone Project from group B21-CAP0030.

We are currently developing an application using DeepLearning with Tensorflow, and then importing the model to an Android Environment (Android Studio).
Indonesian Batik classification using Convolutional NN and softmax as classifier.

## PROJECT's DATA
This project has two folders, **batik-train** and **batik-val**.

Originally, we used the dataset from Kaggle with [this link](https://www.kaggle.com/dionisiusdh/indonesian-batik-motifs).
But after some training, it became known the data itself is immensely noisy. We had to conduct our own simple **Scraping** and in the end created:
* batik-train: 5 folders with 60 images each for training.
* batik-val: 5 folders with 10 images each for validation.

Our dataset has 5 classes, where each images will **belong to exactly one class**:
* Celup: A tie-dye pattern, colorful and mostly circular.
* Kawung: Symmetrical circle shape similar to _kawung_ fruit.
* Megamendung: Pattern that has a pattern like a cloud in the sky.
* Parang: A pattern that has multiple slanted line going diagonally.
* Sidoluhur: Symmetrical and recurring pattern of diamond shapes.

## ML Stage Environment
Running the ML experiments, we did it on:
* Jupyter Notebook on PC with RAM >= 8 GB
* Python 2.4.1

## Sources
[Indonesian Batik Motifs](https://www.kaggle.com/dionisiusdh/indonesian-batik-motifs) - Kaggle
