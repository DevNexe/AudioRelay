package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 implements sb2 {
    public final int a;
    public final int b;
    public final Map<IlK, Integer> c;
    public final /* synthetic */ int d;
    public final /* synthetic */ vb2 e;
    public final /* synthetic */ j81<b43.QnHx, sd5> f;

    public ub2(int i, int i2, vb2 vb2Var, Map map, j81 j81Var) {
        this.d = i;
        this.e = vb2Var;
        this.f = j81Var;
        this.a = i;
        this.b = i2;
        this.c = map;
    }

    @Override // defpackage.sb2
    public final void a() {
        b43.QnHx.C0045QnHx c0045QnHx = b43.QnHx.a;
        jy1 layoutDirection = this.e.getLayoutDirection();
        c0045QnHx.getClass();
        int i = b43.QnHx.c;
        c0045QnHx.getClass();
        jy1 jy1Var = b43.QnHx.b;
        b43.QnHx.c = this.d;
        b43.QnHx.b = layoutDirection;
        this.f.invoke(c0045QnHx);
        b43.QnHx.c = i;
        b43.QnHx.b = jy1Var;
    }

    @Override // defpackage.sb2
    public final Map<IlK, Integer> c() {
        return this.c;
    }

    @Override // defpackage.sb2
    public final int getHeight() {
        return this.b;
    }

    @Override // defpackage.sb2
    public final int getWidth() {
        return this.a;
    }
}
