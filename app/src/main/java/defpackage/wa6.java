package defpackage;

import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class wa6 extends ze6 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ zzbz C;
    public final /* synthetic */ CQf D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa6(CQf cQf, String str, String str2, zzbz zzbzVar) {
        super(cQf, true);
        this.D = cQf;
        this.A = str;
        this.B = str2;
        this.C = zzbzVar;
    }

    @Override // defpackage.ze6
    public final void a() {
        zzcc zzccVar = this.D.g;
        oa3.h(zzccVar);
        zzccVar.getConditionalUserProperties(this.A, this.B, this.C);
    }

    @Override // defpackage.ze6
    public final void b() {
        this.C.zzd(null);
    }
}
