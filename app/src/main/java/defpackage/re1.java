package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {47}, m = "validateResponse")
public final class re1 extends b90 {
    public Iterator A;
    public /* synthetic */ Object B;
    public final /* synthetic */ pe1 C;
    public int D;
    public qg1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re1(pe1 pe1Var, z80<? super re1> z80Var) {
        super(z80Var);
        this.C = pe1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return pe1.b(this.C, null, this);
    }
}
