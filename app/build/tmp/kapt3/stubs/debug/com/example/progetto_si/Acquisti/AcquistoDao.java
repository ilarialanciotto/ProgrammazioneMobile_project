package com.example.progetto_si.Acquisti;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\'J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0003H\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\f\u001a\u00020\u0003H\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\bH\'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\f\u001a\u00020\u0003H\'\u00a8\u0006\u0014"}, d2 = {"Lcom/example/progetto_si/Acquisti/AcquistoDao;", "", "getNumCliePacch", "", "pacchetto", "getNumeroAcquistiPerCliente", "idC", "getPacchettiAcquistati", "", "id", "getPacchettoById", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "idCliente", "insertAcquisto", "", "acquisto", "Lcom/example/progetto_si/Acquisti/Acquisti;", "maxPacchettoAcquistato", "", "maxPacchettoCliente", "app_debug"})
@androidx.room.Dao()
public abstract interface AcquistoDao {
    
    @androidx.room.Insert()
    public abstract void insertAcquisto(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Acquisti.Acquisti acquisto);
    
    @androidx.room.Query(value = "SELECT DISTINCT pacchetto FROM ACQUISTI WHERE cliente=:id")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Integer> getPacchettiAcquistati(int id);
    
    @androidx.room.Query(value = "SELECT COUNT (DISTINCT cliente) FROM ACQUISTI WHERE pacchetto=:pacchetto")
    public abstract int getNumCliePacch(int pacchetto);
    
    @androidx.room.Query(value = "SELECT pacchetto.* FROM acquisti JOIN pacchetto ON pacchetto.id = acquisti.pacchetto WHERE acquisti.cliente = :idCliente")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Pacchetto.Pacchetto> getPacchettoById(int idCliente);
    
    @androidx.room.Query(value = "SELECT COUNT (DISTINCT pacchetto) FROM ACQUISTI WHERE cliente=:idC")
    public abstract int getNumeroAcquistiPerCliente(int idC);
    
    @androidx.room.Query(value = "SELECT p.nome  FROM acquisti a join pacchetto p on a.pacchetto=p.id  GROUP BY pacchetto ORDER BY COUNT(pacchetto) DESC LIMIT 2 ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> maxPacchettoAcquistato();
    
    @androidx.room.Query(value = "SELECT p.nome  FROM acquisti a join pacchetto p on a.pacchetto=p.id  WHERE cliente=:idCliente GROUP BY pacchetto ORDER BY COUNT(pacchetto) DESC LIMIT 2")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> maxPacchettoCliente(int idCliente);
}