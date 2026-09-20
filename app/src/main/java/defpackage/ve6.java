package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class ve6 extends ze6 {
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Bundle D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ CQf G;
    public final /* synthetic */ Long A = null;
    public final /* synthetic */ boolean F = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve6(CQf cQf, String str, String str2, Bundle bundle, boolean z) {
        super(cQf, true);
        this.G = cQf;
        this.B = str;
        this.C = str2;
        this.D = bundle;
        this.E = z;
    }

    @Override // defpackage.ze6
    public final void a() {
        Long l = this.A;
        long jLongValue = l == null ? this.w : l.longValue();
        zzcc zzccVar = this.G.g;
        oa3.h(zzccVar);
        zzccVar.logEvent(this.B, this.C, this.D, this.E, this.F, jLongValue);
    }
}
