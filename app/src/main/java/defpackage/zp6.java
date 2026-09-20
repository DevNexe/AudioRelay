package defpackage;

import com.google.android.gms.internal.ads.ct;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zp6 extends B8C {
    @Override // defpackage.B8C
    public final int T0(ct ctVar) {
        int i;
        synchronized (ctVar) {
            i = ctVar.E - 1;
            ctVar.E = i;
        }
        return i;
    }

    @Override // defpackage.B8C
    public final void U0(ct ctVar, Set set) {
        synchronized (ctVar) {
            if (ctVar.D == null) {
                ctVar.D = set;
            }
        }
    }
}
