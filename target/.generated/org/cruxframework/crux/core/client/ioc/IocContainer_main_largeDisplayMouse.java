package org.cruxframework.crux.core.client.ioc;

import org.cruxframework.crux.core.client.screen.views.View;
import com.google.gwt.core.client.GWT;

public class IocContainer_main_largeDisplayMouse extends org.cruxframework.crux.core.client.ioc.IocContainer {
  public IocContainer_main_largeDisplayMouse(View view){
    super(view);
  }
  public  smartphones.client.MainController.MainView getsmartphones_client_MainController_MainView(org.cruxframework.crux.core.client.ioc.IoCResource.Scope scope, String subscope){
    smartphones.client.MainController.MainView result = _getScope(scope).getValue(new org.cruxframework.crux.core.client.ioc.IocProvider<smartphones.client.MainController.MainView>(){
      public smartphones.client.MainController.MainView get(){
        return GWT.create(smartphones.client.MainController.MainView.class);
      }
    }, "smartphones.client.MainController.MainView", subscope, 
    new IocScope.CreateCallback<smartphones.client.MainController.MainView>(){
      public void onCreate(smartphones.client.MainController.MainView newObject){
      }
    }
    );
    if (scope != org.cruxframework.crux.core.client.ioc.IoCResource.Scope.SINGLETON && result.getBoundCruxViewId() == null){
      result.bindCruxView(this.getBoundCruxViewId());
    }
    return result;
  }
}
