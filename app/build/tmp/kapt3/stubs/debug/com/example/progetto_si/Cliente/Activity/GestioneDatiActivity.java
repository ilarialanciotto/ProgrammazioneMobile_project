package com.example.progetto_si.Cliente.Activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/progetto_si/Cliente/Activity/GestioneDatiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "buttonSave", "Landroid/widget/Button;", "buttonUndo", "clienteCorrente", "Lcom/example/progetto_si/Cliente/Room/Cliente;", "clienteViewModel", "Lcom/example/progetto_si/Cliente/Room/ClienteViewModel;", "editCompany", "Landroid/widget/EditText;", "editEmail", "editName", "editPassword", "editPhone", "editSurname", "aggiornaDatiCliente", "", "caricaDatiCliente", "email", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ripristinaDatiOriginali", "app_debug"})
public final class GestioneDatiActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.progetto_si.Cliente.Room.ClienteViewModel clienteViewModel;
    private android.widget.EditText editName;
    private android.widget.EditText editSurname;
    private android.widget.EditText editEmail;
    private android.widget.EditText editPassword;
    private android.widget.EditText editPhone;
    private android.widget.EditText editCompany;
    private android.widget.Button buttonSave;
    private android.widget.Button buttonUndo;
    @org.jetbrains.annotations.Nullable()
    private com.example.progetto_si.Cliente.Room.Cliente clienteCorrente;
    
    public GestioneDatiActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void caricaDatiCliente(java.lang.String email) {
    }
    
    private final void aggiornaDatiCliente() {
    }
    
    private final void ripristinaDatiOriginali() {
    }
}