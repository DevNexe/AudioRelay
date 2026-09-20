package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {53, 54}, m = "processException")
public final class qe1 extends b90 {
    public gg1 A;
    public Iterator B;
    public /* synthetic */ Object C;
    public final /* synthetic */ pe1 D;
    public int E;
    public Throwable z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe1(pe1 pe1Var, z80<? super qe1> z80Var) {
        super(z80Var);
        this.D = pe1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return pe1.a(this.D, null, null, this);
    }
}
