package com.example.progetto_si.Note;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u000fJ2\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\u000fJ0\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0016\u0012\u0004\u0012\u00020\b0\u000fJ(\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0004\u0012\u00020\b0\u000fJ\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00160\u001a2\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/progetto_si/Note/NoteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "notaDao", "Lcom/example/progetto_si/Note/NoteDao;", "deleteNota", "", "nota", "Lcom/example/progetto_si/Note/Note;", "getNota", "id", "", "callback", "Lkotlin/Function1;", "getNoteId", "dt", "", "nt", "user", "getNotesByDate", "", "getNotesByUser", "email", "getNotesByUsername", "Landroidx/lifecycle/LiveData;", "username", "insert", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.progetto_si.Note.NoteDao notaDao = null;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.progetto_si.Note.Note>> getNotesByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Note.Note nota) {
    }
    
    public final void getNotesByDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dt, @org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit> callback) {
    }
    
    public final void getNoteId(@org.jetbrains.annotations.NotNull()
    java.lang.String dt, @org.jetbrains.annotations.NotNull()
    java.lang.String nt, @org.jetbrains.annotations.NotNull()
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> callback) {
    }
    
    public final void getNota(int id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.progetto_si.Note.Note, kotlin.Unit> callback) {
    }
    
    public final void deleteNota(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Note.Note nota) {
    }
    
    public final void getNotesByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.progetto_si.Note.Note>, kotlin.Unit> callback) {
    }
}