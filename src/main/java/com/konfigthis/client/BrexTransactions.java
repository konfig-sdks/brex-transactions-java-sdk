package com.konfigthis.client;

import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.TransactionsApi;

public class BrexTransactions {
    private ApiClient apiClient;
    public final AccountsApi accounts;
    public final TransactionsApi transactions;

    public BrexTransactions() {
        this(null);
    }

    public BrexTransactions(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accounts = new AccountsApi(this.apiClient);
        this.transactions = new TransactionsApi(this.apiClient);
    }

}
