package com.example.progetto_si.Pacchetto;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bJ \u0010\u0014\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\u00100\u0016J \u0010\u0018\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0007\u0012\u0004\u0012\u00020\u00100\u0016J \u0010\u001a\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\u00100\u0016J(\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00192\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0007\u0012\u0004\u0012\u00020\u00100\u0016J\u000e\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\bR&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/example/progetto_si/Pacchetto/PacchettoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "pacchetti", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "getPacchetti", "()Landroidx/lifecycle/LiveData;", "setPacchetti", "(Landroidx/lifecycle/LiveData;)V", "pacchettoDao", "Lcom/example/progetto_si/Pacchetto/PacchettoDao;", "Aggiorna", "", "pack", "eliminaPa", "pacchetto", "getAllId", "callback", "Lkotlin/Function1;", "", "getAllPacchetti", "", "getAllid", "getDettaggliPacchetto", "nome", "insert", "app_debug"})
public final class PacchettoViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Pacchetto.PacchettoDao pacchettoDao = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> pacchetti;
    
    public PacchettoViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> getPacchetti() {
        return null;
    }
    
    public final void setPacchetti(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>> p0) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pacchetto) {
    }
    
    public final void getAllPacchetti(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> callback) {
    }
    
    public final void getAllid(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> callback) {
    }
    
    public final void Aggiorna(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pack) {
    }
    
    public final void getDettaggliPacchetto(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> callback) {
    }
    
    public final void eliminaPa(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Pacchetto.Pacchetto pacchetto) {
    }
    
    public final void getAllId(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.Integer>, kotlin.Unit> callback) {
    }
}