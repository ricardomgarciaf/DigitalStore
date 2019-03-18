package com.ricardomgarciaf.digitalstore.api;

import com.ricardomgarciaf.digitalstore.data.net.requests.OrderRequest;
import com.ricardomgarciaf.digitalstore.data.net.responses.ServiceResponse;
import com.ricardomgarciaf.digitalstore.repository.entity.Product;


import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Query;

public interface DigitalStoreApiInterface {

    Observable<ServiceResponse> login(@Query("email")String email, @Query("password")String password);

    Observable<List<Product>> retrieveProducts();

    Observable<ServiceResponse> payOrders(List<OrderRequest> orders);
}
