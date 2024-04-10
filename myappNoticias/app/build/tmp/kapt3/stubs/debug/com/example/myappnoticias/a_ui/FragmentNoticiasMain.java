package com.example.myappnoticias.a_ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0002J\u0012\u0010&\u001a\u00020$2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\b\u0010)\u001a\u00020$H\u0014J\b\u0010*\u001a\u00020$H\u0014J\b\u0010+\u001a\u00020$H\u0014J\b\u0010,\u001a\u00020$H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/myappnoticias/a_ui/FragmentNoticiasMain;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/myappnoticias/c_dominio/NoticiaAdapter;", "artMasTarde", "Ljava/util/ArrayList;", "Lcom/example/myappnoticias/b_model/Articulo;", "botonInicio", "Landroid/widget/Button;", "botonPublicados", "botonRelevantes", "botonTendencias", "botonVerMasTarde", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "progresDialog", "Lcom/example/myappnoticias/a_ui/CustomProgressDialog;", "getProgresDialog", "()Lcom/example/myappnoticias/a_ui/CustomProgressDialog;", "progresDialog$delegate", "Lkotlin/Lazy;", "rvArticulosNoticias", "Landroidx/recyclerview/widget/RecyclerView;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "textView", "Landroid/widget/TextView;", "textoBaseData", "Landroidx/lifecycle/MutableLiveData;", "", "getTextoBaseData", "()Landroidx/lifecycle/MutableLiveData;", "viewModelNoticias", "Lcom/example/myappnoticias/b_model/ViewModelNoticias;", "bindView", "", "bindViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "app_debug"})
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
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.myappnoticias.b_model.Articulo> artMasTarde;
    private android.widget.TextView textView;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> textoBaseData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public FragmentNoticiasMain() {
        super();
    }
    
    private final com.example.myappnoticias.a_ui.CustomProgressDialog getProgresDialog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTextoBaseData() {
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