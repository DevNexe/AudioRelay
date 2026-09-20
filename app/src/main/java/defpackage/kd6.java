package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class kd6 implements kw6 {
    public final /* synthetic */ fg6 a;

    public kd6(fg6 fg6Var) {
        this.a = fg6Var;
    }

    @Override // defpackage.kw6
    public final void a(long j, Bundle bundle, String str, String str2) {
        fg6 fg6Var = this.a;
        if (fg6Var.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            HashSet hashSet = a76.a;
            String strN = C0239D.N(str2, v3A.C, v3A.A);
            if (strN != null) {
                str2 = strN;
            }
            bundle2.putString("events", str2);
            ((cb0) fg6Var.b).a(2, bundle2);
        }
    }
}
