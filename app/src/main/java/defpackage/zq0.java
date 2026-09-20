package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zq0 {
    public static final nb5<wm0> a = new nb5<>(120, nq0.a, 2);
    public static final nb5<wm0> b = new nb5<>(150, new vc0(0.6f), 2);
    public static final nb5<wm0> c = new nb5<>(120, new vc0(0.6f), 2);

    /* JADX WARN: Code duplicated, block: B:27:0x002f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0032  */
    public static final Object a(OVbg<wm0, ?> oVbg, float f, vp1 vp1Var, vp1 vp1Var2, z80<? super sd5> z80Var) {
        nb5<wm0> nb5Var;
        if (vp1Var2 != null) {
            if ((vp1Var2 instanceof qd3) || (vp1Var2 instanceof nn0) || (vp1Var2 instanceof hd1) || (vp1Var2 instanceof j21)) {
                nb5Var = a;
            } else {
                nb5Var = null;
            }
        } else if (vp1Var == null) {
            nb5Var = null;
        } else if ((vp1Var instanceof qd3) || (vp1Var instanceof nn0)) {
            nb5Var = b;
        } else if (vp1Var instanceof hd1) {
            nb5Var = c;
        } else if (vp1Var instanceof j21) {
            nb5Var = b;
        } else {
            nb5Var = null;
        }
        nb5<wm0> nb5Var2 = nb5Var;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        if (nb5Var2 != null) {
            Object objC = OVbg.c(oVbg, new wm0(f), nb5Var2, null, z80Var, 12);
            return objC == va0Var ? objC : sd5.a;
        }
        Object objE = oVbg.e(new wm0(f), z80Var);
        return objE == va0Var ? objE : sd5.a;
    }
}
