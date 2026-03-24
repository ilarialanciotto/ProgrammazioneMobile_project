package com.example.progetto_si.Sviluppatore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H\'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000e\u001a\u00020\u0005H\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\'J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\'\u00a8\u0006\u0013"}, d2 = {"Lcom/example/progetto_si/Sviluppatore/SviluppatoreDao;", "", "checkSviluppatore", "", "email", "", "password", "getAllSviluppatori", "", "Lcom/example/progetto_si/Sviluppatore/Sviluppatore;", "getSviluppatoreByEmail", "getSviluppatoreById", "sviluppatoreId", "getSviluppatoriByTipo", "tipo", "insert", "", "sviluppatore", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface SviluppatoreDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Sviluppatore.Sviluppatore sviluppatore);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Sviluppatore.Sviluppatore sviluppatore);
    
    @androidx.room.Query(value = "SELECT * FROM sviluppatori WHERE id = :sviluppatoreId")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.progetto_si.Sviluppatore.Sviluppatore getSviluppatoreById(int sviluppatoreId);
    
    @androidx.room.Query(value = "SELECT * FROM sviluppatori WHERE email = :email")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.progetto_si.Sviluppatore.Sviluppatore getSviluppatoreByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @androidx.room.Query(value = "SELECT * FROM sviluppatori WHERE tipo = :tipo")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Sviluppatore.Sviluppatore> getSviluppatoriByTipo(@org.jetbrains.annotations.NotNull()
    java.lang.String tipo);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM sviluppatori WHERE email = :email AND password = :password")
    public abstract int checkSviluppatore(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Query(value = "SELECT * FROM sviluppatori")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Sviluppatore.Sviluppatore> getAllSviluppatori();
}