package com.example.myappnoticias.c_dominio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u0018\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myappnoticias/c_dominio/NoticiaAbiertaAdaptador;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myappnoticias/c_dominio/NoticiaAbiertaViewHolder;", "()V", "indicadorCierre", "Landroidx/lifecycle/MutableLiveData;", "", "getIndicadorCierre", "()Landroidx/lifecycle/MutableLiveData;", "setIndicadorCierre", "(Landroidx/lifecycle/MutableLiveData;)V", "items", "", "Lcom/example/myappnoticias/b_model/Articulo;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Update", "", "lista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NoticiaAbiertaAdaptador extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myappnoticias.c_dominio.NoticiaAbiertaViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myappnoticias.b_model.Articulo> items;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> indicadorCierre;
    
    public NoticiaAbiertaAdaptador() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getIndicadorCierre() {
        return null;
    }
    
    public final void setIndicadorCierre(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.myappnoticias.c_dominio.NoticiaAbiertaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.c_dominio.NoticiaAbiertaViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void Update(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myappnoticias.b_model.Articulo> lista) {
    }
}