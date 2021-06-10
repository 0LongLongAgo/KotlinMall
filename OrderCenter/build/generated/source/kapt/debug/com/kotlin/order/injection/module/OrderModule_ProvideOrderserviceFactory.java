// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.order.injection.module;

import com.kotlin.order.service.OrderService;
import com.kotlin.order.service.impl.OrderServiceImpl;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class OrderModule_ProvideOrderserviceFactory implements Factory<OrderService> {
  private final OrderModule module;

  private final Provider<OrderServiceImpl> orderServiceProvider;

  public OrderModule_ProvideOrderserviceFactory(
      OrderModule module, Provider<OrderServiceImpl> orderServiceProvider) {
    assert module != null;
    this.module = module;
    assert orderServiceProvider != null;
    this.orderServiceProvider = orderServiceProvider;
  }

  @Override
  public OrderService get() {
    return Preconditions.checkNotNull(
        module.provideOrderservice(orderServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OrderService> create(
      OrderModule module, Provider<OrderServiceImpl> orderServiceProvider) {
    return new OrderModule_ProvideOrderserviceFactory(module, orderServiceProvider);
  }
}
