package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w34 implements hh1 {
    public final z34 a;
    public final hh3 b;
    public final eh1 c;

    public w34(Context context, z34 z34Var, hh3 hh3Var, eh1 eh1Var) {
        this.a = z34Var;
        this.b = hh3Var;
        this.c = eh1Var;
    }

    public final void b(kh1 kh1Var) {
        z34 z34Var = this.a;
        hh3 hh3Var = this.b;
        if (hh3Var != null) {
            c(new AdRequest.Builder().setAdInfo(new AdInfo(hh3Var.b, z34Var.d)).build(), kh1Var);
        } else {
            this.c.handleError(s91.b(z34Var));
        }
    }

    public abstract void c(AdRequest adRequest, kh1 kh1Var);
}
