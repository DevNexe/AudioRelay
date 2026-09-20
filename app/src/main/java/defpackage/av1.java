package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
@if0(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
public final class av1 extends b90 {
    public bv1 A;
    public LinkedHashMap B;
    public String C;
    public /* synthetic */ Object D;
    public final /* synthetic */ bv1 E;
    public int F;
    public zf0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av1(bv1 bv1Var, z80<? super av1> z80Var) {
        super(z80Var);
        this.E = bv1Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return bv1.a(this.E, null, this);
    }
}
