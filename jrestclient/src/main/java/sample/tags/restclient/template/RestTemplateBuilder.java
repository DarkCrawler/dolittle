package sample.tags.restclient.template;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class RestTemplateBuilder {
    //***** STEPS TO BUILD A REST TEMPLATE *******//
    private static final int MAX_TOTAL = 100;
    private static final int DEFAULT_MAX_PER_ROUTE = 100;

    private HttpClientConnectionManager connectionManager;

    //configure PoolingHttpClientConnectionManager
    /*
    setMaxTotal(int max): Set the maximum number of total open connections.
    setDefaultMaxPerRoute(int max): Set the maximum number of concurrent connections per route, which is 2 by default.
    setMaxPerRoute(int max): Set the total number of concurrent connections to a specific route, which is 2 by default.
     */
    @PostConstruct
    protected void init() {
        PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = new PoolingHttpClientConnectionManager();
        poolingHttpClientConnectionManager.setMaxTotal(MAX_TOTAL);
        poolingHttpClientConnectionManager.setDefaultMaxPerRoute(DEFAULT_MAX_PER_ROUTE);
        connectionManager = poolingHttpClientConnectionManager;
    }

    //create HTTP Client
    //client can also be created using a proxy too
    private HttpClient getHttpClient(Boolean useProxy) {
        //  CloseableHttpClient
        HttpClientBuilder clientBuilder = HttpClientBuilder.create().setConnectionManager(connectionManager);
        return clientBuilder.build();
    }

}
