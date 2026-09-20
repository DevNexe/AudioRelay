package defpackage;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzbz;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class be6 extends ze6 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ zzbz B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be6(CQf cQf, Bundle bundle, zzbz zzbzVar) {
        super(cQf, true);
        this.D = cQf;
        this.C = bundle;
        this.B = zzbzVar;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = ((CQf) this.D).g;
                oa3.h(zzccVar);
                zzccVar.performAction((Bundle) this.C, this.B, this.w);
                break;
            default:
                zzcc zzccVar2 = ((qg6) this.D).w.g;
                oa3.h(zzccVar2);
                zzccVar2.onActivitySaveInstanceState(new ObjectWrapper((Activity) this.C), this.B, this.x);
                break;
        }
    }

    @Override // defpackage.ze6
    public final void b() {
        switch (this.A) {
            case 0:
                this.B.zzd(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be6(qg6 qg6Var, Activity activity, zzbz zzbzVar) {
        super(qg6Var.w, true);
        this.D = qg6Var;
        this.C = activity;
        this.B = zzbzVar;
    }
}
