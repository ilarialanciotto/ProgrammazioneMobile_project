package com.example.progetto_si.ClassiUtili;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/progetto_si/ClassiUtili/ClienteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/progetto_si/ClassiUtili/ClienteAdapter$ClienteViewHolder;", "acqWM", "Lcom/example/progetto_si/Acquisti/AcquistiViewModel;", "(Lcom/example/progetto_si/Acquisti/AcquistiViewModel;)V", "clienti", "", "Lcom/example/progetto_si/Cliente/Room/Cliente;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "submitList", "newClienti", "ClienteViewHolder", "app_debug"})
public final class ClienteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.progetto_si.ClassiUtili.ClienteAdapter.ClienteViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.example.progetto_si.Acquisti.AcquistiViewModel acqWM;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.progetto_si.Cliente.Room.Cliente> clienti;
    
    public ClienteAdapter(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Acquisti.AcquistiViewModel acqWM) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.progetto_si.ClassiUtili.ClienteAdapter.ClienteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.ClassiUtili.ClienteAdapter.ClienteViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void submitList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.progetto_si.Cliente.Room.Cliente> newClienti) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/example/progetto_si/ClassiUtili/ClienteAdapter$ClienteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "emailTextView", "Landroid/widget/TextView;", "nomeTextView", "pacchettiTextView", "getPacchettiTextView", "()Landroid/widget/TextView;", "bind", "", "cliente", "Lcom/example/progetto_si/Cliente/Room/Cliente;", "app_debug"})
    public static final class ClienteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView nomeTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView emailTextView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView pacchettiTextView = null;
        
        public ClienteViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPacchettiTextView() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.progetto_si.Cliente.Room.Cliente cliente) {
        }
    }
}