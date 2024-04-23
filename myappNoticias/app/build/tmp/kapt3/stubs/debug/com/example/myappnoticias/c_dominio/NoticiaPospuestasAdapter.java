package com.example.myappnoticias.c_dominio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/myappnoticias/c_dominio/NoticiaPospuestasAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/myappnoticias/c_dominio/NoticiaPospuestaViewHolder;", "fragmentNoticiasPospuestas", "Lcom/example/myappnoticias/a_ui/FragmentNoticiasPospuestas;", "(Lcom/example/myappnoticias/a_ui/FragmentNoticiasPospuestas;)V", "adapterOpciones", "Landroid/widget/ArrayAdapter;", "", "confirmaCambioLista", "Landroidx/lifecycle/MutableLiveData;", "", "getConfirmaCambioLista", "()Landroidx/lifecycle/MutableLiveData;", "setConfirmaCambioLista", "(Landroidx/lifecycle/MutableLiveData;)V", "items", "", "Lcom/example/myappnoticias/b_model/Articulo;", "observador", "scope", "Lkotlinx/coroutines/CoroutineScope;", "Update", "", "lista", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_debug"})
public final class NoticiaPospuestasAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.myappnoticias.c_dominio.NoticiaPospuestaViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myappnoticias.b_model.Articulo> items;
    private android.widget.ArrayAdapter<java.lang.CharSequence> adapterOpciones;
    @org.jetbrains.annotations.NotNull
    private com.example.myappnoticias.a_ui.FragmentNoticiasPospuestas observador;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> confirmaCambioLista;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public NoticiaPospuestasAdapter(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.a_ui.FragmentNoticiasPospuestas fragmentNoticiasPospuestas) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConfirmaCambioLista() {
        return null;
    }
    
    public final void setConfirmaCambioLista(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
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