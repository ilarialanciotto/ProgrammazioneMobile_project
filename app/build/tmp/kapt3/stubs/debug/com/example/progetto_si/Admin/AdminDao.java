package com.example.progetto_si.Admin;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\'J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/example/progetto_si/Admin/AdminDao;", "", "checkAdmin", "", "email", "", "password", "getAdminByEmailAndPassword", "Lcom/example/progetto_si/Admin/Admin;", "getAdminById", "adminId", "getAllAdmins", "", "insert", "", "admin", "app_debug"})
@androidx.room.Dao()
public abstract interface AdminDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.progetto_si.Admin.Admin admin);
    
    @androidx.room.Query(value = "SELECT * FROM admin WHERE id = :adminId")
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.progetto_si.Admin.Admin getAdminById(int adminId);
    
    @androidx.room.Query(value = "SELECT * FROM admin WHERE email = :email AND password = :password")
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.progetto_si.Admin.Admin getAdminByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM admin WHERE email = :email AND password = :password")
    public abstract int checkAdmin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @androidx.room.Query(value = "SELECT * FROM admin")
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.progetto_si.Admin.Admin> getAllAdmins();
}