package defpackage;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.CQf;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class zb6 extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zb6(CQf cQf, Object obj, int i) {
        super(cQf, true);
        this.A = i;
        this.B = cQf;
        this.C = obj;
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                if (((Boolean) this.C) == null) {
                    zzcc zzccVar = ((CQf) this.B).g;
                    oa3.h(zzccVar);
                    zzccVar.clearMeasurementEnabled(this.w);
                } else {
                    zzcc zzccVar2 = ((CQf) this.B).g;
                    oa3.h(zzccVar2);
                    zzccVar2.setMeasurementEnabled(((Boolean) this.C).booleanValue(), this.w);
                }
                break;
            case 1:
                zzcc zzccVar3 = ((CQf) this.B).g;
                oa3.h(zzccVar3);
                zzccVar3.beginAdUnitExposure((String) this.C, this.x);
                break;
            default:
                zzcc zzccVar4 = ((qg6) this.B).w.g;
                oa3.h(zzccVar4);
                zzccVar4.onActivityResumed(new ObjectWrapper((Activity) this.C), this.x);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb6(qg6 qg6Var, Activity activity) {
        super(qg6Var.w, true);
        this.A = 2;
        this.B = qg6Var;
        this.C = activity;
    }
}
