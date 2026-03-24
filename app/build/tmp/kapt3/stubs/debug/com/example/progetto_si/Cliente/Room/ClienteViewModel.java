package com.example.progetto_si.Cliente.Room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\nJ\u0010\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\b0\nJ*\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b0\nJ(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00132\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b\u0012\u0004\u0012\u00020\b0\nJ\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fJ>\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fJ\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/progetto_si/Cliente/Room/ClienteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "clienteDao", "Lcom/example/progetto_si/Cliente/Room/ClienteDao;", "getAllClients", "", "callback", "Lkotlin/Function1;", "", "Lcom/example/progetto_si/Cliente/Room/Cliente;", "getClienteByEmail", "email", "", "getClientiConPacchetti", "getIdCliente", "password", "", "getNotaClientePacchetto", "idPacchetto", "Lcom/example/progetto_si/ClassiUtili/Coppia;", "insert", "cliente", "insertCliente", "nome", "cognome", "telefono", "azienda", "tipo", "updateCliente", "app_debug"})
public final class ClienteViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Cliente.Room.ClienteDao clienteDao = null;
    
    public ClienteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Cliente.Room.Cliente cliente) {
    }
    
    public final void getNotaClientePacchetto(int idPacchetto, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.progetto_si.ClassiUtili.Coppia>, kotlin.Unit> callback) {
    }
    
    public final void insertCliente(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String cognome, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String telefono, @org.jetbrains.annotations.NotNull()
    java.lang.String azienda, @org.jetbrains.annotations.NotNull()
    java.lang.String tipo) {
    }
    
    public final void getIdCliente(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void getAllClients(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.progetto_si.Cliente.Room.Cliente>, kotlin.Unit> callback) {
    }
    
    public final void getClientiConPacchetti(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.progetto_si.Cliente.Room.Cliente>, kotlin.Unit> callback) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.progetto_si.Cliente.Room.Cliente getClienteByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    public final void updateCliente(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Cliente.Room.Cliente cliente) {
    }
}