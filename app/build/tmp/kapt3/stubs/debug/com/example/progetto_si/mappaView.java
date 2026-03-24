package com.example.progetto_si;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J-\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\f2\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0011H\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002R \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/progetto_si/mappaView;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/location/LocationListener;", "()V", "SedeLocations", "", "Lkotlin/Pair;", "", "Lorg/osmdroid/util/GeoPoint;", "locationManager", "Landroid/location/LocationManager;", "locationPermissionCode", "", "mapView", "Lorg/osmdroid/views/MapView;", "userLocation", "addSedeMarkers", "", "pref", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLocationChanged", "location", "Landroid/location/Location;", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "startLocationUpdates", "trovaSedeVicina", "latitude", "", "longitude", "app_debug"})
public final class mappaView extends androidx.appcompat.app.AppCompatActivity implements android.location.LocationListener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.Pair<java.lang.String, org.osmdroid.util.GeoPoint>> SedeLocations = null;
    private android.location.LocationManager locationManager;
    private final int locationPermissionCode = 1;
    private org.osmdroid.views.MapView mapView;
    @org.jetbrains.annotations.Nullable()
    private org.osmdroid.util.GeoPoint userLocation;
    
    public mappaView() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startLocationUpdates() {
    }
    
    private final org.osmdroid.util.GeoPoint trovaSedeVicina(double latitude, double longitude) {
        return null;
    }
    
    @java.lang.Override()
    public void onLocationChanged(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void addSedeMarkers(org.osmdroid.util.GeoPoint pref) {
    }
}