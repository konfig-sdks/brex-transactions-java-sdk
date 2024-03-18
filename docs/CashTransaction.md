

# CashTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the transaction |  |
|**id** | **String** |  |  |
|**amount** | [**CardAccountCurrentBalance**](CardAccountCurrentBalance.md) |  |  [optional] |
|**initiatedAtDate** | **LocalDate** | ISO 8601 date of when the payment is initiated |  |
|**postedAtDate** | **LocalDate** | ISO 8601 date of when the payment is posted |  |
|**type** | [**CashTransactionType**](CashTransactionType.md) |  |  [optional] |
|**transferId** | **String** | Transfer ID to fetch additional metadata about the transaction using &#x60;https://developer.brex.com/openapi/payments_api/#operation/getTransfersById&#x60; |  [optional] |



