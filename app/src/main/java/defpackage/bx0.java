package defpackage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class bx0 implements po1, i91, qf6 {
    public static ej1 x;
    public static final pa4[] w = new pa4[0];
    public static final /* synthetic */ bx0 y = new bx0();

    public static final Set d(pa4 pa4Var) {
        if (pa4Var instanceof al) {
            return ((al) pa4Var).b();
        }
        HashSet hashSet = new HashSet(pa4Var.f());
        int iF = pa4Var.f();
        for (int i = 0; i < iF; i++) {
            hashSet.add(pa4Var.g(i));
        }
        return hashSet;
    }

    public static final pa4[] e(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return list != null ? (pa4[]) list.toArray(new pa4[0]) : w;
    }

    public static final fv1 f(sv1 sv1Var) {
        gv1 gv1VarD = sv1Var.d();
        if (gv1VarD instanceof fv1) {
            return (fv1) gv1VarD;
        }
        if (!(gv1VarD instanceof uv1)) {
            throw new IllegalStateException(("Only KClass supported as classifier, got " + gv1VarD).toString());
        }
        throw new IllegalStateException(("Captured type paramerer " + gv1VarD + " from generic non-reified function. Such functionality cannot be supported as " + gv1VarD + " is erased, either specify serializer explicitly or make calling function inline with reified " + gv1VarD).toString());
    }

    public static final void g(fv1 fv1Var) {
        throw new SerializationException("Serializer for class '" + fv1Var.a() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final Object h(j81 j81Var, b90 b90Var) {
        zj1 zj1Var = (zj1) b90Var.getContext().j(zj1.QnHx.w);
        return zj1Var == null ? fp1.E0(j81Var, b90Var) : zj1Var.a0();
    }

    @Override // defpackage.po1
    public NUlFixed a() {
        return AY.a(-2, lg.SUSPEND, 4);
    }

    @Override // defpackage.i91
    public Object apply(Object obj) {
        fu1 fu1Var = (fu1) obj;
        gq0.QnHx qnHx = gq0.x;
        kq0 kq0Var = kq0.SECONDS;
        return new x61(ps0.p0(fu1Var.a, kq0Var), ps0.p0(fu1Var.b, kq0Var));
    }

    @Override // defpackage.po1
    public Object b(ro1 ro1Var, mz0 mz0Var, z80 z80Var) {
        Object objA = mz0Var.a(new ax0(ro1Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }

    @Override // defpackage.po1
    public boolean c() {
        return true;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Long.valueOf(b67.x.zza().zzs());
    }
}
