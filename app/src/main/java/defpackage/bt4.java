package defpackage;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: loaded from: classes.dex */
public final class bt4 implements gt4 {
    @Override // defpackage.gt4
    public StaticLayout a(it4 it4Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(it4Var.a, it4Var.b, it4Var.c, it4Var.d, it4Var.e);
        builderObtain.setTextDirection(it4Var.f);
        builderObtain.setAlignment(it4Var.g);
        builderObtain.setMaxLines(it4Var.h);
        builderObtain.setEllipsize(it4Var.i);
        builderObtain.setEllipsizedWidth(it4Var.j);
        builderObtain.setLineSpacing(it4Var.l, it4Var.k);
        builderObtain.setIncludePad(it4Var.n);
        builderObtain.setBreakStrategy(it4Var.p);
        builderObtain.setHyphenationFrequency(it4Var.q);
        builderObtain.setIndents(it4Var.r, it4Var.s);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ct4.a.a(builderObtain, it4Var.m);
        }
        if (i >= 28) {
            et4.a.a(builderObtain, it4Var.o);
        }
        return builderObtain.build();
    }
}
