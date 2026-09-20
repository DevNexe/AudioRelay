package defpackage;

import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcib;

/* JADX INFO: loaded from: classes3.dex */
public final class x86 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ zzcia x;

    public /* synthetic */ x86(zzcia zzciaVar, int i) {
        this.w = i;
        this.x = zzciaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        zzcia zzciaVar = this.x;
        switch (i) {
            case 0:
                zzcib zzcibVar = zzciaVar.L;
                if (zzcibVar != null) {
                    zzcibVar.zza();
                }
                break;
            default:
                zzcib zzcibVar2 = zzciaVar.L;
                if (zzcibVar2 != null) {
                    zzcibVar2.zzd();
                }
                break;
        }
    }
}
