package com.example.myappnoticias.a_ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/myappnoticias/a_ui/CustomProgressDialog;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "cpCardView", "Landroidx/cardview/widget/CardView;", "cpTitle", "Landroid/widget/TextView;", "dialog", "Lcom/example/myappnoticias/a_ui/CustomProgressDialog$CustomDialog;", "progressBar", "Landroid/widget/ProgressBar;", "setColorFilter", "", "drawable", "Landroid/graphics/drawable/Drawable;", "color", "", "start", "title", "", "stop", "CustomDialog", "app_debug"})
public final class CustomProgressDialog {
    @org.jetbrains.annotations.NotNull
    private final com.example.myappnoticias.a_ui.CustomProgressDialog.CustomDialog dialog = null;
    @org.jetbrains.annotations.NotNull
    private final android.widget.TextView cpTitle = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.cardview.widget.CardView cpCardView = null;
    @org.jetbrains.annotations.NotNull
    private final android.widget.ProgressBar progressBar = null;
    
    public CustomProgressDialog(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    public final void start(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
    }
    
    public final void stop() {
    }
    
    private final void setColorFilter(android.graphics.drawable.Drawable drawable, int color) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myappnoticias/a_ui/CustomProgressDialog$CustomDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "app_debug"})
    public static final class CustomDialog extends android.app.Dialog {
        
        public CustomDialog(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            super(null);
        }
    }
}