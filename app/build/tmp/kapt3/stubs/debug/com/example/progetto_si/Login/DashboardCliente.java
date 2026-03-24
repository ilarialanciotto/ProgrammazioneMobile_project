package com.example.progetto_si.Login;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002J \u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0015J\u0018\u0010)\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\u0018\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0003J \u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0003J\b\u00102\u001a\u00020&H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00063"}, d2 = {"Lcom/example/progetto_si/Login/DashboardCliente;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "RW1", "Landroidx/recyclerview/widget/RecyclerView;", "RW2", "btnToggleCalendar", "Landroid/widget/Button;", "calendar", "Landroid/widget/CalendarView;", "clienteViewModel", "Lcom/example/progetto_si/Cliente/Room/ClienteViewModel;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "isCalendarVisible", "", "noteViewModel", "Lcom/example/progetto_si/Note/NoteViewModel;", "password", "", "textView6", "Landroid/widget/TextView;", "textView7", "username", "viewModel", "Lcom/example/progetto_si/Pacchetto/PacchettoViewModel;", "getViewModel", "()Lcom/example/progetto_si/Pacchetto/PacchettoViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "formatDate", "year", "", "month", "day", "handleFabAction", "actionId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFab", "showNoteDialog", "data", "showNotePopup", "view", "Landroid/view/View;", "noteId", "layout", "Landroid/widget/LinearLayout;", "toggleCalendarVisibility", "app_debug"})
public final class DashboardCliente extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.CalendarView calendar;
    private android.widget.Button btnToggleCalendar;
    private com.google.android.material.floatingactionbutton.FloatingActionButton fab;
    private androidx.recyclerview.widget.RecyclerView RW1;
    private androidx.recyclerview.widget.RecyclerView RW2;
    private android.widget.TextView textView6;
    private android.widget.TextView textView7;
    private com.example.progetto_si.Cliente.Room.ClienteViewModel clienteViewModel;
    private com.example.progetto_si.Note.NoteViewModel noteViewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isCalendarVisible = false;
    private java.lang.String username;
    private java.lang.String password;
    
    public DashboardCliente() {
        super();
    }
    
    private final com.example.progetto_si.Pacchetto.PacchettoViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void toggleCalendarVisibility() {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final void setupFab(java.lang.String username, java.lang.String password) {
    }
    
    private final boolean handleFabAction(int actionId, java.lang.String username, java.lang.String password) {
        return false;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final void showNoteDialog(java.lang.String data, java.lang.String username) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.Q)
    private final void showNotePopup(android.view.View view, int noteId, android.widget.LinearLayout layout) {
    }
    
    private final java.lang.String formatDate(int year, int month, int day) {
        return null;
    }
}