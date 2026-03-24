package com.example.progetto_si.Registrazione;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u000f\u001a\u00020\u0005H\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/progetto_si/Registrazione/RegistrazioneDao;", "", "checkCredenziali", "", "user", "", "pass", "checkReg", "getAllnames", "", "insertRegistrazioni", "", "registrazione", "Lcom/example/progetto_si/Registrazione/Registrazioni;", "searchNames", "query", "app_debug"})
@androidx.room.Dao()
public abstract interface RegistrazioneDao {
    
    @androidx.room.Insert()
    public abstract void insertRegistrazioni(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Registrazione.Registrazioni registrazione);
    
    @androidx.room.Query(value = "SELECT email FROM registrazioni ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAllnames();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM registrazioni WHERE email= :user")
    public abstract int checkReg(@org.jetbrains.annotations.NotNull()
    java.lang.String user);
    
    @androidx.room.Query(value = "SELECT COUNT(*)  FROM registrazioni WHERE email = :user AND password = :pass")
    public abstract int checkCredenziali(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String pass);
    
    @androidx.room.Query(value = "SELECT email FROM registrazioni WHERE email LIKE \'%\' || :query || \'%\'")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> searchNames(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}