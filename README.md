<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The transactions API lets you view your transactions, accounts, and statements.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Transactions&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-transactions-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-transactions-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-transactions-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTransactions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccountsApi;
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
    try {
      CashAccount result = client
              .accounts
              .getCashAccount(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getStatus());
      System.out.println(result.getCurrentBalance());
      System.out.println(result.getAvailableBalance());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getRoutingNumber());
      System.out.println(result.getPrimary());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCashAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CashAccount> response = client
              .accounts
              .getCashAccount(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getCashAccount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**getCashAccount**](docs/AccountsApi.md#getCashAccount) | **GET** /v2/accounts/cash/{id} |  Get cash account by ID 
*AccountsApi* | [**listCardAccounts**](docs/AccountsApi.md#listCardAccounts) | **GET** /v2/accounts/card |  List card accounts 
*AccountsApi* | [**listCashAccounts**](docs/AccountsApi.md#listCashAccounts) | **GET** /v2/accounts/cash |  List cash accounts 
*AccountsApi* | [**listCashStatements**](docs/AccountsApi.md#listCashStatements) | **GET** /v2/accounts/cash/{id}/statements |  List cash account statements.     
*AccountsApi* | [**listPrimaryCardStatements**](docs/AccountsApi.md#listPrimaryCardStatements) | **GET** /v2/accounts/card/primary/statements |  List primary card account statements.  
*AccountsApi* | [**status**](docs/AccountsApi.md#status) | **GET** /v2/accounts/cash/primary |  Get primary cash account 
*TransactionsApi* | [**listAllCardTransactions**](docs/TransactionsApi.md#listAllCardTransactions) | **GET** /v2/transactions/card/primary |  List transactions for all card accounts. 
*TransactionsApi* | [**listById**](docs/TransactionsApi.md#listById) | **GET** /v2/transactions/cash/{id} |  List transactions for the selected cash account. 


## Documentation for Models

 - [CardAccount](docs/CardAccount.md)
 - [CardAccountCurrentBalance](docs/CardAccountCurrentBalance.md)
 - [CardTransaction](docs/CardTransaction.md)
 - [CardTransactionMerchant](docs/CardTransactionMerchant.md)
 - [CardTransactionType](docs/CardTransactionType.md)
 - [CashAccount](docs/CashAccount.md)
 - [CashTransaction](docs/CashTransaction.md)
 - [CashTransactionType](docs/CashTransactionType.md)
 - [Merchant](docs/Merchant.md)
 - [Money](docs/Money.md)
 - [PageCardTransaction](docs/PageCardTransaction.md)
 - [PageCashAccount](docs/PageCashAccount.md)
 - [PageCashTransaction](docs/PageCashTransaction.md)
 - [PageStatement](docs/PageStatement.md)
 - [Statement](docs/Statement.md)
 - [StatementPeriod](docs/StatementPeriod.md)
 - [Status](docs/Status.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
