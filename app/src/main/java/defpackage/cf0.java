package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cf0 {
    public final dx4.F1 a;
    public final Context b;
    public final String c;
    public final at3.F1 d;
    public final List<at3.CQf> e;
    public final Executor f;
    public final Executor g;
    public final boolean h;
    public final boolean i;

    public cf0(Context context, String str, dx4.F1 f1, at3.F1 f2, ArrayList arrayList, boolean z, int i, Executor executor, Executor executor2, boolean z2, boolean z3) {
        this.a = f1;
        this.b = context;
        this.c = str;
        this.d = f2;
        this.e = arrayList;
        this.f = executor;
        this.g = executor2;
        this.h = z2;
        this.i = z3;
    }

    public final boolean a(int i, int i2) {
        return !((i > i2) && this.i) && this.h;
    }
}
