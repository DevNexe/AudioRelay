package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gi0<Inputs, Events, State> implements u7<Inputs, Events, State> {
    public final State a;
    public final eo1<Inputs, Events, State> b;
    public final List<j7<Inputs, Events, State>> c;
    public final po1<Inputs, Events, State> d;
    public final oa0 e;
    public final oa0 f;
    public final oa0 g;
    public final oa0 h;
    public final String i;
    public final m7 j;

    /* JADX WARN: Multi-variable type inference failed */
    public gi0(Object obj, eo1 eo1Var, do1 do1Var, ArrayList arrayList, po1 po1Var, oa0 oa0Var, oa0 oa0Var2, oa0 oa0Var3, oa0 oa0Var4, String str, m7 m7Var) {
        this.a = obj;
        this.b = eo1Var;
        this.c = arrayList;
        this.d = po1Var;
        this.e = oa0Var;
        this.f = oa0Var2;
        this.g = oa0Var3;
        this.h = oa0Var4;
        this.i = str;
        this.j = m7Var;
    }

    @Override // defpackage.u7
    public final State a() {
        return this.a;
    }

    @Override // defpackage.u7
    public final m7 b() {
        return this.j;
    }

    @Override // defpackage.u7
    public final oa0 c() {
        return this.e;
    }

    @Override // defpackage.u7
    public final List<j7<Inputs, Events, State>> d() {
        return this.c;
    }

    @Override // defpackage.u7
    public final oa0 e() {
        return this.g;
    }

    @Override // defpackage.u7
    public final oa0 f() {
        return this.h;
    }

    @Override // defpackage.u7
    public final oa0 g() {
        return this.f;
    }

    @Override // defpackage.u7
    public final do1<Inputs, Events, State> getFilter() {
        return null;
    }

    @Override // defpackage.u7
    public final String getName() {
        return this.i;
    }

    @Override // defpackage.u7
    public final po1<Inputs, Events, State> h() {
        return this.d;
    }

    @Override // defpackage.u7
    public final eo1<Inputs, Events, State> i() {
        return this.b;
    }
}
