package com.surendramaran.yolov8tflite

object Constants {
    const val MODEL_PATH = "yolov8n_int8.tflite"
    val LABELS_PATH: String? = "example_label_file.txt" // provide your labels.txt file if the metadata not present in the model
}
