package defpackage;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class qb6 extends ze6 {
    public final /* synthetic */ Activity A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String C;
    public final /* synthetic */ CQf D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb6(CQf cQf, Activity activity, String str, String str2) {
        super(cQf, true);
        this.D = cQf;
        this.A = activity;
        this.B = str;
        this.C = str2;
    }

    @Override // defpackage.ze6
    public final void a() {
        zzcc zzccVar = this.D.g;
        oa3.h(zzccVar);
        zzccVar.setCurrentScreen(new ObjectWrapper(this.A), this.B, this.C, this.w);
    }
}
