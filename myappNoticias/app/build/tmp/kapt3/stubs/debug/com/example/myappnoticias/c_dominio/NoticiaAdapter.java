package com.example.myappnoticias.c_dominio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myappnoticias/c_dominio/NoticiaAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myappnoticias/c_dominio/ArticuloViewHolder;", "contexto", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adapter", "Landroid/widget/ArrayAdapter;", "", "getContexto", "()Landroid/content/Context;", "setContexto", "items", "", "Lcom/example/myappnoticias/b_model/Articulo;", "spinnerNoticiasPM", "Lcom/example/myappnoticias/c_dominio/SpinnerNoticiaPantMain;", "Update", "", "lista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NoticiaAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myappnoticias.c_dominio.ArticuloViewHolder> {
    @org.jetbrains.annotations.NotNull
    private android.content.Context contexto;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myappnoticias.b_model.Articulo> items;
    private android.widget.ArrayAdapter<java.lang.CharSequence> adapter;
    private com.example.myappnoticias.c_dominio.SpinnerNoticiaPantMain spinnerNoticiasPM;
    
    public NoticiaAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context contexto) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContexto() {
        return null;
    }
    
    public final void setContexto(@org.jetbrains.annotations.NotNull
    android.content.Context p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.myappnoticias.c_dominio.ArticuloViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.c_dominio.ArticuloViewHolder holder, int position) {
    }
    
    public final void Update(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myappnoticias.b_model.Articulo> lista) {
    }
}