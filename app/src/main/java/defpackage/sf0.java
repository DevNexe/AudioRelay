package defpackage;

import java.net.DatagramSocket;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf0 implements i91 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ sf0(Object obj, Object obj2, Object obj3, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
    }

    @Override // defpackage.i91
    public final Object apply(Object obj) {
        Sb1 sb1;
        int i = this.w;
        Object obj2 = this.z;
        Object obj3 = this.y;
        Object obj4 = this.x;
        switch (i) {
            case 0:
                tf0 tf0Var = (tf0) obj4;
                e61 e61Var = (e61) obj3;
                c54 c54Var = (c54) obj2;
                u50 u50Var = (u50) obj;
                s50 s50Var = u50Var.a;
                if (s50Var == null || (sb1 = u50Var.b) == null) {
                    return cx.w;
                }
                return s50Var.a.b.a != null ? new uw(new v9L(tf0Var, sb1, e61Var, 2)).i(c54Var) : new uw(new Z7O(3, e61Var, tf0Var)).i(c54Var);
            default:
                return new uw(new v9L((ub4) obj4, (DatagramSocket) obj3, (List) obj2, 4));
        }
    }
}
