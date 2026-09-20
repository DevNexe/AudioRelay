package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qa7 extends uw5 {
    public final /* synthetic */ c47 A;
    public final boolean y;
    public final boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa7(c47 c47Var, boolean z, boolean z2) {
        super("log");
        this.A = c47Var;
        this.y = z;
        this.z = z2;
    }

    @Override // defpackage.uw5
    public final ez5 d(ma5 ma5Var, List list) {
        int i;
        nw6.i("log", 1, list);
        int size = list.size();
        n06 n06Var = ez5.o;
        c47 c47Var = this.A;
        if (size == 1) {
            ((pq2) c47Var.z).m(3, ma5Var.b((ez5) list.get(0)).zzi(), Collections.emptyList(), this.y, this.z);
            return n06Var;
        }
        int iB = nw6.b(ma5Var.b((ez5) list.get(0)).zzh().doubleValue());
        if (iB == 2) {
            i = 4;
        } else if (iB == 3) {
            i = 1;
        } else if (iB != 5) {
            i = iB != 6 ? 3 : 2;
        } else {
            i = 5;
        }
        String strZzi = ma5Var.b((ez5) list.get(1)).zzi();
        if (list.size() == 2) {
            ((pq2) c47Var.z).m(i, strZzi, Collections.emptyList(), this.y, this.z);
            return n06Var;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(ma5Var.b((ez5) list.get(i2)).zzi());
        }
        ((pq2) c47Var.z).m(i, strZzi, arrayList, this.y, this.z);
        return n06Var;
    }
}
