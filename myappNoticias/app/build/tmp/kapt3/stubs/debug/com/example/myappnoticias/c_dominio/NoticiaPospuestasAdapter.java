package com.example.myappnoticias.c_dominio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0014\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myappnoticias/c_dominio/NoticiaPospuestasAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myappnoticias/c_dominio/NoticiaPospuestaViewHolder;", "()V", "adapterOpciones", "Landroid/widget/ArrayAdapter;", "", "items", "", "Lcom/example/myappnoticias/b_model/Articulo;", "Update", "", "lista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NoticiaPospuestasAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myappnoticias.c_dominio.NoticiaPospuestaViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myappnoticias.b_model.Articulo> items;
    private android.widget.ArrayAdapter<java.lang.CharSequence> adapterOpciones;
    
    public NoticiaPospuestasAdapter() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.myappnoticias.c_dominio.NoticiaPospuestaViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.c_dominio.NoticiaPospuestaViewHolder holder, int position) {
    }
    
    public final void Update(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myappnoticias.b_model.Articulo> lista) {
    }
}