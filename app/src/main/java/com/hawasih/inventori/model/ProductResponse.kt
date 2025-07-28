package com.hawasih.inventori.model

data class ProductResponse(
    val success: Boolean,
    val products: List<Product>
)