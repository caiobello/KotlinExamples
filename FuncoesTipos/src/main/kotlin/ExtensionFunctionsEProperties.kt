data class Item(val name: String, val price: Float) //Define a classe de Item com o nome e o preço do item

data class Order(val items: Collection<Item>) //Define a classe Order que possui uma coleção de itens

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
//Define uma função de extensão para Order que retorna o valor do item de preço máximo na coleção de itens, ou zero se a coleção for vazia.

fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
//Define uma função de extensão para Order que retorna o nome do item de preço máximo na coleção de itens, ou "NO_PRODUCTS" se a coleção for vazia.

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString() //Define uma propriedade de extensão para Order que retorna uma string com os nomes dos itens separados por vírgula.

fun main() {
    val order = Order(
        listOf(
            Item("Bread", 25.0F),
            Item("Wine", 29.0F),
            Item("Water", 12.0F)
        )
    ) //cria uma Order com uma coleção de itens

    println("Max priced item name: ${order.maxPricedItemName()}")  //imprime o nome do item de preço máximo na Order
    println("Max priced item value: ${order.maxPricedItemValue()}")  //imprime o valor do item de preço máximo na Order
    println("Items: ${order.commaDelimitedItemNames}")  //imprime os nomes dos itens separados por vírgula na Order
}