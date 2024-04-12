package com.example.myappnoticias.a_ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0012\u0010\u001a\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u0018H\u0014J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u0018H\u0014J\b\u0010 \u001a\u00020\u0018H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/myappnoticias/a_ui/FragmentNoticiasMain;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/myappnoticias/c_dominio/NoticiaAdapter;", "botonInicio", "Landroid/widget/Button;", "botonPublicados", "botonRelevantes", "botonTendencias", "botonVerMasTarde", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "progresDialog", "Lcom/example/myappnoticias/a_ui/CustomProgressDialog;", "getProgresDialog", "()Lcom/example/myappnoticias/a_ui/CustomProgressDialog;", "progresDialog$delegate", "Lkotlin/Lazy;", "rvArticulosNoticias", "Landroidx/recyclerview/widget/RecyclerView;", "viewModelNoticias", "Lcom/example/myappnoticias/b_model/ViewModelNoticias;", "bindView", "", "bindViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "app_debug"})
public final class FragmentNoticiasMain extends androidx.appcompat.app.AppCompatActivity {
    private com.example.myappnoticias.b_model.ViewModelNoticias viewModelNoticias;
    private androidx.recyclerview.widget.RecyclerView rvArticulosNoticias;
    private com.example.myappnoticias.c_dominio.NoticiaAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy progresDialog$delegate = null;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private android.widget.Button botonRelevantes;
    private android.widget.Button botonTendencias;
    private android.widget.Button botonPublicados;
    private android.widget.Button botonInicio;
    private android.widget.Button botonVerMasTarde;
    
    public FragmentNoticiasMain() {
        super();
    }
    
    private final com.example.myappnoticias.a_ui.CustomProgressDialog getProgresDialog() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onStart() {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onStop() {
    }
    
    private final void bindView() {
    }
    
    private final void bindViewModel() {
    }
}