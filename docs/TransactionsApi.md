# TransactionsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAllCardTransactions**](TransactionsApi.md#listAllCardTransactions) | **GET** /v2/transactions/card/primary |  List transactions for all card accounts.  |
| [**listById**](TransactionsApi.md#listById) | **GET** /v2/transactions/cash/{id} |  List transactions for the selected cash account.  |


<a name="listAllCardTransactions"></a>
# **listAllCardTransactions**
> PageCardTransaction listAllCardTransactions().cursor(cursor).limit(limit).userIds(userIds).postedAtStart(postedAtStart).expand(expand).execute();

 List transactions for all card accounts. 

 This endpoint lists all settled transactions for all card accounts. Regular users may only fetch their own \&quot;PURCHASE\&quot;,\&quot;REFUND\&quot; and \&quot;CHARGEBACK\&quot; settled transactions. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTransactions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTransactions client = new BrexTransactions(configuration);
    String cursor = "cursor_example";
    Integer limit = 56;
    List<String> userIds = Arrays.asList();
    OffsetDateTime postedAtStart = OffsetDateTime.parse("
2022-12-12T23:59:59.999
"); //  Shows only transactions with a `posted_at_date` on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) 
    List<String> expand = Arrays.asList();
    try {
      PageCardTransaction result = client
              .transactions
              .listAllCardTransactions()
              .cursor(cursor)
              .limit(limit)
              .userIds(userIds)
              .postedAtStart(postedAtStart)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listAllCardTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageCardTransaction> response = client
              .transactions
              .listAllCardTransactions()
              .cursor(cursor)
              .limit(limit)
              .userIds(userIds)
              .postedAtStart(postedAtStart)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listAllCardTransactions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **userIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **postedAtStart** | **OffsetDateTime**|  Shows only transactions with a &#x60;posted_at_date&#x60; on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6)  | [optional] |
| **expand** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**PageCardTransaction**](PageCardTransaction.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listPrimaryCardTransactions 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

<a name="listById"></a>
# **listById**
> PageCashTransaction listById(id).cursor(cursor).limit(limit).postedAtStart(postedAtStart).execute();

 List transactions for the selected cash account. 

 This endpoint lists all transactions for the cash account with the selected ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTransactions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TransactionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTransactions client = new BrexTransactions(configuration);
    String id = "id_example";
    String cursor = "cursor_example";
    Integer limit = 56;
    OffsetDateTime postedAtStart = OffsetDateTime.parse("
2022-12-12T23:59:59.999
"); //  Shows only transactions with a `posted_at_date` on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6) 
    try {
      PageCashTransaction result = client
              .transactions
              .listById(id)
              .cursor(cursor)
              .limit(limit)
              .postedAtStart(postedAtStart)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageCashTransaction> response = client
              .transactions
              .listById(id)
              .cursor(cursor)
              .limit(limit)
              .postedAtStart(postedAtStart)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionsApi#listById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **postedAtStart** | **OffsetDateTime**|  Shows only transactions with a &#x60;posted_at_date&#x60; on or after this date-time. This parameter is the date-time notation as defined by [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339#section-5.6)  | [optional] |

### Return type

[**PageCashTransaction**](PageCashTransaction.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listCashTransactions 200 response |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |

