package defpackage;

import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class we6 extends ze6 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ CQf E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we6(CQf cQf, String str, String str2, Object obj, boolean z) {
        super(cQf, true);
        this.E = cQf;
        this.A = str;
        this.B = str2;
        this.C = obj;
        this.D = z;
    }

    @Override // defpackage.ze6
    public final void a() {
        zzcc zzccVar = this.E.g;
        oa3.h(zzccVar);
        zzccVar.setUserProperty(this.A, this.B, new ObjectWrapper(this.C), this.D, this.w);
    }
}
