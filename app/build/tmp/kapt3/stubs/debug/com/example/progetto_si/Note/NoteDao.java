package com.example.progetto_si.Note;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bH\'J\'\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\'\u00a2\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\'J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\'J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0016\u001a\u00020\rH\'J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010\u0016\u001a\u00020\rH\'J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/example/progetto_si/Note/NoteDao;", "", "deleteNota", "", "nota", "Lcom/example/progetto_si/Note/Note;", "getNota", "id", "", "getNoteById", "noteId", "getNoteId", "dt", "", "nt", "user", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Integer;", "getNotes", "", "getNotesByDate", "", "getNotesByEmail", "email", "getNotesByUsername", "insertNote", "app_debug"})
@androidx.room.Dao()
public abstract interface NoteDao {
    
    @androidx.room.Insert()
    public abstract void insertNote(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Note.Note nota);
    
    @androidx.room.Query(value = "SELECT * FROM note WHERE email=:email")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Note.Note> getNotesByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @androidx.room.Query(value = "SELECT nota FROM note WHERE data=:dt AND email=:user ")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getNotesByDate(@org.jetbrains.annotations.NotNull()
    java.lang.String dt, @org.jetbrains.annotations.NotNull()
    java.lang.String user);
    
    @androidx.room.Query(value = "SELECT id FROM note WHERE email=:user AND data=:dt AND nota=:nt")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Integer getNoteId(@org.jetbrains.annotations.NotNull()
    java.lang.String dt, @org.jetbrains.annotations.NotNull()
    java.lang.String nt, @org.jetbrains.annotations.NotNull()
    java.lang.String user);
    
    @androidx.room.Query(value = "SELECT * FROM note WHERE id=:id")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.progetto_si.Note.Note getNota(int id);
    
    @androidx.room.Query(value = "SELECT * FROM note")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Note.Note> getNotes();
    
    @androidx.room.Delete()
    public abstract void deleteNota(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Note.Note nota);
    
    @androidx.room.Query(value = "SELECT * FROM note WHERE id = :noteId")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.progetto_si.Note.Note getNoteById(int noteId);
    
    @androidx.room.Query(value = "SELECT * FROM note WHERE email = :email")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Note.Note> getNotesByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}