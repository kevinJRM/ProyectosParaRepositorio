package com.example.myappnoticias.a_ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\rH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/myappnoticias/a_ui/Noticia;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/myappnoticias/c_dominio/NoticiaAbiertaAdaptador;", "articuloAbierto", "Ljava/util/ArrayList;", "Lcom/example/myappnoticias/b_model/Articulo;", "mainNoticiaModel", "Lcom/example/myappnoticias/b_model/MainNoticiaModel;", "rvArticulosNoticias", "Landroidx/recyclerview/widget/RecyclerView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "app_debug"})
public final class Noticia extends androidx.appcompat.app.AppCompatActivity {
    private com.example.myappnoticias.b_model.MainNoticiaModel mainNoticiaModel;
    private androidx.recyclerview.widget.RecyclerView rvArticulosNoticias;
    private com.example.myappnoticias.c_dominio.NoticiaAbiertaAdaptador adapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.myappnoticias.b_model.Articulo> articuloAbierto;
    
    public Noticia() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
}