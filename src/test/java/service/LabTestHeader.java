package service;

import entities.BaseClass;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.annotations.*;

import java.io.IOException;

import static entities.ResponseUtils.getHeader;
import static org.testng.Assert.assertEquals;



public class LabTestHeader extends BaseClass {



    private CloseableHttpClient client;
    private CloseableHttpResponse response;

    @BeforeMethod
    public void setUp() {
        client = HttpClientBuilder.create().build();
    }

    @AfterMethod
    public void tearDown() throws IOException {
        client.close();
        response.close();
    }

    @Test
    public void testAccessControlHeaderMine() throws IOException {
        HttpGet httpGet = new HttpGet(BaseUrl);

        response = client.execute(httpGet);

        String header = getHeader(response, "vary");

        assertEquals(header, "Accept, Accept-Encoding, Accept, X-Requested-With");
    }
}