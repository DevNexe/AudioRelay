package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.compose.LocalBreakpointObserverKt$ProvideLocalBreakpointObserver$1$1", f = "LocalBreakpointObserver.kt", l = {}, m = "invokeSuspend")
public final class q42 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public final /* synthetic */ ij0 A;
    public final /* synthetic */ ri2<af> B;
    public final /* synthetic */ List<af> C;
    public final /* synthetic */ se D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q42(ij0 ij0Var, ri2<af> ri2Var, List<? extends af> list, se seVar, z80<? super q42> z80Var) {
        super(2, z80Var);
        this.A = ij0Var;
        this.B = ri2Var;
        this.C = list;
        this.D = seVar;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new q42(this.A, this.B, this.C, this.D, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object next;
        C0239D.H(obj);
        Iterator<T> it = this.C.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(Float.compare(this.A.j(g70.h(this.D.a())), ((af) next).w) >= 0));
        af afVar = (af) next;
        if (afVar == null) {
            afVar = af.x;
        }
        this.B.setValue(afVar);
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((q42) a(ua0Var, z80Var)).i(sd5.a);
    }
}
