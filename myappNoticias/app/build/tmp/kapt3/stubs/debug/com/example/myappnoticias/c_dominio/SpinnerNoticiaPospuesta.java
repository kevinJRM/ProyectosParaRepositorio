package com.example.myappnoticias.c_dominio;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J0\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/myappnoticias/c_dominio/SpinnerNoticiaPospuesta;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "contexto", "Landroid/content/Context;", "artp", "Lcom/example/myappnoticias/b_model/Articulo;", "(Landroid/content/Context;Lcom/example/myappnoticias/b_model/Articulo;)V", "art", "context", "indicadorActualizarLista", "Landroidx/lifecycle/MutableLiveData;", "getIndicadorActualizarLista", "()Landroidx/lifecycle/MutableLiveData;", "setIndicadorActualizarLista", "(Landroidx/lifecycle/MutableLiveData;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "onItemSelected", "", "p0", "Landroid/widget/AdapterView;", "p1", "Landroid/view/View;", "p2", "", "p3", "", "onNothingSelected", "app_debug"})
public final class SpinnerNoticiaPospuesta implements android.widget.AdapterView.OnItemSelectedListener {
    @org.jetbrains.annotations.NotNull
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private com.example.myappnoticias.b_model.Articulo art;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.myappnoticias.b_model.Articulo> indicadorActualizarLista;
    
    public SpinnerNoticiaPospuesta(@org.jetbrains.annotations.NotNull
    android.content.Context contexto, @org.jetbrains.annotations.NotNull
    com.example.myappnoticias.b_model.Articulo artp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.myappnoticias.b_model.Articulo> getIndicadorActualizarLista() {
        return null;
    }
    
    public final void setIndicadorActualizarLista(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.myappnoticias.b_model.Articulo> p0) {
    }
    
    @java.lang.Override
    public void onItemSelected(@org.jetbrains.annotations.Nullable
    android.widget.AdapterView<?> p0, @org.jetbrains.annotations.Nullable
    android.view.View p1, int p2, long p3) {
    }
    
    @java.lang.Override
    public void onNothingSelected(@org.jetbrains.annotations.Nullable
    android.widget.AdapterView<?> p0) {
    }
}