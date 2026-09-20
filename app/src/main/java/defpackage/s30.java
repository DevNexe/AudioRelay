package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s30 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j30 w;
    public final /* synthetic */ List<y81<jE<?>, mn4, xl3, sd5>> x;
    public final /* synthetic */ kn4 y;
    public final /* synthetic */ ih2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s30(j30 j30Var, ArrayList arrayList, kn4 kn4Var, ih2 ih2Var) {
        super(0);
        this.w = j30Var;
        this.x = arrayList;
        this.y = kn4Var;
        this.z = ih2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        List<y81<jE<?>, mn4, xl3, sd5>> list = this.x;
        kn4 kn4Var = this.y;
        ih2 ih2Var = this.z;
        j30 j30Var = this.w;
        List<y81<jE<?>, mn4, xl3, sd5>> list2 = j30Var.e;
        try {
            j30Var.e = list;
            kn4 kn4Var2 = j30Var.D;
            int[] iArr = j30Var.n;
            j30Var.n = null;
            try {
                j30Var.D = kn4Var;
                j30.K(j30Var, ih2Var.a, ih2Var.g, ih2Var.b);
                sd5 sd5Var = sd5.a;
                j30Var.D = kn4Var2;
                j30Var.n = iArr;
                j30Var.e = list2;
                return sd5.a;
            } catch (Throwable th) {
                j30Var.D = kn4Var2;
                j30Var.n = iArr;
                throw th;
            }
        } catch (Throwable th2) {
            j30Var.e = list2;
            throw th2;
        }
    }
}
