package com.example.progetto_si.Registrazione;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u000e0\u0013J\"\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0016J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/progetto_si/Registrazione/RegistrazioniViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "RegDao", "Lcom/example/progetto_si/Registrazione/RegistrazioneDao;", "adminDao", "Lcom/example/progetto_si/Admin/AdminDao;", "clienteDao", "Lcom/example/progetto_si/Cliente/Room/ClienteDao;", "sviluppatoreDao", "Lcom/example/progetto_si/Sviluppatore/SviluppatoreDao;", "checkCredenziali", "", "user", "", "password", "callback", "Lkotlin/Function2;", "", "checkReg", "Lkotlin/Function1;", "insert", "registrazione", "Lcom/example/progetto_si/Registrazione/Registrazioni;", "app_debug"})
public final class RegistrazioniViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Registrazione.RegistrazioneDao RegDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Cliente.Room.ClienteDao clienteDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Admin.AdminDao adminDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Sviluppatore.SviluppatoreDao sviluppatoreDao = null;
    
    public RegistrazioniViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void checkCredenziali(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> callback) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Registrazione.Registrazioni registrazione) {
    }
    
    public final void checkReg(@org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
}