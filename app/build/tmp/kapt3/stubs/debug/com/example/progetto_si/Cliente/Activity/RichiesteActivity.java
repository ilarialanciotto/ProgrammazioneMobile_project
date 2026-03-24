package com.example.progetto_si.Cliente.Activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/progetto_si/Cliente/Activity/RichiesteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "noteAdapter", "Lcom/example/progetto_si/Note/NoteAdapter;", "noteViewModel", "Lcom/example/progetto_si/Note/NoteViewModel;", "getNoteViewModel", "()Lcom/example/progetto_si/Note/NoteViewModel;", "noteViewModel$delegate", "Lkotlin/Lazy;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "username", "", "isActivityActive", "", "loadNotes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RichiesteActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.progetto_si.Note.NoteAdapter noteAdapter;
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy noteViewModel$delegate = null;
    
    public RichiesteActivity() {
        super();
    }
    
    private final com.example.progetto_si.Note.NoteViewModel getNoteViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadNotes() {
    }
    
    /**
     * Funzione per verificare se l'Activity è attiva.
     */
    private final boolean isActivityActive() {
        return false;
    }
}