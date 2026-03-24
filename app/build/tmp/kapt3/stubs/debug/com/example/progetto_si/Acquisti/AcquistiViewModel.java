package com.example.progetto_si.Acquisti;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\nJ(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\nJ\"\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\nJ\"\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\nJ(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/progetto_si/Acquisti/AcquistiViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "acquistoDao", "Lcom/example/progetto_si/Acquisti/AcquistoDao;", "getMaxPacchetto", "", "callback", "Lkotlin/Function1;", "", "", "getMaxPacchettoCliente", "idCliente", "", "getNumeroAcquisti", "pk", "getNumeroAcquistiCliente", "cl", "getPacchettoById", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "insert", "acquisto", "Lcom/example/progetto_si/Acquisti/Acquisti;", "app_debug"})
public final class AcquistiViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Acquisti.AcquistoDao acquistoDao = null;
    
    public AcquistiViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Acquisti.Acquisti acquisto) {
    }
    
    public final void getNumeroAcquistiCliente(int cl, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void getNumeroAcquisti(int pk, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void getPacchettoById(int idCliente, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.progetto_si.Pacchetto.Pacchetto>, kotlin.Unit> callback) {
    }
    
    public final void getMaxPacchetto(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> callback) {
    }
    
    public final void getMaxPacchettoCliente(int idCliente, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> callback) {
    }
}