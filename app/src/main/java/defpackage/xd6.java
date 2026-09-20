package defpackage;

import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class xd6 extends ze6 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ zzbz D;
    public final /* synthetic */ CQf E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd6(CQf cQf, String str, String str2, boolean z, zzbz zzbzVar) {
        super(cQf, true);
        this.E = cQf;
        this.A = str;
        this.B = str2;
        this.C = z;
        this.D = zzbzVar;
    }

    @Override // defpackage.ze6
    public final void a() {
        zzcc zzccVar = this.E.g;
        oa3.h(zzccVar);
        zzccVar.getUserProperties(this.A, this.B, this.C, this.D);
    }

    @Override // defpackage.ze6
    public final void b() {
        this.D.zzd(null);
    }
}
