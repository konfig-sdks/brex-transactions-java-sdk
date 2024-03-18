/*
 * Transactions API
 *  The transactions API lets you view your transactions, accounts, and statements. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.auth;

/**
 * OAuth flows that are supported by this client
 */
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public enum OAuthFlow {
    ACCESS_CODE, //called authorizationCode  in OpenAPI 3.0
    IMPLICIT,
    PASSWORD,
    APPLICATION //called clientCredentials in OpenAPI 3.0
}
