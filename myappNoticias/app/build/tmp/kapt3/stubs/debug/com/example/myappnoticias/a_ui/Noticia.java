package com.example.myappnoticias.a_ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020&H\u0014J\b\u0010*\u001a\u00020&H\u0014J\b\u0010+\u001a\u00020&H\u0014J\b\u0010,\u001a\u00020&H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020 X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006-"}, d2 = {"Lcom/example/myappnoticias/a_ui/Noticia;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/myappnoticias/c_dominio/RecicladorAdaptadorNoticia;", "articuloAbierto", "Ljava/util/ArrayList;", "Lcom/example/myappnoticias/b_model/Articulo;", "boton", "Landroid/widget/Button;", "mainNoticiaModel", "Lcom/example/myappnoticias/b_model/MainNoticiaModel;", "rvArticulosNoticias", "Landroidx/recyclerview/widget/RecyclerView;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "txt_Texto1", "Landroid/widget/TextView;", "getTxt_Texto1", "()Landroid/widget/TextView;", "setTxt_Texto1", "(Landroid/widget/TextView;)V", "txt_Texto2", "getTxt_Texto2", "setTxt_Texto2", "txt_Texto3", "getTxt_Texto3", "setTxt_Texto3", "txt_Texto4", "getTxt_Texto4", "setTxt_Texto4", "txt_url_image", "Landroid/widget/ImageView;", "getTxt_url_image", "()Landroid/widget/ImageView;", "setTxt_url_image", "(Landroid/widget/ImageView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "app_debug"})
public final class Noticia extends androidx.appcompat.app.AppCompatActivity {
    private com.example.myappnoticias.b_model.MainNoticiaModel mainNoticiaModel;
    private androidx.recyclerview.widget.RecyclerView rvArticulosNoticias;
    private com.example.myappnoticias.c_dominio.RecicladorAdaptadorNoticia adapter;
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.myappnoticias.b_model.Articulo> articuloAbierto;
    public android.widget.TextView txt_Texto1;
    public android.widget.TextView txt_Texto2;
    public android.widget.TextView txt_Texto3;
    public android.widget.TextView txt_Texto4;
    public android.widget.ImageView txt_url_image;
    private android.widget.Button boton;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public Noticia() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxt_Texto1() {
        return null;
    }
    
    public final void setTxt_Texto1(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxt_Texto2() {
        return null;
    }
    
    public final void setTxt_Texto2(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxt_Texto3() {
        return null;
    }
    
    public final void setTxt_Texto3(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTxt_Texto4() {
        return null;
    }
    
    public final void setTxt_Texto4(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.ImageView getTxt_url_image() {
        return null;
    }
    
    public final void setTxt_url_image(@org.jetbrains.annotations.NotNull
    android.widget.ImageView p0) {
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