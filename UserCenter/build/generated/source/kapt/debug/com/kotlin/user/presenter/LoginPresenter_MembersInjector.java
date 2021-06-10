// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.kotlin.user.presenter;

import android.content.Context;
import com.kotlin.base.presenter.BasePresenter;
import com.kotlin.user.service.UserService;
import com.trello.rxlifecycle.LifecycleProvider;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class LoginPresenter_MembersInjector implements MembersInjector<LoginPresenter> {
  private final Provider<LifecycleProvider<?>> lifecycleProvider;

  private final Provider<Context> contextProvider;

  private final Provider<UserService> userServiceProvider;

  public LoginPresenter_MembersInjector(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<UserService> userServiceProvider) {
    assert lifecycleProvider != null;
    this.lifecycleProvider = lifecycleProvider;
    assert contextProvider != null;
    this.contextProvider = contextProvider;
    assert userServiceProvider != null;
    this.userServiceProvider = userServiceProvider;
  }

  public static MembersInjector<LoginPresenter> create(
      Provider<LifecycleProvider<?>> lifecycleProvider,
      Provider<Context> contextProvider,
      Provider<UserService> userServiceProvider) {
    return new LoginPresenter_MembersInjector(
        lifecycleProvider, contextProvider, userServiceProvider);
  }

  @Override
  public void injectMembers(LoginPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    ((BasePresenter) instance).lifecycleProvider = lifecycleProvider.get();
    ((BasePresenter) instance).context = contextProvider.get();
    instance.userService = userServiceProvider.get();
  }
}
