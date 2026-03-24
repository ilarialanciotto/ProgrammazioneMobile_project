package com.example.progetto_si.Pacchetto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\'J\b\u0010\b\u001a\u00020\u0003H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\rH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u000fH\'J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\nH\'J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0011H\'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u000fH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\'\u00a8\u0006\u0016"}, d2 = {"Lcom/example/progetto_si/Pacchetto/PacchettoDao;", "", "Delete", "", "pack", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "aggiorna", "pacchetto", "deleteAllPacchetti", "getAllId", "", "", "getAllPacchetti", "Lkotlinx/coroutines/flow/Flow;", "getAllPacchettiLiveData", "Landroidx/lifecycle/LiveData;", "getAllPacchettiS", "", "getDettaggliPacchetto", "nome", "getPacchettiP", "insertPacchetto", "app_debug"})
@androidx.room.Dao()
public abstract interface PacchettoDao {
    
    @androidx.room.Query(value = "SELECT * FROM pacchetto ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> getAllPacchetti();
    
    @androidx.room.Query(value = "SELECT * FROM pacchetto ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> getPacchettiP();
    
    @androidx.room.Query(value = "SELECT * FROM pacchetto ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> getAllPacchettiLiveData();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertPacchetto(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pacchetto);
    
    @androidx.room.Query(value = "DELETE FROM pacchetto")
    public abstract void deleteAllPacchetti();
    
    @androidx.room.Update()
    public abstract void aggiorna(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pacchetto);
    
    @androidx.room.Query(value = "SELECT nome FROM pacchetto ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getAllPacchettiS();
    
    @androidx.room.Query(value = "SELECT id FROM pacchetto ORDER BY id ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Integer> getAllId();
    
    @androidx.room.Query(value = "SELECT * FROM pacchetto WHERE nome=:nome LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.progetto_si.Pacchetto.Pacchetto getDettaggliPacchetto(@org.jetbrains.annotations.NotNull()
    java.lang.String nome);
    
    @androidx.room.Delete()
    public abstract void Delete(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pack);
}