package net.droidlabs.mvvm.recyclerview.adapter.binder;

/***
 * ItemBinder allows to link a Layout to a Model in order to use the DataBinding
 * @param <T>
 */
public interface ItemBinder<T>
{
      int getLayoutRes(T model);
      int getBindingVariable(T model);
}
