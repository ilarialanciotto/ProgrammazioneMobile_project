package com.example.progetto_si.Cliente.Activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/progetto_si/Cliente/Activity/PacchettiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "acquistiViewModel", "Lcom/example/progetto_si/Acquisti/AcquistiViewModel;", "getAcquistiViewModel", "()Lcom/example/progetto_si/Acquisti/AcquistiViewModel;", "acquistiViewModel$delegate", "Lkotlin/Lazy;", "pacchettoAdapter", "Lcom/example/progetto_si/ClassiUtili/PacchettoAdapter;", "password", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "username", "isActivityActive", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class PacchettiActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.progetto_si.ClassiUtili.PacchettoAdapter pacchettoAdapter;
    private java.lang.String username;
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy acquistiViewModel$delegate = null;
    
    public PacchettiActivity() {
        super();
    }
    
    private final com.example.progetto_si.Acquisti.AcquistiViewModel getAcquistiViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Funzione per verificare se l'Activity è attiva.
     */
    private final boolean isActivityActive() {
        return false;
    }
}