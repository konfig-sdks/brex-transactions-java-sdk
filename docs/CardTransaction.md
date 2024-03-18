

# CardTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the transaction |  |
|**id** | **String** |  |  |
|**cardId** | **String** | ID of the card used for the transaction. Null when type is REWARDS_CREDIT or COLLECTION. |  [optional] |
|**amount** | [**Money**](Money.md) |  |  |
|**initiatedAtDate** | **LocalDate** | ISO 8601 date string |  |
|**postedAtDate** | **LocalDate** | ISO 8601 date string |  |
|**type** | [**CardTransactionType**](CardTransactionType.md) |  |  [optional] |
|**merchant** | [**CardTransactionMerchant**](CardTransactionMerchant.md) |  |  [optional] |
|**cardMetadata** | **Map&lt;String, String&gt;** |  Set of key value pairs associated with this object. Please do not store any personally identifiable or sensitive information here. Limitations: maximum of 50 keys, keys cannot exceed 40 characters, values cannot exceed 500 characters.   |  [optional] |
|**expenseId** | **String** | The expense ID related to the card transaction. |  [optional] |



