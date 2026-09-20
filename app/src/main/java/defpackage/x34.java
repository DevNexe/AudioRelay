package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x34<T> implements hh1 {
    public T a;
    public final Context b;
    public final z34 c;
    public final ih3 d;
    public ta2 e;
    public final eh1 f;

    public x34(Context context, z34 z34Var, ih3 ih3Var, eh1 eh1Var) {
        this.b = context;
        this.c = z34Var;
        this.d = ih3Var;
        this.f = eh1Var;
    }

    public final void b(kh1 kh1Var) {
        z34 z34Var = this.c;
        ih3 ih3Var = this.d;
        if (ih3Var == null) {
            this.f.handleError(s91.b(z34Var));
        } else {
            AdRequest adRequestBuild = new AdRequest.Builder().setAdInfo(new AdInfo(ih3Var.b, z34Var.d)).build();
            this.e.x = kh1Var;
            c(adRequestBuild);
        }
    }

    public abstract void c(AdRequest adRequest);
}
