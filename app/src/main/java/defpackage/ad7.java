package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzxi;
import com.google.android.gms.internal.ads.zzxo;

/* JADX INFO: loaded from: classes3.dex */
public final class ad7 implements DisplayManager.DisplayListener, zc7 {
    public final DisplayManager w;
    public zzxi x;

    public ad7(DisplayManager displayManager) {
        this.w = displayManager;
    }

    @Override // defpackage.zc7
    public final void b(zzxi zzxiVar) {
        this.x = zzxiVar;
        Handler handlerZzD = zzel.zzD(null);
        DisplayManager displayManager = this.w;
        displayManager.registerDisplayListener(this, handlerZzD);
        zzxo.zzb(zzxiVar.zza, displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzxi zzxiVar = this.x;
        if (zzxiVar == null || i != 0) {
            return;
        }
        zzxo.zzb(zzxiVar.zza, this.w.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // defpackage.zc7
    /* JADX INFO: renamed from: zza */
    public final void mo45zza() {
        this.w.unregisterDisplayListener(this);
        this.x = null;
    }
}
