package com.example.progetto_si.ClassiUtili;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/progetto_si/ClassiUtili/PacchettoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/progetto_si/ClassiUtili/PacchettoAdapter$PacchettoViewHolder;", "showBoolean", "", "onClick", "Lkotlin/Function1;", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "", "(ZLkotlin/jvm/functions/Function1;)V", "pacchettiList", "", "getItemAt", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "list", "PacchettoViewHolder", "app_debug"})
public final class PacchettoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.progetto_si.ClassiUtili.PacchettoAdapter.PacchettoViewHolder> {
    private final boolean showBoolean = false;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.progetto_si.Pacchetto.Pacchetto, kotlin.Unit> onClick = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.progetto_si.Pacchetto.Pacchetto> pacchettiList;
    
    public PacchettoAdapter(boolean showBoolean, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.progetto_si.Pacchetto.Pacchetto, kotlin.Unit> onClick) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.progetto_si.ClassiUtili.PacchettoAdapter.PacchettoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.ClassiUtili.PacchettoAdapter.PacchettoViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.progetto_si.Pacchetto.Pacchetto> list) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.progetto_si.Pacchetto.Pacchetto getItemAt(int position) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/progetto_si/ClassiUtili/PacchettoAdapter$PacchettoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "showBoolean", "", "onClick", "Lkotlin/Function1;", "Lcom/example/progetto_si/Pacchetto/Pacchetto;", "", "(Landroid/view/View;ZLkotlin/jvm/functions/Function1;)V", "btnAcquista", "Landroid/widget/Button;", "descrionePacchetto", "Landroid/widget/TextView;", "nomeTextView", "pacchetto", "prezzoTextView", "bind", "app_debug"})
    public static final class PacchettoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final boolean showBoolean = false;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<com.example.progetto_si.Pacchetto.Pacchetto, kotlin.Unit> onClick = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nomeTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView prezzoTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.Button btnAcquista = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView descrionePacchetto = null;
        @org.jetbrains.annotations.Nullable()
        private com.example.progetto_si.Pacchetto.Pacchetto pacchetto;
        
        public PacchettoViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view, boolean showBoolean, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.progetto_si.Pacchetto.Pacchetto, kotlin.Unit> onClick) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.progetto_si.Pacchetto.Pacchetto pacchetto) {
        }
    }
}