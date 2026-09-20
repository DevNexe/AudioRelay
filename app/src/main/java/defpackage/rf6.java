package defpackage;

import android.app.Activity;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzcc;

/* JADX INFO: loaded from: classes3.dex */
public final class rf6 extends ze6 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Activity B;
    public final /* synthetic */ qg6 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf6(qg6 qg6Var, Activity activity, int i) {
        super(qg6Var.w, true);
        this.A = i;
        if (i != 1) {
            this.C = qg6Var;
            this.B = activity;
        } else {
            this.C = qg6Var;
            this.B = activity;
            super(qg6Var.w, true);
        }
    }

    @Override // defpackage.ze6
    public final void a() {
        switch (this.A) {
            case 0:
                zzcc zzccVar = this.C.w.g;
                oa3.h(zzccVar);
                zzccVar.onActivityStarted(new ObjectWrapper(this.B), this.x);
                break;
            default:
                zzcc zzccVar2 = this.C.w.g;
                oa3.h(zzccVar2);
                zzccVar2.onActivityStopped(new ObjectWrapper(this.B), this.x);
                break;
        }
    }
}
