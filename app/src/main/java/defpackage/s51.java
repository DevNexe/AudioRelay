package defpackage;

import android.os.Bundle;
import androidx.fragment.app.MZ;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
public final class s51 implements z24.CQf {
    public final /* synthetic */ u51 a;

    public s51(u51 u51Var) {
        this.a = u51Var;
    }

    @Override // z24.CQf
    public final Bundle a() {
        u51 u51Var;
        Bundle bundle = new Bundle();
        do {
            u51Var = this.a;
        } while (u51.j(u51Var.K.a.z));
        u51Var.L.f(YKK.CQf.ON_STOP);
        MZ mzS = u51Var.K.a.z.S();
        if (mzS != null) {
            bundle.putParcelable("android:support:fragments", mzS);
        }
        return bundle;
    }
}
