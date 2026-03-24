package com.example.progetto_si.Admin;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/progetto_si/Admin/GestionePacchettiActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/progetto_si/ClassiUtili/PacchettoAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "selectedPacchetto", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "viewModel", "Lcom/example/progetto_si/Pacchetto/PacchettoViewModel;", "getViewModel", "()Lcom/example/progetto_si/Pacchetto/PacchettoViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "eliminaPacchetto", "", "mostraDialogAggiungiPacchetto", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showEditPacchettoDialog", "pacchetto", "app_debug"})
public final class GestionePacchettiActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.progetto_si.ClassiUtili.PacchettoAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.progetto_si.Pacchetto.Pacchetto selectedPacchetto;
    
    public GestionePacchettiActivity() {
        super();
    }
    
    private final com.example.progetto_si.Pacchetto.PacchettoViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showEditPacchettoDialog(com.example.progetto_si.Pacchetto.Pacchetto pacchetto) {
    }
    
    private final void mostraDialogAggiungiPacchetto() {
    }
    
    private final void eliminaPacchetto() {
    }
}