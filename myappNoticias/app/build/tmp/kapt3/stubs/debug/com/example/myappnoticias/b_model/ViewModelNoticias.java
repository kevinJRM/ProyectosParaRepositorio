package com.example.myappnoticias.b_model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0016\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001b\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myappnoticias/b_model/ViewModelNoticias;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "notic", "Ljava/util/ArrayList;", "Lcom/example/myappnoticias/b_model/Articulo;", "getNotic", "()Ljava/util/ArrayList;", "noticias", "Landroidx/lifecycle/MutableLiveData;", "getNoticias", "()Landroidx/lifecycle/MutableLiveData;", "noticiasRepo", "Lcom/example/myappnoticias/data/ArticulosRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "actualizarNoticIA", "", "cont", "Landroid/content/Context;", "tipo", "cambiarTipoNoticia", "onStart", "setListaArticulosAuxiliar", "app_debug"})
public final class ViewModelNoticias extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "API-DEMO MainViewModelNoticias";
    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.myappnoticias.data.ArticulosRepository noticiasRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.myappnoticias.b_model.Articulo>> noticias = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<com.example.myappnoticias.b_model.Articulo> notic = null;
    
    public ViewModelNoticias() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.myappnoticias.b_model.Articulo>> getNoticias() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<com.example.myappnoticias.b_model.Articulo> getNotic() {
        return null;
    }
    
    public final void onStart(@org.jetbrains.annotations.NotNull
    android.content.Context cont) {
    }
    
    public final void cambiarTipoNoticia(@org.jetbrains.annotations.NotNull
    android.content.Context cont, @org.jetbrains.annotations.NotNull
    java.lang.String tipo) {
    }
    
    public final void setListaArticulosAuxiliar() {
    }
    
    private final void actualizarNoticIA(android.content.Context cont, java.lang.String tipo) {
    }
}