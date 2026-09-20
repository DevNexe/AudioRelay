package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b12 implements y02, sb2 {
    public final v12 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<k02> e;
    public final int f;
    public final int g;
    public final /* synthetic */ sb2 h;

    public b12(v12 v12Var, int i, boolean z, float f, sb2 sb2Var, List list, int i2, int i3) {
        this.a = v12Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = list;
        this.f = i2;
        this.g = i3;
        this.h = sb2Var;
    }

    @Override // defpackage.sb2
    public final void a() {
        this.h.a();
    }

    @Override // defpackage.y02
    public final int b() {
        return this.f;
    }

    @Override // defpackage.sb2
    public final Map<IlK, Integer> c() {
        return this.h.c();
    }

    @Override // defpackage.y02
    public final int d() {
        return this.g;
    }

    @Override // defpackage.y02
    public final List<k02> e() {
        return this.e;
    }

    @Override // defpackage.sb2
    public final int getHeight() {
        return this.h.getHeight();
    }

    @Override // defpackage.sb2
    public final int getWidth() {
        return this.h.getWidth();
    }
}
