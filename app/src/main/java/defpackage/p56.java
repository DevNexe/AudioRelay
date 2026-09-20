package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.QnHx;
import com.google.android.gms.internal.ads.zzbrk;
import com.google.android.gms.internal.ads.zzchf;

/* JADX INFO: loaded from: classes3.dex */
public final class p56 implements QnHx.InterfaceC0075QnHx {
    public final /* synthetic */ zzchf a;
    public final /* synthetic */ zzbrk b;

    public p56(zzbrk zzbrkVar, zzchf zzchfVar) {
        this.b = zzbrkVar;
        this.a = zzchfVar;
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnected(Bundle bundle) {
        try {
            this.a.zzd(this.b.a.zzp());
        } catch (DeadObjectException e) {
            this.a.zze(e);
        }
    }

    @Override // com.google.android.gms.common.internal.QnHx.InterfaceC0075QnHx
    public final void onConnectionSuspended(int i) {
        this.a.zze(new RuntimeException(GM.a("onConnectionSuspended: ", i)));
    }
}
