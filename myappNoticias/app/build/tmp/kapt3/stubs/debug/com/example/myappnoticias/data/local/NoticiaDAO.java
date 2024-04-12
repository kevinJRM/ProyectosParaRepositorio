package com.example.myappnoticias.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H\'J!\u0010\r\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\'\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myappnoticias/data/local/NoticiaDAO;", "", "delete", "", "noticias", "", "Lcom/example/myappnoticias/data/local/NoticiaLocal;", "([Lcom/example/myappnoticias/data/local/NoticiaLocal;)V", "getAll", "", "getByName", "name", "", "insert", "app_debug"})
@androidx.room.Dao
public abstract interface NoticiaDAO {
    
    @androidx.room.Query(value = "SELECT * FROM noticias")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.myappnoticias.data.local.NoticiaLocal> getAll();
    
    @androidx.room.Query(value = "SELECT * FROM noticias n WHERE n.nombre = :name LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract com.example.myappnoticias.data.local.NoticiaLocal getByName(@org.jetbrains.annotations.NotNull
    java.lang.String name);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.data.local.NoticiaLocal... noticias);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.data.local.NoticiaLocal noticias);
    
    @androidx.room.Delete
    public abstract void delete(@org.jetbrains.annotations.NotNull
    com.example.myappnoticias.data.local.NoticiaLocal... noticias);
}