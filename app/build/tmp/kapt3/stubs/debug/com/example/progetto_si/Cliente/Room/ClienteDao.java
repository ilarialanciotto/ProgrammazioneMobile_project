package com.example.progetto_si.Cliente.Room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0011\u001a\u00020\u0003H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\'J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH\'\u00a8\u0006\u0016"}, d2 = {"Lcom/example/progetto_si/Cliente/Room/ClienteDao;", "", "checkCliente", "", "email", "", "password", "getAllClients", "", "Lcom/example/progetto_si/Cliente/Room/Cliente;", "getClienteByEmail", "getClienteByEmailAndPassword", "getClienteById", "clienteId", "getClientiConPacchetti", "getNotaClientePacchetto", "Lcom/example/progetto_si/ClassiUtili/Coppia;", "pacchetto", "insert", "", "cliente", "update", "app_debug"})
@androidx.room.Dao()
public abstract interface ClienteDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Cliente.Room.Cliente cliente);
    
    @androidx.room.Query(value = "SELECT * FROM clienti WHERE id = :clienteId")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.progetto_si.Cliente.Room.Cliente getClienteById(int clienteId);
    
    @androidx.room.Query(value = "SELECT * FROM clienti WHERE email = :email AND password = :password")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.progetto_si.Cliente.Room.Cliente getClienteByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM clienti WHERE email = :email AND password = :password")
    public abstract int checkCliente(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Query(value = "SELECT N.nota,C.email FROM CLIENTI C JOIN NOTE N ON C.email=N.email WHERE N.pacchetto=:pacchetto")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.ClassiUtili.Coppia> getNotaClientePacchetto(int pacchetto);
    
    @androidx.room.Query(value = "SELECT * FROM clienti")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Cliente.Room.Cliente> getAllClients();
    
    @androidx.room.Query(value = "SELECT C.* FROM clienti C JOIN Acquisti A ON C.id=A.cliente")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Cliente.Room.Cliente> getClientiConPacchetti();
    
    @androidx.room.Update()
    public abstract int update(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Cliente.Room.Cliente cliente);
    
    @androidx.room.Query(value = "SELECT * FROM clienti WHERE email = :email")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.progetto_si.Cliente.Room.Cliente getClienteByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}